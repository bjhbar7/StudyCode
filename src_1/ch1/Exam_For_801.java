//package : keyword : ch1 ���丮�� Exam_For_801 Ŭ������ �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ���� + �Լ��� �����Ǿ� �ִ�.
public class Exam_For_801 {
	//�ܼ� ���ø����̼��� ���������̴�. : �Լ��� interpreter ������� �����Ѵ�.
	public static void main(String args[]) {
		
		
		//for �� : from to loop : �ݺ��� : Ư�� ���Ǻ��� Ư�� ���Ǳ��� �ݺ��Ѵ�.
		for (int i=0; i<3; i++) {
			System.out.println("i >>>>> : " + i);
		}

		for (int i=0; i<3; i++) {
			System.out.println("i >>>>> : " + i);
			for (int j=0; j<3; j++) {
				System.out.print(" j >>>>> : " + j);
			}
			System.out.println();
		}
		// int�� �迭�� ���� iArr ���� ������ �����ϰ� {1,2,3} �ּҰ����� �ʱ�ȭ�Ѵ�. : �� index�� ��ü�̴�.
		int iArr[] = {1,2,3};
		for (int i = 0; i<3; i++) {
			System.out.println("iArr["+i+"] >>>> : "+iArr[i]);
		}
		// 2�� �迭
		int iArr2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		for (int i = 0; i<3; i++) {
			// 2�� �迭 iArr2[i]�� �ּҰ��� Ȯ���Ѵ�.
			System.out.println("iArr["+i+"] >>>> : " +iArr2[i]);
			for (int j = 0; j<3; j++) {
				// 2�� �迭 iArr2[i][j]�� ���� Ȯ���Ѵ�.
				System.out.println("iArr["+i+"]["+j+"] >>>> : " + iArr2[i][j]);
			}
		}

		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				System.out.print(iArr2[i][j]+" ");
			}
			System.out.println();
		}
	}//end of main()
}//end of Exam_For_801