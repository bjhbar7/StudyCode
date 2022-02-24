//package : ch1 ���丮�� Exam_For_802 class�� �����Ѵ�.
//; : ����(statement) ����
package ch1;

//public : ���� ������ : Access Modifier : ���� ��Ű��, �ٸ� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ������ ���� + �Լ��̴�. : Exam_For_802�� 1���� main() �Լ��� �����Ǿ��ִ�.
public class Exam_For_802 {
	//�ܼ� ���ø����̼��� ���� �����̴� : ��������Ʈ ������� �����Ѵ�.
	public static void main(String args[]) {
		//for �� : from to loop : �ݺ��� : Ư�� ���Ǻ��� Ư�� ���Ǳ��� �ݺ��ؼ� �����Ѵ�.
		//for�� �ӿ� for���� �迭�� �ǹ��Ѵ�.
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<3; j++) {
				//System : java.lang.System class
				//static PrintStream	out
				//void	print(String s)
				//void	print(int i)
				System.out.print("("+i+","+j+") ");
			}
			//void	println()
			//Terminates the current line by writing the line separator string.
			System.out.println();
		}
		/*
		(0,0) (0,1) (0,2)
		(1,0) (1,1) (1,2)
		(2,0) (2,1) (2,2)
		*/

		System.out.println();
	
		for (int i = 0; i<3; i++) {
			for (int j = 0; j<(i+1); j++) {
				System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
		/*
		(0,0)
		(1,0) (1,1)
		(2,0) (2,1) (2,2)
		*/

		System.out.println();

		for (int i = 0; i<3; i++) {
			for (int j = 2; (j+1)>i ; j--) {
				System.out.print("("+i+","+j+") ");
			}
			System.out.println();
		}
		/*
		(0,2) (0,1) (0,0)
		(1,2) (1,1)
		(2,2)
		*/
		//2���� �迭 : int iArr[][] = new int[][]{};
		int iArr[][] = {{1,2,3},{1,2,3},{1,2,3}};
		//iArr�� �ּҰ� Ȯ�� : log�� ����.
		System.out.println("iArr[][] >>>>> : " + iArr);

		int iArrLeng = iArr.length;
		//iArr.length : iArr�� ���̸� Ȯ��
		System.out.println("iArr.length >>> : " + iArrLeng);		
		for (int i = 0; i<iArrLeng; i++) {
			//iArr[i]�� �ּҰ� Ȯ��
			System.out.println("iArr["+i+"][] >>>> : " + iArr[i]);
			int iArrLeng_2 = iArr[i].length;
			//iArr[i].length : iArr[i]�� ���� Ȯ��
			System.out.println("iArr["+i+"].length >>> : " + iArrLeng_2);
			for ( int j = 0; j<iArrLeng_2; j++) {
				//iArr[i][j]�� ���� Ȯ��
				System.out.print(" iArr["+i+"]["+j+"] >>> : " + iArr[i][j]);
			}
			System.out.println();
		}
		/*
		iArr[][] >>>>> : [[I@15db9742
		iArr.length >>> : 3
		iArr[0][] >>>> : [I@6d06d69c
		iArr[0].length >>> : 3
		 iArr[0][0] >>> : 1 iArr[0][1] >>> : 2 iArr[0][2] >>> : 3
		iArr[1][] >>>> : [I@7852e922
		iArr[1].length >>> : 3
		 iArr[1][0] >>> : 1 iArr[1][1] >>> : 2 iArr[1][2] >>> : 3
		iArr[2][] >>>> : [I@4e25154f
		iArr[2].length >>> : 3
		 iArr[2][0] >>> : 1 iArr[2][1] >>> : 2 iArr[2][2] >>> : 3
		*/
	} // end of main()
} // end of Exam_For_802