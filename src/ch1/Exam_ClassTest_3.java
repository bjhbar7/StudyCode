//package : keyword : ch1 ���丮�� Exam_ClassTest_3�� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ Exam_ClassTest_3 Ŭ������ ������ ����Ѵ�.
//class : �ڹٿ��� �ּ� ���� : class�� �Լ� + ������ �����Ǿ� �ִ�. : class�� �޸𸮿� �ö󰡸� ��ü(Object)�� �ȴ�.
public class Exam_ClassTest_3 {

	//��� ����
	//byte : 1byte ���� : ���� : 8 bit
	byte bVal;
	//char : 2byte ���� : ����
	char cVal;
	//short : 2byte ���� : ����
	short sVal;
	//int : 4byte ���� : ����
	int iVal;
	//long : 8byte ���� : ����
	long lVal;
	//float : 4byte ���� : �Ǽ�
	float fVal;
	//double : 8byte ���� : �Ǽ�
	double dVal;
	//boolean : 1byte ���� : ��(true)�� ����(false)�� ����
	boolean boolVal;
	//String : java.lang.String Ŭ���� : ���ڿ� Ŭ����
	String strVal;
	//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ main() �Լ��� ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� �����ϰ� JVM�� �ش� �ڿ��� �޸� ���� �ø���. ���α׷� ����� �����ȴ�.
	//void : �Լ��� ���ϰ��� ���� ��� ������ �ڸ��� �����Ѵ�.
	//main() : console application�� ���� �����̴�. ��������Ʈ ������� �����Ѵ�.
	//String : java.lang.String : ���ڿ� Ŭ����
	public static void main(String args[]){
		//�����ڰ� �޸𸮿� �ö󰡸�(�ν���Ʈ �Ǹ�) �ش� Ŭ������ �ִ� ��� ������ default������ �ʱ�ȭ�ȴ�.
		//Exam_ClassTest_3() : ������
		//Exam_ClassTest_3 : ����Ϸ��� �ϴ� Ŭ����(��Ʈ�� Ŭ���� rt.jar�� �ִ� Ŭ����, ��������� Ŭ����)
		//ec : ���� ���� : reference variable : ���� ������ �޸𸮿� �ö� Ŭ������ �����Ѵ�.
		//			Ŭ���� ���� ������ ����, �Լ��� ��������.(��Ʈ������)�� �̿��ؼ� ����� �� �ִ�.
		//new : keyword : ���� ������ ������ �� ����Ѵ�.
		Exam_ClassTest_3 ec = new Exam_ClassTest_3();
		System.out.println("ec�� �ּҰ� >>> :" + ec);
		System.out.println("ec�� bVal >>> :" + ec.bVal );
		System.out.println("ec�� cVal >>> :" + ec.cVal );
		System.out.println("ec�� sVal >>> :" + ec.sVal );
		System.out.println("ec�� iVal >>> :" + ec.iVal );
		System.out.println("ec�� lVal >>> :" + ec.lVal );
		System.out.println("ec�� fVal >>> :" + ec.fVal );
		System.out.println("ec�� dVal >>> :" + ec.dVal );
		System.out.println("ec�� boolVal >>> :" + ec.boolVal );
		System.out.println("ec�� strVal >>> :" + ec.strVal );

		Exam_ClassTest_3 ec_1 = new Exam_ClassTest_3();
		System.out.println("ec_1�� �ּҰ� >>> :" + ec_1);
		System.out.println("ec_1�� bVal >>> :" + ec_1.bVal );
		System.out.println("ec_1�� cVal >>> :" + ec_1.cVal );
		System.out.println("ec_1�� sVal >>> :" + ec_1.sVal );
		System.out.println("ec_1�� iVal >>> :" + ec_1.iVal );
		System.out.println("ec_1�� lVal >>> :" + ec_1.lVal );
		System.out.println("ec_1�� fVal >>> :" + ec_1.fVal );
		System.out.println("ec_1�� dVal >>> :" + ec_1.dVal );
		System.out.println("ec_1�� boolVal >>> :" + ec_1.boolVal );
		System.out.println("ec_1�� strVal >>> :" + ec_1.strVal );

	}//end of main()
}//end of Exam_ClassTest_3