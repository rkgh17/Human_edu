package exam02;

import java.util.LinkedList;

public final class LinkedListExam {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Data1");
		System.out.println(list);
		
		list.add(1,"Data2");
		System.out.println(list);
		
		list.add(0,"Data3");
		System.out.println(list);
		
		list.addFirst("Data4");
		System.out.println(list);
		
		list.addLast("Data5");
		System.out.println(list);
		
		System.out.println(list.get(0));
		
		

	}

}
