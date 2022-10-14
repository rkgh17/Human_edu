f=open('d:/AI_Class/Python/file/menu/menu.txt','w')
while True:
    name=input('메뉴를 입력하시오 : ')
    if name=='':
        break
    price=int(input('가격을 입력하시오 : '))
    f.write(name+', '+str(price)+'\n')
print()

f.close()