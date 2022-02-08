package ch1;

public class Exam_Array_301 {
	
	public void byteArray() {
		
		byte bArr[] = new byte[3];
		System.out.println("bArr의 주소값 : " + bArr);
		System.out.println("bArr의 배열 길이 : " + bArr.length);
		System.out.println("bArr[0] >>> : " + bArr[0]);
		System.out.println("bArr[1] >>> : " + bArr[1]);
		System.out.println("bArr[2] >>> : " + bArr[2]);

		byte bArr_1[] = new byte[]{1,2,3};
		System.out.println("bArr_1의 배열 길이 : " + bArr_1.length);
		System.out.println("bArr_1[0] >>> : " + bArr_1[0]);
		System.out.println("bArr_1[1] >>> : " + bArr_1[1]);
		System.out.println("bArr_1[2] >>> : " + bArr_1[2]);

		byte bArr_2[] = {1,2,3};
		System.out.println("bArr_2의 배열 길이 : " + bArr_2.length);
		System.out.println("bArr_2[0] >>> : " + bArr_2[0]);
		System.out.println("bArr_2[1] >>> : " + bArr_2[1]);
		System.out.println("bArr_2[2] >>> : " + bArr_2[2]);
	}

	public void charArray() {
		
		char cArr[] = new char[3];
		System.out.println("cArr의 주소값 : " + cArr);
		System.out.println("cArr의 배열 길이 : " + cArr.length);
		System.out.println("cArr[0] : " + cArr[0]);
		System.out.println("cArr[1] : " + cArr[1]);
		System.out.println("cArr[2] : " + cArr[2]);

		char cArr_1[] = new char[]{'a','b','c'};
		System.out.println("cArr_1의 배열 길이 : " + cArr_1.length);
		System.out.println("cArr_1[0] : " + cArr_1[0]);
		System.out.println("cArr_1[1] : " + cArr_1[1]);
		System.out.println("cArr_1[2] : " + cArr_1[2]);

		char cArr_2[] = {'a','b','c'};
		System.out.println("cArr_2의 배열 길이 : " + cArr_2.length);
		System.out.println("cArr_2[0] : " +cArr_2[0]);
		System.out.println("cArr_2[1] : " +cArr_2[1]);
		System.out.println("cArr_2[2] : " +cArr_2[2]);
	}

	public void intArray() {
		
		int iArr[] = new int[3];
		System.out.println("iArr의 주소값 : " + iArr);
		System.out.println("iArr의 배열 길이 : " + iArr.length);
		System.out.println("iArr[0] : " + iArr[0]);
		System.out.println("iArr[1] : " + iArr[1]);
		System.out.println("iArr[2] : " + iArr[2]);

		int iArr_1[] = new int[] {1,2,3};
		System.out.println("iArr_1의 배열 길이 : " + iArr_1.length);
		System.out.println("iArr_1[0] : " + iArr_1[0]);
		System.out.println("iArr_1[1] : " + iArr_1[1]);
		System.out.println("iArr_1[2] : " + iArr_1[2]);

		int iArr_2[] = {11,22,33};
		System.out.println("iArr_2의 배열 길이 : " + iArr_2.length);
		System.out.println("iArr_2[0] : " + iArr_2[0]);
		System.out.println("iArr_2[1] : " + iArr_2[1]);
		System.out.println("iArr_2[2] : " + iArr_2[2]);
	}

	public void doubleArray() {
		
		double dArr[] = new double[3];
		System.out.println("dArr의 주소값 : " + dArr);
		System.out.println("dArr의 배열의 길이 : " + dArr.length);
		System.out.println("dArr[0] : " + dArr[0]);
		System.out.println("dArr[1] : " + dArr[1]);
		System.out.println("dArr[2] : " + dArr[2]);

		double dArr_1[] = new double[]{1.0 , 2.0 , 3.0};
		System.out.println("dArr_1의 배열의 길이 : " + dArr_1.length);
		System.out.println("dArr_1[0] : " + dArr_1[0]);
		System.out.println("dArr_1[1] : " + dArr_1[1]);
		System.out.println("dArr_1[2] : " + dArr_1[2]);

		double dArr_2[] = {4.0 , 5.0 , 6.0};
		System.out.println("dArr_2의 배열의 길이 : " + dArr_2.length);
		System.out.println("dArr_2[0] : " + dArr_2[0]);
		System.out.println("dArr_2[1] : " + dArr_2[1]);
		System.out.println("dArr_2[2] : " + dArr_2[2]);
	}
		
	public void stringArray() {
		
		String strArr[] = new String[3];
		System.out.println("strArr의 주소값 : " + strArr);
		System.out.println("strArr의 배열의 길이 : " + strArr.length);
		System.out.println("strArr[0] : " + strArr[0]);
		System.out.println("strArr[1] : " + strArr[1]);
		System.out.println("strArr[2] : " + strArr[2]);

		String strArr_1[] = new String[] {"abc","dfg","hij"};
		System.out.println("strArr_1의 배열의 길이 : " + strArr_1.length);
		System.out.println("strArr_1[0] : " + strArr_1[0]);
		System.out.println("strArr_1[1] : " + strArr_1[1]);
		System.out.println("strArr_1[2] : " + strArr_1[2]);

		String strArr_2[] = {"qwe","asd","zxc"};
		System.out.println("strArr_2의 배열의 길이 : " + strArr_2.length);
		System.out.println("strArr_2[0] : " + strArr_2[0]);
		System.out.println("strArr_2[1] : " + strArr_2[1]);
		System.out.println("strArr_2[2] : " + strArr_2[2]);
	}
	public static void main(String args[]) {
	
		Exam_Array_301 ea3 = new Exam_Array_301();
		ea3.byteArray();
		ea3.charArray();
		ea3.intArray();
		ea3.doubleArray();
		ea3.stringArray();
	}
}