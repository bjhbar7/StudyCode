//package : keyword : ch1 ���丮�� Exam_Method_7 Ŭ���� �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű�������� ������ ����Ѵ�.
//class : �ڹٿ��� ���� ���� ���� : �޸� ���� �ö󰡸� ��ü(Object)�� �ȴ�. : class�� �ڿ��� ���� + �Լ��̴�.
//public class Exam_Method_7 : ���� ��Ű��, �ٸ� ��Ű������ ������ ������ Exam_Method_7�� �����Ѵ�. : �Լ� 2�� : ����� ���� �Լ� 1�� + main() �Լ� 1��
public class Exam_Method_7 {
	//static : ������ Ű���� : ����, �Լ� �տ� ����Ǹ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� ���� �ȴ�.
	//int : ������ : int �ڷ����� ������ : �Լ��� �������� return �ڿ� ���� ������ ������ ���� �����ؾ��Ѵ�.
	//static int addMethod(int x, int y) : int x, int y�� �Ű� ����(parameter)�� ���� addMethod()�� ����Ͽ� int �������� ���� ��´�. 
	static int addMethod(int x, int y) {
		//System : java.lang.System Ŭ����
		//System.out.println(); �� �Լ� �� ���� ������, ���� ����� �ƴϴ�. println()�� ������ ����ϴ� ��ɹ��̴�.
		System.out.println("Exam_Method_7 Ŭ������ �ִ� addMethod() �޼ҵ�(�Լ�) ");
		//int : �ڷ��� : 4 byte�� ����
		//int addSum = x + y; : int �ڷ����� ������ ���� ���� addSum�� int x �� int y�� ���� ������ �ʱ�ȭ�Ѵ�.
		int addSum = x + y;
		//return addSum; : addSum ������ ���ϰ����� �����Ѵ�. 
		return addSum;
	}
	//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű���� main() �Լ��� �����ϴ� ���� ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����Ǹ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� ���� �ȴ�.
	//void : ������ : ���ϰ��� ���� �Լ����� ������ ������ ����Ѵ�.
	//public static void main(String args[]) : console application�� �����Ѵ�. : �ڹٴ� main() ���� �����ϸ� �Լ� �� ������ ��������Ʈ(interprite) ������� �����Ѵ�.
	public static void main(String args[]){
		System.out.println("Exam_Method_7 Ŭ������ �ִ� main() �޼ҵ�(�Լ�) /n");
		// argument ������ addMethod(a,b)�� parameter ������ addMethod(int x,int y)�� �������� �ʾƵ� �ȴ�.
		// int : �ڷ��� : 4 byte ����
		// int �ڷ����� ������ ���� sum ������ �����ϰ� Exam_Method_7.addMethod(1,2)�� ȣ���Ͽ� �ʱ�ȭ�Ѵ�.
		int sum = Exam_Method_7.addMethod(1,2);
		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + sum + "/n");
		//int a = 1; : int �ڷ����� ���� a �� 1�� �ʱ�ȭ�ϰ� �����Ѵ�.
		int a = 1;
		//int b = 2; : int �ڷ����� ���� b �� 2�� �ʱ�ȭ�ϰ� �����Ѵ�.
		int b = 2;

		int sum_1 = Exam_Method_7.addMethod(a,b);
		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + sum_1 + "/n");

		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + Exam_Method_7.addMethod(1,2) + "/n");

		System.out.println("Exam_Method_7.addMethod(1,2) >>> : " + Exam_Method_7.addMethod(a,b));
	} //end of main()
} //end of Exam_Method_7 class