package a.b.c.ch4;

public class Exam_ToString_101 {
	
	//java.lang.Object�� toString()�� �������� ��, �������̵� ������̼����� ǥ���Ѵ�.
	//Exam_ToString_101 class�� ����ϴ� ������ toString() �Լ��� ȣ���ϸ�, �����ǵ� toString() ���� ���ϵȴ�.
	@Override
	public String toString() {
		
		return "Exam_ToString_101 Ŭ������ �ִ� �������̵��� toString() �Լ� ";
	}
	//�ڹ� console application�� ���������̴�. : �Լ�()�� ��������Ʈ ������� �����Ѵ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam_ToString_101 et_1 = new Exam_ToString_101();
		//et_1�� et_1.toString() �Լ��� �����Ǿ� �ִ�.
		System.out.println("et_1 �� �ּҰ� >>>>> : " + et_1);
		//et_1�� �ּҰ� : a.b.c.ch4.Exam_ToString_101@15db9742
		// public String toString()
		// java.lang.Object
		// getClass().getName() + '@' + Integer.toHexString(hashCode())
		System.out.println("et_1.toString()�� �� >>>>> : " + et_1.toString());
		
		System.out.println("et_1.getClass().getName()�� �� >>>>> : " + et_1.getClass().getName());
		
		Exam_ToStringVO_101 etvo_1 = new Exam_ToStringVO_101();
		etvo_1.setIval(30);
		etvo_1.setSval("������");
		System.out.println("etvo_1.toString() >>>>> : " + etvo_1.toString());
		System.out.println("etvo_1 >>>>> : " + etvo_1);
		
	}//end of main()

}//end of Exam_ToString_101
