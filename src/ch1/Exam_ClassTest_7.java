package ch1;

public class Exam_ClassTest_7 {
	
	public int aMethod(){
		System.out.println("	aMethod()�� ���� >>>>>>>");
		int x = 1;
		int y = 2;
		//System.out.println()���� log�� ��´�.
		System.out.println("	x : " + x + " , y : " + y);
		int addSum = x + y ;
		System.out.println("	addSum : " + addSum + " = x :" + x + " + y : " + y);
		System.out.println("	aMethod()�� �� >>>>>>>");

		return addSum;
		//return : Ű���� : statement�� �����ϰ� ; ���� ���ڸ� �� �ڿ� ��� ������ ������� �ʴ´�.
	}

	public static void main(String args[]){
		System.out.println("main() �Լ��� ���� >>>>>");
		//new �����ڸ� ����ؼ� Exam_ClassTest_7�� �����ϴ� �������� ec7�� �����.
		Exam_ClassTest_7 ec7 = new Exam_ClassTest_7();
		System.out.println("ec7 >>> : " + ec7);
		System.out.println("ec7.aMethod >>> : " + ec7.aMethod());
		//int�� ec_aMethod ������ ec7.aMethod()�� ���� �����Ѵ�.
		int ec_aMethod = ec7.aMethod();
		System.out.println("ec_aMethod >>> : " + ec_aMethod);
		System.out.println("main() �Լ��� �� >>>>>");
	} //end of main()
} // end of Exam_ClassTest_7