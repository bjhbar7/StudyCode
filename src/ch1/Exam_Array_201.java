package ch1;

public class Exam_Array_201 {
	
	public void byteArray() {
		byte bArr[] = new byte[10];
		System.out.println("bArr의 참조변수 >>> : " + bArr);
		System.out.println("bArr의 배열 길이 >>> : " + bArr.length + 
							"\n byte 타입 상자가 10개 있다. \n" + "index는 0부터 9까지 있다 \n" + 
							"index는 배열상자갯수 -1 이다. \n" + "index는 0부터 시작하기 때문이다. \n");
	}

	public void charArray() {
		char cArr[] = new char[10];
		System.out.println("cArr의 참조변수 >>> : " + cArr);
	}

	public void intArray() {
		int iArr[] = new int[10];
		System.out.println("iArr의 참조변수 >>> : " + iArr);
	}

	public void doubleArray() {
		double dArr[] = new double[10];
		System.out.println("dArr의 참조변수 >>> : " + dArr);
	}

	public void StringArray() {
		String strArr[] = new String[10];
		System.out.println("strArr의 참조변수 >>> : " + strArr);
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