package Exam_04.ClassEnum;

import java.util.Calendar;

import Exam_04.Human03Enum;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); // 요일을 1~7로 표현
		//week이란 변수에는 오늘의 요일을 일요일부터 순서를 반환
		
		System.out.println(week);
		
		switch (week) {
		case 1 :
			today = Week.MON;
			break;
		case 2 :
			today = Week.THE;
			break;
		case 3 :
			today = Week.WED;
			break;
		case 4 :
			today = Week.THU;
			break;
		case 5 :
			today = Week.FRI;
			break;
		case 6 :
			today = Week.SAT;
			break;
		case 7 :
			today = Week.SUN;
			break;
		}
		System.out.println ("today : " + today);
		System.out.println ("today : " + today.name());
		System.out.println ("today : " + today.ordinal()); // 0부터 시작해서 현재의 위치를 숫자로 반환
		
		Week day1 = Week.MON; //2
		Week day2 = Week.THU; //5
		System.out.println ("day1.compareTo(day2) : " + day1.compareTo(day2));
		System.out.println ("day2.compareTo(day1) : " + day2.compareTo(day1));
		System.out.println ("day1.compareTo(day1) : " + day1.compareTo(day1));
		
		System.out.println(Week.values());
		System.out.println(Week.valueOf("SUN"));
		System.out.println(Week.FRI);
		
		Week [] days = Week.values(); // 1개의 값이 아닌 여러 개의 값이 넘어옴
		for (Week day : days) {
			System.out.println(day);
		}
		
	}

}
