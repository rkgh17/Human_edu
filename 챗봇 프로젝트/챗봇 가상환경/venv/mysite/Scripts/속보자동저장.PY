from selenium import webdriver
from selenium.webdriver.common.by import By
from datetime import date
import schedule
import json
import requests
import time
import psycopg2
import sys

# 알림전송 - Input DB
def input():
    
    now = time
    print(print("time log :", now.strftime('%Y-%m-%d %H:%M:%S')))

    # 오늘의 지하철 속보 검색
    # db연결
    conn = psycopg2.connect(host="ec2-23-21-207-93.compute-1.amazonaws.com", 
                            dbname="d3oubpekvnbupv", 
                            user="grxhirqndvyqvv", 
                            password="6f1afaafe16d245c70666bdb8c831aa876e62b380a1544f5dc832c51f27cece6", 
                            port="5432")

    # 데이터 조작 객체 생성
    cur = conn.cursor()
    time.sleep(3)

    # 오늘날짜의 지하철 이슈 찾아보기
    today = date.today().isoformat() + '%'

    # 조회해서 리스트(안에는 튜플)에 담기
    cur.execute(f"SELECT * FROM subaccdata WHERE acctime LIKE '{today}' order by acctime DESC")
    result_all = cur.fetchall()
    time.sleep(1)

    # 문자열로 파싱
    sbstr=""
    for i in result_all:
        for j in i:
            sbstr =  sbstr + j + "\n"
    
    sbstr = sbstr[:-1]
    time.sleep(2)

    # 셀레니움 headless로 창열기
    PATH = 'C:/Users/h/Desktop/chatbot/chromedriver.exe'
    chrome_options = webdriver.ChromeOptions()
    chrome_options.add_argument("headless")
    driver = webdriver.Chrome(PATH, options=chrome_options)
    # driver = webdriver.Chrome(PATH)
    time.sleep(6)

    # 지하철 속보 크롤링후 현재 데이터베이스 정보 sbstr과 다르면 insert

    # 지하철 속보 뽑기
    driver.get("https://safecity.seoul.go.kr/acdnt/sbwyIndex.do")
    time.sleep(4)

    # 데이터 긁어오기
    parentElement = driver.find_elements(By.XPATH, '//*[@id="dv_as_timeline"]/li')

    subli=[]

    # ul 태그 아래 있는 li 반복 뽑기
    for i in parentElement:
        i.click()
        time.sleep(0.05)
        a = i.text
        subli.append(a)
        i.click()
        
    time.sleep(8)

    substr=""
    for i in subli:
        i = i[6:]
        substr = substr + i + "\n"
    substr = substr[:-1]

    # 뽑아온 데이터와 오늘의 데이터가 다를때
    if substr != sbstr:

        # 속보가 없는건지 확인
        if len(subli[0]) == 12 :
            print("none")

        # 속보가 있으면 db에 넣기
        else:
            # driver.quit()
            time.sleep(5)

            #new db insert
            for i in subli:
                # slice 후 첫번째 요소 (지하철 사고) 제거 tuple화
                subdb = i.split('\n')
                subdb.pop(0)
                # ON CONFLICT : 데이터가 중복되면 INSERT하지않음
                cur.execute("INSERT into subaccdata(acctime, content) VALUES (%s, %s) ON CONFLICT (acctime, content) DO NOTHING", subdb)
            time.sleep(1)
            # db commit
            conn.commit()

            


    driver.quit()



def exit():
    sys.exit()


schedule.every(10).minutes.do(input)
schedule.every().day.at("17:00").do(exit)

while True:
    schedule.run_pending()
    time.sleep(1)