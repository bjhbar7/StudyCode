package ch1;

public class Exam_FlowControl_201 {
	
	public int add(int x , int y) {
		return x + y;
	}

	public static void main(String args[]) {
		
		int x = Integer.parseInt(args[0]);
		int y = Integer.parseInt(args[1]);

		Exam_FlowControl_201 ef2 = new Exam_FlowControl_201();
		System.out.println("Exam_FlowControl_201의 주소값 : " + ef2);

		int addSum = ef2.add(x,y);
		System.out.println("add() 함수값 : " + addSum);
	}
}

/*
C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_201 1 2
Exam_FlowControl_201의 주소값 : a.b.c.ch1.Exam_FlowControl_201@15db9742
add() 함수값 : 3
*/
/*
C:\00.KOSMO108\10.JExam\ch1>java a.b.c.ch1.Exam_FlowControl_201
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at a.b.c.ch1.Exam_FlowControl_201.main(Exam_FlowControl_201.java:11)
*/