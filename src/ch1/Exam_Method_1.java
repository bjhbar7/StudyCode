//package : keyword : class Exam_Method_1�� a.b.c.ch1�� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : ���� ������ : Access Medifier : �ٸ� ��Ű��, ���� ��Ű���� ������ ����Ѵ�.
//class : �ڹٿ��� ���� ���� ���� : �޸𸮿� �ö󰡸� ��ü(Object)�� �ȴ�.
//class Ű���带 ����ؼ� �̸��� Exam_Method_1 ����� ���� class�� �����Ѵ�.
//����� ���� Ŭ���� Exam_Method_1 �� �ִ� �������� ���� + �Լ� �̴�. : aMethod() �Լ�, mai() �Լ� 
public class Exam_Method_1 {
	//public : ���� ������ : Access Medifier : �ٸ� ��Ű��, ���� ��Ű���� ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : Method�� return �Ǵ� ���� ���� �� ����Ѵ�.
	//aMethod() �Լ� : Function : �Լ��� ����� �ϱ� ���� �����͸� ��� �δ� �����̴�.
	//int : �ڷ��� : 4byte ���� : int i �� 4byte ������ ���� parameter(�Ű�����)�̴�.
	//() : �Ұ�ȣ �ȿ��� parameter�� ���������� �Է��Ѵ�.
	public static void aMethod(int i) {
		//int : �ڷ��� : 4byte ����
		//int ii = i; : int �ڷ������� ii ������ �����ϰ� i�� �ʱ�ȭ�Ѵ�.
		//; : ����(statement) ����
		int ii = i;
		//System : java.lang.System Ŭ����
		//System.out.println() �� �̿��ؼ� println() �Լ� ���� ������ console�� ����Ѵ�.
		System.out.println("aMethod �Լ� �� �ȿ��� ��� >>" + ii);
	}
	//public : ���� ������ : Access Medifier: �ٸ� ��Ű��, ���� ��Ű���� ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : �Լ��� return �Ǵ� ���� ���� �� ����Ѵ�.
	//main() �Լ� : console application main() �Լ�
	//String : ���� �ڷ��� : ���ڿ��� ������ ���� �����ϰ� �Ѵ�. : java.lang.String
	//args : ����
	//[] : �迭
	//public static void main(String args[]){} : console application�� �����Ѵ�.
	public static void main(String args[]) {
		//Exam_Method_1�� �ִ� aMethod() �Լ��� ȣ���Ѵ�.
		//100 : argument
		//; : ����(statement) ����
		Exam_Method_1.aMethod(100);

	} //end of main()
} //end of Exam_Method_1 class