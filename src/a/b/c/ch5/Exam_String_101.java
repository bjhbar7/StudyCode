package a.b.c.ch5;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exam_String_101 {
	
	public static final String MEMBER_NUM = "M";
	public static final String BOARD_NUM = "B";
	
	public static String mNum(String nCnt) {
		System.out.println("Exam_String_101.mNum () 함수 진입 >>>> ");
		int nn = nCnt.length();
		System.out.println("mNum() int nn >>> : " + nn);
		
		for (int i = nn; i < 4; i++) {
			
			nCnt = "0" + nCnt;
		}
		
		return nCnt;
	}
	
	public static String mNum_1(String nCnt) {
		
		int nn = nCnt.length();
		
		if (1 == nn) {
			nCnt = "000" + nCnt;
		}else if (2 == nn) {
			nCnt = "00" + nCnt;
		}else if (3 == nn) {
			nCnt = "0" + nCnt;
		}
		
		return nCnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		String d = sdf.format(new Date());
		System.out.println("d >>> : " + d);
		
		String mnum = "";
		String nCnt = "";
		
		for (int i=1; i<10; i++) {
			
			nCnt = String.valueOf(i);
			
			mnum = Exam_String_101.MEMBER_NUM
					+ d
					+ Exam_String_101.mNum_1(nCnt);
			
			System.out.println("mnum >>> : " + mnum);
		}
	}

}
