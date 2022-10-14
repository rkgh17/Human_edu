package exam05;

public class FinalizeExam {

	public static void main(String[] args) {
		Counter counter = null; // 초기화
		for(int i = 0; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
			//gc는 garbageCollector를 의미하며,
			//gc호출에 의해 Finalinze()메서드가 호출됨.
			//객체가 소멸되는 시점에 기록하고 싶은 것 또는 마무리를 위해 처리할 것이 있으면
		}

	}

}
