//package : keyword : ch1�� Exam_Method_3 class �� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : ���� ������ : Access Modifier : Exam_Method_3 class�� �ٸ� ��Ű��, ���� ��Ű������ ���� �����ϰ� �Ѵ�.
//class : �ڹٿ��� ���� ���� ���� : �޸� ���� �ö󰡸� ��ü(Object)�� �ȴ�.
//public class Exam_Method_3 {} : Exam_Method_3 class�� �����Ѵ�.
public class Exam_Method_3 {

	//public : ���� ������ : Access Modifier : �Լ� aM()�� �ٸ� ��Ű��, ���� ��Ű������ ���� �����ϰ� �Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : aM() �Լ��� ���ϰ��� ���� �� ����Ѵ�.
	//public static void aM() : ���ϰ��� ���� ���� aM() �Լ��� �����Ѵ�.
	public static void aM(){
		//System : java.lang.System Ŭ���� ȣ��
		//. : ��Ʈ ������ : ��ũ ������
		//out : 
		//println :
		//System.out.println() : println() �Լ� ���� ������ console�� ����Ѵ�.
		//; : ����(statement) ����
		System.out.println("aM() method �Լ�");
		System.out.println("aM() method �Լ� �� �� ��° ���ο��� bM() �Լ� ȣ���� �Ѵ�.");
	}
	//public : ���� ������ : Access Modifier : �Լ� bM()�� �ٸ� ��Ű��, ���� ��Ű������ ���� �����ϰ� �Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : bM() �Լ��� ���ϰ��� ���� �� ����Ѵ�.
	//public static void bM() : ���ϰ��� ���� ���� bM() �Լ��� �����Ѵ�.
	public static void bM(){
		//System : java.lang.System Ŭ���� ȣ��
		//System.out.println() : println() �Լ� �ȿ� ������ console�� ����Ѵ�.
		//; : ����(statement) ����
		System.out.println("bM() method �Լ�");
	}
	//public : ���� ������ : Access Modifier : �Լ� cM()�� �ٸ� ��Ű��, ���� ��Ű������ ���� �����ϰ� �Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : cM() �Լ��� ���ϰ��� ���� �� ����Ѵ�.
	//public static void cM() : ���ϰ��� ���� ���� cM() �Լ��� �����Ѵ�.
	public static void cM(){
		//System : java.lang.System Ŭ���� ȣ��
		//System.out.println() : println() �Լ� �ȿ� ������ console�� ����Ѵ�.
		//; : ����(statement) ����
		System.out.println("cM() method �Լ�");
	}
	//public : ���� ������ : Access Modifier : main() �Լ��� �ٸ� ��Ű��, ���� ��Ű������ ���� �����ϰ� �Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� ����ϸ� JVM�� �ش� resource�� �޸� ���� �÷� �д�. ���α׷� ����� �����ȴ�.
	//void : ������ : main() �Լ��� ���ϰ��� �����Ƿ� ����Ѵ�.
	//public static void main(String args[]) : console application�� main() �Լ��� �����Ѵ�.
	//String : �ڷ��� : java.lang.String Ŭ���� ȣ��, ���ڿ��� ������ ���� �����ϰ� �Ѵ�.
	public static void main(String args[]){
		//System : java.lang.System Ŭ���� ȣ��
		//System.out.println() : println() �Լ� �ȿ� ������ console�� ����Ѵ�.
		//; : ����(statement) ����
		//"" : "" ���̿� ������ ���ڿ�
		System.out.println("ù ��° ���ο��� Exam_Method_3 Ŭ���� ���� �ִ� main() �Լ� ���� >>> : ");
		System.out.println("�� ��° ���ο��� Exam_Method_3 Ŭ���� ���� �ִ� aM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("aM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		//Exam_Method_3.aM() : Exam_Method_3 Ŭ������ aM() �Լ��� ȣ���Ѵ�.
		//; : ����(statement) ����
		Exam_Method_3.aM();
		//System : java.lang.System Ŭ���� ȣ��
		//System.out.println() : println() �Լ� �ȿ� ������ console�� ����Ѵ�.
		//; : ����(statement) ����
		System.out.println("�� ��° ���ο��� Exam_Method_3 Ŭ���� ���� �ִ� cM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("cM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		//Exam_Method_3.cM() : Exam_Method_3 Ŭ������ cM() �Լ��� ȣ���Ѵ�.
		//; : ����(statement) ����
		Exam_Method_3.cM();
		System.out.println("�� ��° ���ο��� Exam_Method_3 Ŭ���� ���� �ִ� bM() �Լ��� ȣ���Ѵ�. >>> : ");
		System.out.println("bM() �Լ� ���� ù ��° ������ ����ȴ�. >>> : ");
		//Exam_Method_3.bM() : Exam_Method_3 Ŭ������ bM() �Լ��� ȣ���Ѵ�.
		//; : ����(statement) ����
		Exam_Method_3.bM();
	} // end of main()
} // end of Exam_Method_3 class
