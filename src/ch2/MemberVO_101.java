package ch2;

// 회원가입 프로그램에서 회원정보를 나르는 클래스 
public class MemberVO_101 {
	
	public String mid;
	public String mpw;
	public String mname;
	public String mhp;
	public String maddr;
	
	/* 생성자 만드는 규칙 : 클래스이름 () {}
	1.클래스이름 선언 (사용하려고 하는 클래스이름과 동일하게 선언)
	2.() 소괄호에 매개변수를 사용할 수 있다.
	3.{} 블럭에서 클래스를 인스턴스 하면서 맨 먼저 해야할 함수(동작을) 선언한다.
	4.생성자는 맴버변수를 초기화 한다.
	*/
	//매개 변수가 없는 기본 생성자
	public MemberVO_101() {
		System.out.println("mid >>> : " + mid);
		System.out.println("mpw >>> : " + mpw);
		System.out.println("mname >>> : " + mname);
		System.out.println("mhp >>> : " + mhp);
		System.out.println("maddr >>> : " + maddr);
	}
	//매개 변수가 있는 생성자
	public MemberVO_101(String mid, String mpw, String mname, String mhp, String maddr) {
		System.out.println("mid >>> : " + mid);
		System.out.println("mpw >>> : " + mpw);
		System.out.println("mname >>> : " + mname);
		System.out.println("mhp >>> : " + mhp);
		System.out.println("maddr >>> : " +maddr + "\n");
	}
}