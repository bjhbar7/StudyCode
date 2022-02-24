//package : keyword : ch1 ���丮�� Exam_For_702 class�� �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ calss�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ������ ���� + �Լ��̴�
public class Exam_For_702 {
	
	/*
	forTest �Լ��� ���ϰ� ���� �����Ѵ�.
	�Ű������� int �� �迭�̴�.
	int �� �迭�� ���������� iArr_forTest �̴�.
	forTest �Լ��� ȣ���� ���� �μ�(�ƱԸ�Ʈ)�� int �� �迭�� ���������� �Ѱܾ� �Ѵ�.
	�� �������� �������� �ʾƵ� �ȴ�.
	*/
	//(int iArr_forTest[]) : int�� iArr_fortest[] ���������� �迭(��ü) �μ��� �޴´�. 
	public void forTest(int iArr_forTest[]) {
		
		System.out.println("forTest() �Լ��� ���� >>>>>> ");
		System.out.println("iArr_forTest[]�� �ּҰ� >>>> "  + iArr_forTest);

		//���� ������ �ʱ�ȭ�� �Ͽ��� ����Ѵ�.
		int iArrLen = 0;
		
		// iArr_forTest�� �迭�� null �ƴϰ� iArr_forTest.length�� 0���� ũ�� true�� if���� �����Ѵ�.
		if (iArr_forTest != null && iArr_forTest.length > 0) {
			
			iArrLen = iArr_forTest.length;
			// �迭�� ���̸� �ֿܼ� ����غ���
			System.out.println("iArr_forTest.length >>> : " + iArrLen);
			//for : from to loop : �ݺ���
			//int i�� iArrLen���� ������ true�� ǥ������ �ݺ��Ѵ�.
			for (int i = 0; i < iArrLen; i++) {
				System.out.println("iArr_forTest["+i+"] >>> :"+iArr_forTest[i]);
			}
		} else { // else : if ���� false �� �� �����Ѵ�.
			System.out.println("�����Ͱ��� ����� �����ּ���.");
		}
		
	} //end of forTest()
	
	//�ܼ� ���ø����̼��� ���� �����̴� : ��������Ʈ ������� ����ȴ�.
	public static void main(String args[]) {
		/*
		��������
		int �����ڷ����̸鼭 �迭�� �ν��Ͻ�(��ü��)�ؼ� ���������� ����Ѵ�.
		iArr_main : ��������
		int �� �迭�� iArr_main �������� 1���� �迭�� ����� ���ÿ� �ʱ�ȭ�ߴ�.
		*/
		int iArr_main[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("iArr_main�� �ּҰ� >>>> : " + iArr_main);
		
		//����� ���� Exam_For_702 Ŭ������ ����ϱ� ���� �ν��Ͻ� �ߴ�.(�޸𸮿� �÷ȴ�.)
		//���� ������ ef7 �̴�.
		Exam_For_702 ef7 = new Exam_For_702();
		System.out.println("Exam_For_702�� �ּҰ� >>>> : " + ef7);
		
		//���� ���� ef7_1�� �̿��ؼ� Exam_For_7_1 Ŭ������ �ڿ� ��
		//forTest() �Լ��� ȣ���ϰ� �Լ��� �Ű������� �μ� iArr_main �迭 ���������� �Ѱ��ش�.
		//iArr_main : �μ�, argument
		//�޸𸮿� �ö� forTest �Լ��� ��������Ʈ ������� ����ȴ�.
		ef7.forTest(iArr_main);

	}//end of main()
}//end of class