//package : keyword : ch1 ���丮�� Exam_ClassTest_5�� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : Access Modifier : ���� ������ : ���� ��Ű��, �ٸ� ��Ű������ �ش� class�� ȣ���մϴ�.
//class : �ڹ� ���α׷��� �ּ� �����̴�. ������ �Լ� + ���� : class�� �޸� ���� �ö󰡸� ��ü(Object)�� �ȴ�.
public class Exam_ClassTest_5 {
	
	//��� ����
	//���
	//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ ������ ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� �����ϸ� JVM�� �޸� ���� �÷��д�. ���α׷��� ����� �����ȴ�.
	public static final int ID_NUM = 1;
	//Ŭ���� ����, static ����
	static int id_val = 11;
	//���� ����
	public int iVal_G;
	//��� ����
	int iVal;
	//�������� ���� �Լ�, static�� ���� �Լ�
	public void aMethod(){
		System.out.println("aMethod()");
	}
	//�������� ���� �Լ�, static�� �ִ� �Լ�
	public static void aaMethod(){
		System.out.println("aaMethod()");
	}
	//�������� �ִ� �Լ�(������ int), static�� ���� �Լ�
	public int bMethod(){
		System.out.println("bMethod()");
		return 1 + 1;
	}
	//�������� �ִ� �Լ�(������ int), static�� �ִ� �Լ�
	public static int bbMethod(){
		System.out.println("bbMethod()");
		return 10 + 10;
	}

	public static void main(String args[]){
		
		//static�� �ִ� �ڿ�(����, �Լ�) ȣ���ϴ� ���
		//��Ű����.Ŭ������.�ڿ��̸�
		System.out.println("ID_NUM >>> : " + Exam_ClassTest_5.ID_NUM + "\n");
		System.out.println("id_val >>> : " + Exam_ClassTest_5.id_val + "\n");
		//�������� ���� �Լ��� println()�Լ����� ��� �Ұ����ϴ�.
		Exam_ClassTest_5.aaMethod();
		System.out.println("bbMethod() >>> : " + Exam_ClassTest_5.bbMethod() + "\n");
		//�������� �ִ� �Լ��� ���ϰ��� �޾Ƽ� ��� �����ϴ�.
		int idd = Exam_ClassTest_5.bbMethod();
		System.out.println("idd >>> : " + idd +"\n");
		
		Exam_ClassTest_5 ec = new Exam_ClassTest_5();
		System.out.println("iVal_G >>> : " + ec.iVal_G + "\n");
		System.out.println("iVal >>> : " + ec.iVal + "\n");
		ec.aMethod();
		System.out.println("bMethod() >>> : " + ec.bMethod() + "\n");
		//�������� �ִ� �Լ��� ���ϰ��� �޾Ƽ� ��� �����ϴ�.
		int iB = ec.bMethod();
		System.out.println("iB >>> : " + iB);
	} //end of main()
} // end of class