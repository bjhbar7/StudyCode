//package : keyword : ch1 ���丮�� Exam_ClassTest_1 Ŭ������ �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű�������� �ش� class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class �� ������ �Լ� + ���� �̴�.
public class Exam_ClassTest_1 {
	//��� ����
	//int : �ڷ��� : 4 byte ����
	//int ���� iVal ���� ����
	//; : ����(statement) ����
	int iVal;
	//static : keyword : ���� Ȥ�� �Լ� �տ� ����ϸ� JVM �� �޸𸮿� �÷��ش�. ���α׷� ����� �����ȴ�.
	//static Ű���尡 ���� ������ ������ �� JVM�� ���� �ʱ�ȭ ���ش�.
	//int : �ڷ��� : 4 byte ����
	//int ���� iValStatic Ŭ���� ���� ����
	//; : ���� ����
	static int iValStatic;
	//public : ���� ������ : Access Modifier :  �ٸ�,���� ��Ű������ main() �Լ��� ������ ����Ѵ�.
	//static : keyword : ���� Ȥ�� �Լ� �տ� ����ϸ� JVM �� �޸𸮿� �÷��ش�. ���α׷� ����� �����ȴ�.
	//void : ���ϰ��� ���� �� ����Ѵ�.
	//main() : ���� �Լ� : console application�� �������̴�.
	public static void main(String args[]){
		System.out.println("main()�� ����");
		//�Լ� ���ο��� ������ ������ ���������̴�.
		//���������� �ݵ�� �ʱ�ȭ�� �ؼ� ����Ѵ�.
		int i = 10;
		System.out.println("�������� i >>> : " + i);

		System.out.println("Ŭ�������� iValStatic >>> : " + iValStatic);
		//iVal ��� ������ �ش� Ŭ������ new �����ڷ� �޸𸮿� �÷��� ����Ѵ�. 
		//��ü(Object) ec�� ��ü(Object) ec_1�� �ٸ� �޸�(��ü)�̴�.
		Exam_ClassTest_1 ec = new Exam_ClassTest_1();
		System.out.println("��ü ec >>> :" + ec);
		System.out.println("��ü ec�� ������� iVal >>> : " + ec.iVal);

		Exam_ClassTest_1 ec_1 = new Exam_ClassTest_1();
		System.out.println("��ü ec_1 >>> :" +ec_1);
		System.out.println("��ü ec_1�� ������� iVal >>> : " + ec_1.iVal);
		
		//static ������ ÷�������� �������� �ʴ´�. ������ �ǳ� ���α׷��� ��������.
		//System.out.println(ec_1.iValStatic);

		}//end of main()
}//end of Exam_ClassTest_1