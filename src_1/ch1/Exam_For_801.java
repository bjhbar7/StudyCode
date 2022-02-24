//package : keyword : ch1 디렉토리에 Exam_For_801 클래스를 저장한다.
package ch1;

//public : 접근 제한자 : Access Modifier : 다른 패키지, 같은 패키지에서 class의 접근을 허용한다.
//class : 자바의 최소 단위 : class는 변수 + 함수로 구성되어 있다.
public class Exam_For_801 {
	//콘솔 어플리케이션의 시작지점이다. : 함수는 interpreter 방식으로 진행한다.
	public static void main(String args[]) {
		
		
		//for 문 : from to loop : 반복문 : 특정 조건부터 특정 조건까지 반복한다.
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
		// int형 배열을 갖은 iArr 참조 변수를 선언하고 {1,2,3} 주소값으로 초기화한다. : 각 index는 객체이다.
		int iArr[] = {1,2,3};
		for (int i = 0; i<3; i++) {
			System.out.println("iArr["+i+"] >>>> : "+iArr[i]);
		}
		// 2차 배열
		int iArr2[][] = {{1,2,3},{1,2,3},{1,2,3}};
		for (int i = 0; i<3; i++) {
			// 2차 배열 iArr2[i]의 주소값을 확인한다.
			System.out.println("iArr["+i+"] >>>> : " +iArr2[i]);
			for (int j = 0; j<3; j++) {
				// 2차 배열 iArr2[i][j]의 값을 확인한다.
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