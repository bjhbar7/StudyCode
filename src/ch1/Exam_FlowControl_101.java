package ch1;

public class Exam_FlowControl_101 {

	public static void main(String args[]) {
		//if�� : ()�� ������ ture �̸� {} ������ �����Ѵ�.
		if (true) {
			System.out.println(true);
		}

		if (false){
			System.out.println(false);
		}
		//boolean : �����ڷ��� : 1 byte : true �Ǵ� false�� �����Ѵ�.
		//boolean �ڷ����� bool ������ �����ϰ� false�� �ʱ�ȭ �Ѵ�.
		boolean bool = false;
		System.out.println("bool >>> : " + bool );
		if (bool) {
			System.out.println("true bool");
		}
		
		bool = true;
		System.out.println("bool >>> : " + bool );
		//! : ���� ������ : not ������ : true�� false��, false�� true�� �ٲ��ش�.
		System.out.println("!bool >>> : " + !bool );

		if (!bool) {
			System.out.println("true bool");
		}
	}
}