package ch1;

public class Exam_Var_6 {
	// Ŭ���� ���� : static ����
	static int i;
	// ���
	public static final int CONSTRUCTOR_VARIABLE = 10;
	// Ŭ���� ���� : static ����
	static int i_var_staticVariable;
	// ���� ����
	public int i_var_globalVariable;
	// ��� ����
	int i_var_MemberVariable;

	public static void main(String args[]){
		//int : �ڷ��� : 4 byte ����
		//int �ڷ����� ii ������ �����ϰ� 1�� �ʱ�ȭ�Ѵ�.
		//main() �Լ� �ȿ� �ִ� ii ����
		//�Լ� �ȿ��� �����ϴ� ������ ���� ����(local variable)�̶�� �Ѵ�.
		//; : ����(statement) ����
		int ii = 1;
		System.out.println("Exam_Var_6.i >>> : " + Exam_Var_6.i);
		//���� ���� ii �� �Լ� �ȿ� �����Ƿ� Exam_Var_6.ii�� ǥ�� �Ұ���
		//System.out.println("Exam_Var_6.ii >>> : " + Exam_Var_6.ii);
		System.out.println("ii >>> : " + ii);
	} //end of main()
} //end of Exam_Var_6 class