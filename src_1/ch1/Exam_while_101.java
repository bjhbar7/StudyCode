//package : keyword :ch1 ���丮�� Exam_while_101 class�� �����Ѵ�.
package ch1;

//�ݺ��� : for, while ���� ���� false ����� �Ұ����ϴ�.
//���ǹ� : if ���� ���� false ����� �����ϴ�.
public class Exam_while_101 {
	//�ܼ� ���ø����̼��� ���� �����̴�. : ��������Ʈ ������� �����Ѵ�.
	public static void main(String args[]) {
	

		/*
		for ( ; ; ) {
		} 
		for ���� for �ڿ� ()�� �־ �ݺ��� �ȴ�.
		*/
		/*
		while () {
		}
		while ���� ()�� ������ ������ �ȵȴ�.

		while (false) {
		}
		while ���� ()�ȿ� false ����� �Ұ����ϴ�
		*/
		//boolean : �ڷ��� : 1byte ���� : true �� false�� �����Ѵ�.
		boolean bool = false;
		//while : keyword : �ݺ��� () �ӿ� ���ǽ��� true�̸� while���� �ݺ��Ѵ�. : () �ӿ� false�� ���� ��� �Ұ����ϴ�.
		while (bool) {
			System.out.println(">>>>>>>");
		}
		//int : �ڷ��� : 4byte ���� : ���� 
		//�������� : �ʱ�ȭ�� �ؼ� ������ش�.
		int num = 1;
		int sum = 0;
		int count = 0;
		//while : keyword : �ݺ��� :() �ӿ� ���ǽ��� true�� while���� �ݺ��Ѵ�. 
		while (num <= 10) {
			
			//������ : ������ +1�� �Ѵ�.
			count++;
			//+= : ������ ���� ���� �� �����Ѵ�.
			sum += num;
			
			System.out.println(count+"��°������ sum�� ���� : " + sum);
			//if : ���ǹ� : () �ӿ� ���ǽ��� true�� if���� �����Ѵ�.
			if (sum > 20) {
				//break : while �ݺ����� ������ Ű����
				break;
			}
			//������ : ������ +1�� �Ѵ�.
			num++;
			
		}
		//System : java.lang.System class
		//System.out.println(); : ()�� ������ ����Ѵ�.
		System.out.println("1���� " + count + "���� ���� " + sum + "�Դϴ�.");
		System.out.println(count + "�� ����߽��ϴ�.");

	} // end of main()
} // end of Exam_while_101