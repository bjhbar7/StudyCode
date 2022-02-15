package ch2;

import a.b.c.ch2.vo.MemberVO_101;

//회원가입 프로그램
public class MemberScr_101 {

	public static void main(String args[]) {
	
		MemberVO_101 mvo = new MemberVO_101();
		System.out.println("mvo 참조변수 주소값 >>> : " +mvo);

		MemberVO_101 mvo_1 = new MemberVO_101("BJR","BJR00","배진량","010-1111-2222","인천시 어디구");
		System.out.println("mvo_1 참조변수 주소값 >>> : " +mvo_1);
		System.out.println("MemberVO_101 함수 밖 mid >>>>>>> :" + mvo_1.mid);
		System.out.println("MemberVO_101 함수 밖 mpw >>>>>>> :" + mvo_1.mpw);

		MemberVO_101 mvo_2 = new MemberVO_101("PSH","PSH00","박성훈","010-1111-2222","서울시 구로구");
		System.out.println("mvo_2 참조변수 주소값 >>> : " +mvo_2);
		/*
		for (int i=0; i<10; i++) {
			MemberVO_101 mvo_3 = new MemberVO_101("AA_" + i, "AA00_" + i, "병은_" + i, "010-_"+i,"서울시_"+i);
			System.out.println("mvo_3 참조변수 주소값 >>> :" + mvo_3);
		}
		*/
	}
}