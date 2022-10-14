package exam17;

import java.io.IOException;

public class KeyboardToStringExam {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[10];
		System.out.print("입력 : ");
		int readByteNo = System.in.read(bytes);
		// 키보드에서 입력한 글자를 bytes의 배열변수에 담는 기능을 수행.
		// 다 끝나면.. 글자수를 반환합니다.
		// 엔터를 치는 순간 캐리지리턴(\r) + 라인피드(\n) 이 자동으로 붙음
		// 그래서 글자수보다 2가 더 많다.
		
		// bute배열값보다 더 많은 값을 입력할 경우 
		// System.in.read는 배열값까지만 입력받음.
		// 한글은 3byte (UTF-8코드 기반), 다른 코드에선 다를수도
		
		System.out.println("readByteNo : "+readByteNo);
		
		String str = new String(bytes, 0, readByteNo-2);
		System.out.println(str);
	}

}
