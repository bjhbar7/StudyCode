package ch2;

import ch2.MemberVO_101;

//ȸ������ ���α׷�
public class MemberScr_101 {

	public static void main(String args[]) {
	
		MemberVO_101 mvo = new MemberVO_101();
		System.out.println("mvo �������� �ּҰ� >>> : " +mvo);

		MemberVO_101 mvo_1 = new MemberVO_101("BJR","BJR00","������","010-1111-2222","��õ�� ���");
		System.out.println("mvo_1 �������� �ּҰ� >>> : " +mvo_1);
		System.out.println("MemberVO_101 �Լ� �� mid >>>>>>> :" + mvo_1.mid);
		System.out.println("MemberVO_101 �Լ� �� mpw >>>>>>> :" + mvo_1.mpw);

		MemberVO_101 mvo_2 = new MemberVO_101("PSH","PSH00","�ڼ���","010-1111-2222","����� ���α�");
		System.out.println("mvo_2 �������� �ּҰ� >>> : " +mvo_2);
		/*
		for (int i=0; i<10; i++) {
			MemberVO_101 mvo_3 = new MemberVO_101("AA_" + i, "AA00_" + i, "����_" + i, "010-_"+i,"�����_"+i);
			System.out.println("mvo_3 �������� �ּҰ� >>> :" + mvo_3);
		}
		*/
	}
}