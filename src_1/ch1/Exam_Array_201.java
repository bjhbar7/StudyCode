package ch1;

public class Exam_Array_201 {
	
	public void byteArray() {
		byte bArr[] = new byte[10];
		System.out.println("bArr�� �������� >>> : " + bArr);
		System.out.println("bArr�� �迭 ���� >>> : " + bArr.length + 
							"\n byte Ÿ�� ���ڰ� 10�� �ִ�. \n" + "index�� 0���� 9���� �ִ� \n" + 
							"index�� �迭���ڰ��� -1 �̴�. \n" + "index�� 0���� �����ϱ� �����̴�. \n");
	}

	public void charArray() {
		char cArr[] = new char[10];
		System.out.println("cArr�� �������� >>> : " + cArr);
	}

	public void intArray() {
		int iArr[] = new int[10];
		System.out.println("iArr�� �������� >>> : " + iArr);
	}

	public void doubleArray() {
		double dArr[] = new double[10];
		System.out.println("dArr�� �������� >>> : " + dArr);
	}

	public void StringArray() {
		String strArr[] = new String[10];
		System.out.println("strArr�� �������� >>> : " + strArr);
	}

	public static void main(String args[]) {
		Exam_Array_201 ea2 = new Exam_Array_201();
		ea2.byteArray();
		ea2.charArray();
		ea2.intArray();
		ea2.doubleArray();
		ea2.StringArray();
	}
}