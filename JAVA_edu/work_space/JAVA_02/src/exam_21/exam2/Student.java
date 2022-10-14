package exam_21.exam2;

public class Student {
	String StudentId;
	String StudentName;

	Subject economySubject; // 경제학 수강과목 이름과 점수
	Subject logisticSubject; // 물류학
	Subject mathmaticSubject; // 수학
	Subject computerSubject; // 컴공
	Subject englishSubject; // 영어

	public Student(String StudentId, String StudentName) { // Subject클래스 관리
		this.StudentId = StudentId;
		this.StudentName = StudentName;
		economySubject = new Subject("경제학");
		logisticSubject = new Subject("물류학");
		mathmaticSubject = new Subject("수학");
		computerSubject = new Subject("컴퓨터");
		englishSubject = new Subject("영어");
	}

	public void setSubjectScore(String subjectName, int score) {
		if (subjectName.equals("경제학"))
			economySubject.score = score;
		else if (subjectName.equals("물류학"))
			logisticSubject.score = score;
		else if (subjectName.equals("수학"))
			mathmaticSubject.score = score;
		else if (subjectName.equals("컴퓨터"))
			computerSubject.score = score;
		else if (subjectName.equals("영어"))
			englishSubject.score = score;
	}

	public void showInfo() {
		System.out.printf("%s \t %d \n", economySubject.subjectName, economySubject.score);
		System.out.printf("%s \t %d \n", logisticSubject.subjectName, logisticSubject.score);
		System.out.printf("%s \t %d \n", mathmaticSubject.subjectName, mathmaticSubject.score);
		System.out.printf("%s \t %d \n", computerSubject.subjectName, computerSubject.score);
		System.out.printf("%s \t %d \n", englishSubject.subjectName, englishSubject.score);
	}
}
