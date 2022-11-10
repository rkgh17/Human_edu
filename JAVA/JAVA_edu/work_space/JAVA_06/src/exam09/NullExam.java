package exam09;

import java.util.Objects;

public class NullExam {
	public static void main(String[] args) {
		String str1 = "황지훈";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			String name = Objects.requireNonNull(str2, "이름이 없습니다.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
