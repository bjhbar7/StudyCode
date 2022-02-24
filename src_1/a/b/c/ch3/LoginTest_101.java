package a.b.c.ch3;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch3.HelloVO;
import a.b.c.ch4.LoginServiceImpl_101;
import a.b.c.ch4.LoginTest;

public class LoginTest_101 {

	public int loginTest_101(HelloVO_101 hvo) {
		
		int nCnt = 0;

		LoginServiceImpl_101 ls = new LoginServiceImpl_101();

		ArrayList<HelloVO_101> aList = ls.loginTest(hvo);

		if (aList != null && aList.size() > 0) {

			for (int i=0; i < aList.size(); i++) {

				HelloVO_101 _hvo = aList.get(i);

				if(		"KID".equals(_hvo.getMid().toUpperCase()) 
					&&	"KPW".equals(_hvo.getMpw().toUpperCase())) {
						
						nCnt++;
					}
			}
		}
		return nCnt;
	}

	public static void main(String args[]) {

		String mid = "";
		String mpw = "";

		System.out.println("데이터를 입력하시오 >>> : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("아이디 >>> : ");
		mid = sc.next();
		System.out.println("패스워드 >>> : ");
		mpw = sc.next();

		HelloVO hvo = new HelloVO();
		hvo.setMid(mid);
		hvo.setMpw(mpw);

		LoginTest lt = new LoginTest();

		int nCnt = lt.loginTest(hvo);
		System.out.println("nCnt >>> : " + nCnt);

		if (nCnt == 1) {
			System.out.println("로그인 성공 >>> : ");
		} else {
			System.out.println("로그인 실패 >>> : ");
		}
	
	}
}