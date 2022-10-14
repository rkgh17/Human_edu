from order import Order
from sales import Sales

class Menu:
    def __init__(self):
        self.lMenu=[]
        try:
            f=open('d:/Seoul_Class_1/menu.txt','r')
        except Exception as e:
            print('메뉴화일을 열수 없습니다.')
            return
        line=f.readline()
        while line!='':
            ar=line.split(',')
            self.lMenu.append({'name':ar[0],'price':int(ar[1])})
            line=f.readline()
        f.close()

    def display(self):
        ndx=1
        for menu in self.lMenu:
            print('%2d %-10s %4d'%(ndx,menu['name'],menu['price']))
            ndx+=1
    def save2file(self):
        f=open('d:/Seoul_Class_1/menu.txt','w')
        for menu in self.lMenu:
            f.write(menu['name']+','+str(menu['price'])+'\n')
        f.close()

    def build(self):
        name=input('메뉴명: ')
        while name!='':
            price=input('가격: ')
            while not price.isnumeric():
                price=input('가격: ')
            price=int(price)
            self.lMenu.append({'name':name,'price':price})
            name=input('메뉴명: ')
        self.save2file()

    def update(self): # 메뉴번호, 새이름, 새가격
        menu_num=input('메뉴번호: ')
        while not menu_num.isnumeric():    
            menu_num=input('메뉴번호: ')
        menu_num=int(menu_num)
        name=input('새 메뉴명: ')
        price=input('가격: ')
        while not price.isnumeric():
            price=input('가격: ')
        price=int(price)
        self.lMenu[menu_num-1]['name']=name
        self.lMenu[menu_num-1]['price']=price
        self.save2file()

    def delete(self):
        menu_num=input('삭제할 메뉴번호: ')
        while not menu_num.isnumeric():    
            menu_num=input('삭제할 메뉴번호: ')
        menu_num=int(menu_num)
        del self.lMenu[menu_num-1]
        self.save2file()

menu=Menu()  # 메뉴정보를 읽어서 초기화.
menu.display()
sales=Sales()

num=input('1.주문입력, 2.메뉴관리, '+\
    '3.실적보기, 0.프로그램 종료 : ')
while num!='0':
    if num=='1':
        order=Order()
        menu.display()
        order.build(menu.lMenu)
        # 매출실적에 추가 with order.lOrder, order.mobile
        sales.append(order.lOrder, order.mobile)
    elif num=='2':
        job=input('메뉴관리 - 1.추가,2.조회,3.수정,4.삭제,0.종료 : ')
        while job!='0':
            if job=='1':
                menu.build()
            elif job=='2':
                menu.display()
            elif job=='3':
                menu.update()
            elif job=='4':
                menu.delete()
            else:
                print('작업입력오류')
            job=input('메뉴관리 - 1.추가,2.조회,3.수정,4.삭제,0.종료 : ')
    elif num=='3':
        sales.display()
    else:
        print('작업입력오류')
    num=input('1.주문입력, 2.메뉴관리, '+\
        '3.실적보기, 0.프로그램 종료 : ')
print('프로그램 종료')   