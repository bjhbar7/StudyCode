//package : ch1 ���丮�� Exam_Array_101 class�� �����Ѵ�.
package ch1;

public class Exam_Array_101 {

	public static void main(String args[]) {
		
		//int�� 1���� �迭�� �����Ѵ�.
		//int�� �����ڷ����ε� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		//�ڷ��� ��������[] = new �ڷ���[�迭�� ����];
		//new : �ν��Ͻ� ������ ����
		//JVM�� int[3] ������ ���� int�� ������ ���� 3���� �����ϰ� default ������ �ʱ�ȭ�Ѵ�.
		//�� ���ڿ� int���� ����Ʈ���� 0�� �ʱ�ȭ �ȴ�.
		int iReferenceVariable[] = new int[3];
		System.out.println("iReferenceVariable[]�� �ּҰ� : " + iReferenceVariable);

		int iVal0 = iReferenceVariable[0];
		System.out.println("iReferenceVariable[0] >>>> : " + iVal0);
		int iVal1 = iReferenceVariable[1];
		System.out.println("iReferenceVariable[1] >>>> : " + iVal1);
		int iVal2 = iReferenceVariable[2];
		System.out.println("iReferenceVariable[2] >>>> : " + iVal2);
		
		//double�� 2���� �迭�� �����Ѵ�.
		//double�� �����ڷ����ε� �迭�� �����ϸ� ��ü�� ���Ѵ�.
		//new double[3][2] : �� [] �迭�� ���� �ǹ��ϰ� �� [] �迭�� ���� �ǹ��Ѵ�.
		double dReferenceVariable[][] = new double[3][2];
		System.out.println("dReferenceVariable[]�� �ּҰ� : " + dReferenceVariable);
		
		double dVal00 = dReferenceVariable[0][0];
		System.out.println("dReferenceVariable[0][0] >>> : " + dVal00);
		double dVal01 = dReferenceVariable[0][1];
		System.out.println("dReferenceVariable[0][1] >>> : " + dVal01);
		double dVal02 = dReferenceVariable[0][2];
		System.out.println("dReferenceVariable[0][2] >>> : " + dVal02);
		double dVal10 = dReferenceVariable[1][0];
		System.out.println("dReferenceVariable[1][0] >>> : " + dVal10);
		double dVal11 = dReferenceVariable[1][1];
		System.out.println("dReferenceVariable[1][1] >>> : " + dVal11);
		double dVal20 = dReferenceVariable[2][0];
		System.out.println("dReferenceVariable[2][0] >>> : " + dVal20);
		double dVal21 = dReferenceVariable[2][1];
		System.out.println("dReferenceVariable[2][1] >>> : " + dVal21);
		double dVal22 = dReferenceVariable[2][2];
		System.out.println("dReferenceVariable[2][2] >>> : " + dVal22);
	} // end of main()
} // end of Exam_Array_101