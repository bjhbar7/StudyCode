package ch1;

public class Exam_For_301 {

	public static void main(String args[]) {
		//for �� : �ݺ��� : from to loop : (�ʱ�ȭ��; ���ǽ�; ������) : {�ݺ������� ǥ����} : �����Ŀ� +=,-=,--,++ ���� ��밡���ϴ�.
		for (int i=0; i<10; i += 2) {
			//System.out.print(); : �� �ٷ� �ֿܼ� ����Ѵ�.
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i=0; i<10; i += 3) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i=10; i>=0; i-- ) {
			System.out.print(i + " ");
		}
	}
}
//C:\00.KOSMO108\10.JExam\ch1>javac -d . Exam_For_301.java && java a.b.c.ch1.Exam_For_301