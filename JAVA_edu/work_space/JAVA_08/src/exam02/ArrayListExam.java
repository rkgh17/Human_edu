package exam02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		// default로 초기용량을 10으로 설정
		// 늘어나도 알아서 늘어남
		List<String> list2 = new ArrayList<String>(100);
		// 100
		List<String> list3 = Arrays.asList("a","b","c","d");
		// 컬랙션을 포함해서 초기화 가능
		// 수정 불가.
		System.out.println(list3.get(0));
		
		List<String> list4 = new ArrayList<String>();
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		list4.add("a");
		System.out.println(list4);
		// 초기용량 10이라도 11개부터는 알아서 늘림
		
		list1.add("휴먼");
		list1.add("교육");
		list1.add("센터");
		list1.add("휴먼");
		System.out.println(list1);
		list1.add(1,"영등포");
		// 정해진 위치에 추가
		System.out.println(list1);
		
		list1.set(1,"수원");
		// 정해진 위치에 변경
		System.out.println(list1);
		System.out.println(list2.isEmpty());
		// 비어있는지 아닌지 확인
		System.out.println(list4.size());
		System.out.println(list1.add("학원"));
		// 리턴값은 성공여부를 알려주기 때무에 boolean값이 표시된다
		System.out.println(list1);
		
		System.out.println(list1.remove(4));
		// 5번째의 휴먼 삭제
		System.out.println(list1.remove("수원"));
		System.out.println(list1);
		System.out.println(list1.remove("영등포"));
		// 없는것을 삭제하면 false => remove 성공여부 리턴
		
//		System.out.println(list1.clear()); // 출력불가
		list1.clear();
		// 리스트 내용 삭제
		System.out.println(list1);
	}

}
