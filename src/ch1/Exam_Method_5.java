//package : keyword : a.b.c.ch1 ���丮 ���� Exam_Method_5 Ŭ������ �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : Exam_method_5 class�� �ٸ� ��Ű��(���丮), ���� ��Ű��(���丮)���� ������ �� �ִ�.
//class : �ڹٿ��� ���� ���� ���� : �޸� ���� �ö󰡸� ��ü(Object)�� �ȴ�. : class�� �ڿ��� ���� + �Լ��̴�.
//Exam_Method_5 class�� �Լ� 4�� : main() �Լ� 1�� + ����� ���� �Լ� 3��
public class Exam_Method_5 {
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ���� �� ���� �ȴ�.
	//int : �ڷ��� : 4byte ũ���� ����
	//int : ������ : int �ڷ����� ������ : �Լ��� �������� return Ű���� �ڿ� ���� ���������� ���� �ؾ� �Ѵ�.
	//static int addMethod() : static �Լ� addMethod()�� ����Ͽ� int �ڷ��� ���� ��´�. 
	static int addMethod(){
		//System : java.lang.System Ŭ����
		//System.out.println(); �� addMethod() �Լ� �� ���� ������, ���� ����� �ƴϴ�. : println()�� ������ ����ϴ� ��ɹ��̴�.
		System.out.println("Exam_Method_5 Ŭ������ �ִ� addMethod() �޼ҵ�(�Լ�) ");
		//int : �ڷ��� : 4 byte ����
		//int a = 1 : 4 byte ������ ���� a�� �����ϰ� 1�� �ʱ�ȭ�Ѵ�.
		//; : ����(statement) ����
		int a = 1;
		int b = 2;
		//return a + b : ���ϰ� a + b�� �����Ѵ�.
		//���ϰ� a + b�� ������ ���� addMethod() ����ο� �ִ� int �������� ������ ���� �׽� �����ؾ� �Ѵ�.
		//; : ����(statement) ����
		return a + b;
	}
	//default : keyword : ���� ������ : Exam_Method_5�� aM() �Լ��� ���� ��Ű�������� ȣ���� �����ϴ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ���� �� ���� �ȴ�.
	//void : ���ϰ��� ���� �Լ����� ����ο� ������ ������ ����Ѵ�.
	//static void aM() : ���� ��Ű�� �������� ȣ�� ������ �������� void��(����) static aM() �Լ��� �����Ѵ�.
	static void aM(){
		//System : java.lang.System Ŭ����
		//System.out.println(); �� aM() �Լ� �� ���� ������, ���� ����� �ƴϴ�. : println()�� ������ ����ϴ� ��ɹ��̴�.
		//; : ����(statement) ����
		System.out.println("Exam_Method_5 Ŭ������ �ִ� aM() �޼ҵ�(�Լ�) ");
	}
	//public : keyword : ���� ������ : Exam_Method_5�� bM() �Լ��� ���� ��Ű��, �ٸ� ��Ű������ ȣ���� �����ϴ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ���� �� ���� �ȴ�.
	//void : ���ϰ��� ���� �Լ����� ����ο� ������ ������ ����Ѵ�.
	//public static void bM() : ���� ��Ű��, �ٸ� ��Ű������ ȣ�� ������ �������� void��(����) static bM() �Լ��� �����Ѵ�.
	public static void bM(){
		//System : java.lang.System Ŭ����
		//System.out.println(); �� bM() �Լ� �� ���� ������, ���� ����� �ƴϴ�. : println()�� ������ ����ϴ� ��ɹ��̴�.
		System.out.println("Exam_Method_5 Ŭ������ �ִ� bM() �޼ҽ�(�Լ�) ");		
	}
	//public : keyword : ���� ������ : ���� ��Ű��, �ٸ� ��Ű������ main() �Լ��� ȣ�� �����ϰ� �Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ���� �� ���� �ȴ�.
	//void : ������ : ���ϰ��� ���� �Լ����� ����ο� ������ ������ ����Ѵ�.
	//main() : �ڹ� �ܼ� ���ø����̼��� main() �Լ����� ���۵ȴ�. : �ڹٴ� ��������Ʈ(interprite)������� ����Ǵµ�, �Լ� �� �ȿ����� ��������Ʈ ������� ����ȴ�.
	public static void main(String args[]){
		//System : java.lang.System Ŭ����
		//System.out.println(); �� ������ ����ϴ� ��ɹ��̴�.
		// "/n" : ������ : �� �� �ǳ� �ڴ�.
		//; : ����(statement) ����
		System.out.println("Exam_Method_5 Ŭ������ �ִ� main() �޼ҵ�(�Լ�) /n");

		System.out.println("�������� �ִ� �Լ��� ���� ���� �޴� ������ �����ؼ� ����Ѵ�. ");
		//int : �ڷ��� : 4 byte ũ���� ����
		// �������� �ִ� �Լ�(Exam.Method_5.addMethod())�� ���� ���� �޴� ������ �����ؼ� ����Ѵ�.
		int sum = Exam_Method_5.addMethod();
		System.out.println("int sum = " + sum + "/n");

		System.out.println("�������� void�� �Լ�(���� ���� ���� �Լ�, return Ű���尡 ���� �Լ�)��");
		System.out.println("���ϰ��� �޴� ������ ������� �ʴ´�. �׳� �Լ��� ȣ���ؼ� ����Ѵ�.");
		// �������� ���� �Լ�(Exam.Method_5.aM())�� ���� ���� �޴� ������ ������� �ʰ� �Լ��� ȣ���ؼ� ����Ѵ�.
		Exam_Method_5.aM();
	} // end of main()
} // end of Exam_Method_5 class