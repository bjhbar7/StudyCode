package ch1;

public class Exam_For_201 {

	public static void main(String args[]) {
		
		/*
		�ڹٿ��� for�� �ʱ�ȭ ���� �׻� �ʱ�ȭ ���� 0���� �ϴµ�
		�������� for ��κ� �迭 �����͸� ó���ϴ´� ����ϱ� �����̴�.
		*/
		//for �� : �ݺ��� : from to loop : (�ʱ�ȭ��; ���ǽ�; ������) : {�ݺ������� ǥ����}
		for ( int i = 0; i<3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; i<3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; i<=3; i++) {
			System.out.println("i >>> :" + i);
		}
		for ( int i = 1; (i-1)<3; i++) {
			System.out.println("i >>> :" + i);
		}
	}
}