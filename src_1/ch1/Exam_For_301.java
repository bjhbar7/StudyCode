package ch1;

public class Exam_For_301 {

	public static void main(String args[]) {
		//for 문 : 반복문 : from to loop : (초기화식; 조건식; 증감식) : {반복수행할 표현식} : 증감식에 +=,-=,--,++ 등이 사용가능하다.
		for (int i=0; i<10; i += 2) {
			//System.out.print(); : 한 줄로 콘솔에 출력한다.
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