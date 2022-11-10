package exam22;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExam {
	public static void main(String[] args) {
		Date now = new Date();
		//현재시간 now에 대입
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		// a는 오전/오후임.
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("오늘은 E요일");
		//E는 요일표시
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("올해의 D번째 날");
		//D는 올해 1/1일부터 누적 날짜.
		System.out.println(sdf.format(now));

		sdf = new SimpleDateFormat("이달의 d번째 날");
		System.out.println(sdf.format(now));
	}

}
