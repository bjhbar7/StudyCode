package ch1;

public class Exam_For_902 {
	//console application�� ���� �����̴�. : (�ڹ��� ��� �Լ���) interpreter ������� �����Ѵ�
	public void sArr_Test(String sArr_T[]) {
		System.out.println("Exam_For_902().sArr_Test() ���� >>>> :");
		System.out.println("sArr_Test() ::: sArr�� �ּҰ� >>> : " + sArr_T);
		//���� ������ �ʱ�ȭ�ؼ� ����Ѵ�.
		int sArr_Len = 0;
		int sArr_St_Len = 0;
		//���� �����Ͱ� null���� �����Ͱ� �� ���������� �˿��Ѵ�.
		//if�� sArr_T(���� ������,�Ű� ����)�� null�� �ƴϰ�, ���̰� 0�� �ƴϸ� true�� �ż�, ���ǹ��� �����Ѵ�.
		if (sArr_T != null && sArr_T.length >0) {
			
			sArr_Len = sArr_T.length;
			System.out.println("sArr_T.length >>> : " + sArr_Len);
			
			for (int i = 0; i<sArr_Len; i++) {
				// System.out.println("sArr["+i+"] >>> : " + sArr_T[i]);
				String sArr_St = sArr_T[i];
				sArr_St_Len = sArr_St.length();
				// System.out.println("sArr["+i+"]�� ���� >>> : " + sArr_St_Len);
				for (int j = 0; j<sArr_St_Len; j++) {
					// public char charAt(int index)
					// Returns the char value at the specified index.
					char sArr_ch = sArr_St.charAt(j);
					System.out.print(sArr_ch + " ");
				}
			}
		}
	}

	public static void main(String args[]) {
		//String sArr[] = new String[]{}
		String sArr[] = {"abc","def","ghi"};
		
		System.out.println("main ::: sArr�� �ּҰ� >>> : " + sArr);
		new Exam_For_902().sArr_Test(sArr);
	} //end of main()
} // end of Exam_For_902