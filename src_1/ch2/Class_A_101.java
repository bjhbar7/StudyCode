package ch2;
//extends java.lang.Object가 생략되어 있다.
public class Class_A_101 {
	
	public Class_A_101 () {
		System.out.println("Class_A_101() 생성자의 시작 >>>>>>");
	}

	public Class_A_101 (String s) {
		System.out.println("Class_A_101(String s) 생성자의 시작 >>>>>>" +s);
	}

	public void aM_101() {
		System.out.println("aM_101() 함수의 시작 >>>>>>");
	}

	public String bM_101() {
		System.out.println("bM_101() 함수의 시작 >>>>>>");
		return "bM_101() 함수 >>>>> ";
	}
/*
	@Override
	//public String toString()
	// getClass().getName() + '@' + Integer.toHexString(hashCode())
	public String toString() {
		System.out.println("Class_A_101에서 변한 toString()");
		return "toString() >>>>>>>>> : ";
	}
*/
}