from datetime import datetime

class Sales:
    
    def __init__(self):
        self.lsales=[]#매출 시각, 모바일번호, 메뉴명, 수량, 금액

    def append(self,orderList,mobile):
        now = datetime.now().strftime('%Y=%m=%d %H:%M:%S')
        for order in orderList:
            self.lsales.append({'sold_time':now,'mobile':mobile,'menu':order['menu'],'qty':order['qty'],'total':order['total']})

    def display(self):#총 실적확인
        grandTotal=0
        for sale in self.lsales:
            print('%-20s | %11s | %10s | %6s | %6s'%('Day','Mobile','Menu','Qty','Total'))
            print('%-20s | %11s | %10s | %6d | %6d'%(sale['sold_time'],sale['mobile'],sale['menu'],sale['qty'],sale['total']))
            grandTotal+=int(sale['total'])
        print('-'*60)
        print('총매출액 : '+str(grandTotal))