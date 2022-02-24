package a.b.c.ch4.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch4.mem.service.MemberService;
import a.b.c.ch4.mem.service.MemberServiceImpl;
import a.b.c.ch4.mem.vo.MemberVO;

public class MemberScr {
	
	//ȸ���� ����(�Է�), ����, ����, ��ȸ
	//CRUD : CREATE �Է�, READ ��ȸ, UPDATE ����, DELETE ����
	//ISUD : INSERT �Է�, SELECT ��ȸ, UPDATE ����, DELETE ����
	
	//ȸ�� ��ȸ
	public ArrayList<MemberVO> memSelect() {
		System.out.println("MemberScr.memSelect() ���� >>> : ");
		MemberService ms = new MemberServiceImpl();
		ArrayList<MemberVO> aList = ms.memSelect();
		return aList;
	}
	
	//ȸ�� ����
	public int memInsert(MemberVO mvo) {
		System.out.println("MemberScr.memInsert() ���� >>> : ");
		MemberService ms = new MemberServiceImpl();
		int nCnt = ms.memInsert(mvo);
		return nCnt;
	}
	
	//ȸ�� ����
	public int memUpdate(MemberVO mvo) {
		System.out.println("MemberScr.memUpdate() ���� >>> : ");
		return 0;
	}
	
	//ȸ�� ����
	public int memDelete(MemberVO mvo) {
		System.out.println("MemberScr.memDelete() ���� >>> : ");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mid = "";
		String mpw = "";
		String mname = "";
		String mhp = "";
		String maddr = "";
		
		System.out.println("CRUD�� �����ϼ��� >>> ");
		System.out.println("I �Է�, S ��ȸ, U ����, D ����, Q ����");
		Scanner sc =new Scanner(System.in);
		String crudType = "";
		
		while(true) {
		
			crudType = sc.next();
			crudType = crudType.toUpperCase();
			
			if("I".equals(crudType)) {
				System.out.println("MemberScr.main() ���� >>> : crudType ::: " + crudType);
				MemberScr mcsr_I = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_I.memInsert(mvo);
			}
			if("S".equals(crudType)) {
				System.out.println("MemberScr.main() ���� >>> : cruType ::: " + crudType);
				MemberScr mcsr_S = new MemberScr();
				mcsr_S.memSelect();
			}
			if("U".equals(crudType)) {
				System.out.println("MemberScr.main() ���� >>> : cruType ::: " + crudType);
				MemberScr mcsr_U = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_U.memUpdate(mvo);
			}
			if("D".equals(crudType)) {
				System.out.println("MemberScr.main() ���� >>> : cruType ::: " + crudType);
				MemberScr mcsr_D = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_D.memDelete(mvo);
			}
			if("Q".equals(crudType)) {
				System.out.println("MemberScr.main() ���� >>> : cruType ::: " +crudType);
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
		}
	}

}
