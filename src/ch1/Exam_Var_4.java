//package : keyword : a.b.c.ch1 ���丮�� Exam_Var_4 Ŭ������ �����Ѵ�.
//; : ����(statement) ����
package ch1;
//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ Exam_Var_4 Ŭ������ �����ϴ� ���� ����Ѵ�.
//class : keyword : �ڹٿ��� ���� ���� ���� : �޸� ���� �ö󰡸� ��ü(Object)�� �ȴ�. : class�� �ڿ��� ���� + �Լ��̴�.
public class Exam_Var_4 {
	//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ main() �Լ��� ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� �ۼ��ϸ� JVM�� �ش� resource�� �޸� ���� �÷��д�. ���α׷� ����� �����ȴ�.
	//void : �Լ��� ���ϰ��� ������ �������� �ۼ�
	//java console application�� main() �Լ��� �����Ѵ�.
	public static void main(String args[]){
		//System : java.lang.System
		//System.out.println(); : �Ұ�ȣ()�� ������ �ֿܼ� ����Ѵ�.
		System.out.println("Exam_Var_4.main() �Լ� ����");
		System.out.println("��������Ʈ ������� ���� �ȴ�.");
		System.out.println("main() �Լ� �� ���� ���� ������ 80�÷� �������� ����ȴ�.");
		//int : �ڷ��� : 4byte ����
		//int �ڷ����� ���� i�� �����ϰ� 10���� �ʱ�ȭ�Ѵ�.
		//i�� ��ȿ������ ������ ���� ���κ��� main() ���� ������ ���α��� ��ȿ�ϴ�.
		//; : ����(statement) ����
		int i = 10;
		System.out.println("i >>> : " + i );
		//�̸��� ����(�͸�) ���� �����Ѵ�.
		{
			//int : �ڷ��� : 4byte ����
			//int �ڷ����� ���� ii�� �����ϰ� 1000���� �ʱ�ȭ�Ѵ�.
			//ii�� ��ȿ������ ������ ���� ���κ��� �̸��� ���� ���� ������ ���α��� ��ȿ�ϴ�.
			int ii = 1000;
			System.out.println("ii >>> : " + ii);
			System.out.println("{}�ȿ��� i >>> : " + i);
			//���� i�� 101���� �ʱ�ȭ�Ѵ�.
			i = 101;
		} // end of �͸� ��
		System.out.println("i >>> : " + i);
	} // end of main()
} // end of Exam_Var_4 class