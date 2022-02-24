//package : ch1 디렉토리에 Exam_For_802 class를 저장한다.
//; : 문장(statement) 종결
package ch1;

//public : 접근 제한자 : Access Modifier : 같은 패키지, 다른 패키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class의 구성은 변수 + 함수이다. : Exam_For_802는 1개의 main() 함수로 구성되어있다.
public class Exam_For_802 {
	//콘솔 어플리케이션의 시작 지점이다 : 인터프리트 방식으로 진행한다.
	public static void main(String args[]) {
		//for 문 : from to loop : 반복문 : 특정 조건부터 특정 조건까지 반복해서 수행한다.
		//for문 속에 for문은 배열을 의미한다.
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
		//2차원 배열 : int iArr[][] = new int[][]{};
		int iArr[][] = {{1,2,3},{1,2,3},{1,2,3}};
		//iArr의 주소값 확인 : log를 찍어본다.
		System.out.println("iArr[][] >>>>> : " + iArr);

		int iArrLeng = iArr.length;
		//iArr.length : iArr의 길이를 확인
		System.out.println("iArr.length >>> : " + iArrLeng);		
		for (int i = 0; i<iArrLeng; i++) {
			//iArr[i]의 주소값 확인
			System.out.println("iArr["+i+"][] >>>> : " + iArr[i]);
			int iArrLeng_2 = iArr[i].length;
			//iArr[i].length : iArr[i]의 길이 확인
			System.out.println("iArr["+i+"].length >>> : " + iArrLeng_2);
			for ( int j = 0; j<iArrLeng_2; j++) {
				//iArr[i][j]의 값을 확인
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