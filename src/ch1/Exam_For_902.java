package ch1;

public class Exam_For_902 {
	//console application의 시작 지점이다. : (자바의 모든 함수는) interpreter 방식으로 진행한다
	public void sArr_Test(String sArr_T[]) {
		System.out.println("Exam_For_902().sArr_Test() 시작 >>>> :");
		System.out.println("sArr_Test() ::: sArr의 주소값 >>> : " + sArr_T);
		//지역 변수는 초기화해서 사용한다.
		int sArr_Len = 0;
		int sArr_St_Len = 0;
		//들어온 데이터가 null인지 데이터가 빈 데이터인지 검열한다.
		//if문 sArr_T(들어온 데이터,매개 변수)가 null이 아니고, 길이가 0이 아니면 true가 돼서, 조건문을 실행한다.
		if (sArr_T != null && sArr_T.length >0) {
			
			sArr_Len = sArr_T.length;
			System.out.println("sArr_T.length >>> : " + sArr_Len);
			
			for (int i = 0; i<sArr_Len; i++) {
				// System.out.println("sArr["+i+"] >>> : " + sArr_T[i]);
				String sArr_St = sArr_T[i];
				sArr_St_Len = sArr_St.length();
				// System.out.println("sArr["+i+"]의 길이 >>> : " + sArr_St_Len);
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
		
		System.out.println("main ::: sArr의 주소값 >>> : " + sArr);
		new Exam_For_902().sArr_Test(sArr);
	} //end of main()
} // end of Exam_For_902