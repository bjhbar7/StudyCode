package ch2;
//extends java.lang.Object�� �����Ǿ� �ִ�.
public class Class_A_101 {
	
	public Class_A_101 () {
		System.out.println("Class_A_101() �������� ���� >>>>>>");
	}

	public Class_A_101 (String s) {
		System.out.println("Class_A_101(String s) �������� ���� >>>>>>" +s);
	}

	public void aM_101() {
		System.out.println("aM_101() �Լ��� ���� >>>>>>");
	}

	public String bM_101() {
		System.out.println("bM_101() �Լ��� ���� >>>>>>");
		return "bM_101() �Լ� >>>>> ";
	}
/*
	@Override
	//public String toString()
	// getClass().getName() + '@' + Integer.toHexString(hashCode())
	public String toString() {
		System.out.println("Class_A_101���� ���� toString()");
		return "toString() >>>>>>>>> : ";
	}
*/
}