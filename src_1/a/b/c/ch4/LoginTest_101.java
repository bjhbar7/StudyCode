package a.b.c.ch4;

//public class ArrayList<E> : Since:1.2 
//extends AbstractList<E>
//implements List<E>, RandomAccess, Cloneable, Serializable
import java.util.ArrayList;
//public final class Scanner : Since:1.5
//extends Object
//implements Iterator<String>, Closeable
import java.util.Scanner;
//import :
//����� ���� Ŭ���� HelloVO_101�� �����´�.
import a.b.c.ch3.HelloVO_101;

public class LoginTest_101 {

	public int loginTest_101(HelloVO_101 hvo) {
		
		int nCnt = 0;

		LoginService_101 ls = new LoginServiceImpl_101();

		ArrayList<HelloVO_101> aList = ls.loginTest(hvo);

		if (aList != null && aList.size() > 0) {

			for (int i=0; i < aList.size(); i++) {

				HelloVO_101 _hvo = aList.get(i);
				//public String toUpperCase()
				//Converts all of the characters in this String to upper case using the rules of the default locale.
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

		System.out.println("�����͸� �Է��Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);

		System.out.println("���̵� >>> : ");
		mid = sc.next();
		System.out.println("�н����� >>> : ");
		mpw = sc.next();

		HelloVO_101 hvo = new HelloVO_101();
		hvo.setMid(mid);
		hvo.setMpw(mpw);

		LoginTest_101 lt = new LoginTest_101();

		int nCnt = lt.loginTest_101(hvo);
		System.out.println("nCnt >>> : " + nCnt);

		if (nCnt == 1) {
			System.out.println("�α��� ���� >>> : ");
		} else {
			System.out.println("�α��� ���� >>> : ");
		}
	
	}
}