package ch2;

class Interface_B_101_Impl implements Interface_B_101 {
	public void inter_b() {
		System.out.println("Interface_B_101_Impl.inter_b() �Լ� ����");
	}
}

interface Interface_B_101 {

	public void inter_b();
}

class Interface_A_101_Impl implements Interface_A_101 {

	public void inter_a() {
		System.out.println("Interface_A_101_Impl.inter_a() �Լ� ����");
	}
}

interface Interface_A_101 {
	
	public void inter_a();
}

public class Exam_Interface_101 {

	public static void main(String args[]) {
		
		//�θ�_�������̽�Ŭ���� ���� �������� = new �ڽ�Ŭ����������();
		Interface_A_101 ia = new Interface_A_101_Impl();
		ia.inter_a();

		/*
		//�ڽ�_Ŭ���� ���� �������� = new �ڽ�Ŭ����������();
		Interface_A_101_Impl ia2 = new Interface_A_101_Impl();
		ia2.inter_a();
		*/
	}
}