package exam01;

import java.util.ArrayList;
import java.util.List;

public class Human {

	public static void main(String[] args) {
		List list1 = new ArrayList();
		// List는 인터페이스 = ArrayList는 구현클래스
		list1.add("HUMAN1");
		list1.add("HUMAN2");
//		list1.add("HUMAN3");
		list1.add(10);
		System.out.println(list1.get(0));
//		System.out.println(list1.get(0).getClass());

		String str1 = (String) list1.get(0);
		// Object의 형태로 나오기 때문에
		// 강제 타입 변환이 꼭 필요합.
		// Object는 상위, String은 하위
		
		System.out.println(str1);
		int intStr = (int) list1.get(2); // 캐스팅을 통한 정수반환
		System.out.println(list1.get(2));
		
		
		// 처음부터 String만 담겠다고 규정하면 강제타입변환이 필요 없음.
		List <String> list2 = new ArrayList<String>();
		// <String>만 담겠다란 정의. -> 제네릭 문법
		// list2에는 String만 담길 수 있으며, 다른 것이 들어오면 에러
		list2.add("HUMAN1");
		list2.add("HUMAN2");
		list2.add("HUMAN3");
		
		String str2 = list2.get(2);
		// 캐스팅이 없어도 에러 없음.
		
		
	}

}
