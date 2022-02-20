package a.b.c.ch4;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch3.HelloVO;

public class LoginTest {
	
	public int loginTest(HelloVO hvo) {
		
		int nCnt = 0;
		
		LoginService ls = new LoginServiceImpl();		
		
		ArrayList<HelloVO> aList = ls.loginTest(hvo);
		
		if (aList !=null && aList.size() > 0) {
			
			for (int i=0; i < aList.size(); i++) {
				
				HelloVO _hvo = aList.get(i);
				
				if (   "KID".equals(_hvo.getMid().toUpperCase()) 
					&& "KPW".equals(_hvo.getMpw().toUpperCase())) {
					
					nCnt++;
				}
			}			
		}
		
		return nCnt;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mid = "";
		String mpw = "";
		
		System.out.println("�����͸� �Է��Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� >>> : ");
		mid = sc.next();
		System.out.println("�н����� >>> : ");
		mpw = sc.next();
		
		
		HelloVO hvo = new HelloVO();
		hvo.setMid(mid);
		hvo.setMpw(mpw);
			
		LoginTest lt = new LoginTest();		
		
		// public int loginTest(HelloVO hvo)
		int nCnt = lt.loginTest(hvo);
		System.out.println("nCnt >>> : " + nCnt);
		
		if (nCnt == 1) {
			System.out.println("�α��� ���� >>> : ");
		}else {
			System.out.println("�α��� ���� >>> : ");
		}
			
	}
}
