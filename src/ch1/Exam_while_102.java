//package : keyword : ch1 ���丮�� Exam_while_102 Ŭ������ �����Ѵ�.
package ch1;

/*
do while ���� : while () ���ǽ��� false���� do {} ǥ������ �� ���� �����Ѵ�.
			() ���ǽĿ� false�� ���� �Է��ص� �۵��Ѵ�.
while ���� : while () ���ǽ��� false�� ������ ���Ѵ�.
*/
//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ Exam_while_102 class�� ���� �� ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ���� + �Լ��� �����Ǿ� �ִ�. : Exam_while_102�� 1���� �Լ��� �����Ǿ��ִ�.
public class Exam_while_102 {
	//�ڹ� �ܼ� ���ø����̼��� ���� �����̴�. : ��������Ʈ ������� �����Ѵ�.
	public static void main(String args[]) {
		//���� ������ �ʱ�ȭ�� ����� �Ѵ�.
		//int : �ڷ��� : 4byte ���� : ����
		//int ���� num ������ �����ϰ� 1�� �ʱ�ȭ�Ѵ�.
		int num = 1;
		//int ���� sum ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		int sum = 0;
		//int ���� count ������ �����ϰ� 0���� �ʱ�ȭ�Ѵ�.
		int count = 0;
		
		//do {} �� ���� �� while () ������ true�̸� �ݺ��� �ϰ� () ������ false�̸� ������.
		do {
			//sum ������ num ���� ���� �� �����Ѵ�.
			sum += num;
			//num ������ +1�� �Ѵ�.
			num++;
			//count ������ +1�� �Ѵ�.
			count++;
		}
		while (num <= 10);
		//while (num >= 10); :() ���ǹ��� false���� do {}�� �� ���� ����ȴ�.
		//System : java.lang.System class
		//System.out.println(); : () �� ������ ����Ѵ�.
		System.out.println(count+"�� ���� ����� >>>> : " + sum);
	} //end of main()
} //end of Exam_while_102