menu=[]
print('-'*80)
f=open('d:/AI_Class/Python/file/menu/menu.txt','r')
line=f.readline()
while line!='':
    ar=line.split(',')
    m={'name':ar[0], 'price':int(ar[1])}
    menu.append(m)
    line=f.readline()
f.close()

for m in menu:
    ndx=1
    print('%2d | %-10s | %4d원'%(ndx, m['name'], m['price']))
    ndx+=1