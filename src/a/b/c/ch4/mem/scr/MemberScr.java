package a.b.c.ch4.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch4.mem.service.MemberService;
import a.b.c.ch4.mem.service.MemberServiceImpl;
import a.b.c.ch4.mem.vo.MemberVO;

public class MemberScr {
	
	// ȸ���� ����(�Է�), ����, ����, ��ȸ 
	// CRUD : CREATE �Է�,  READ ��ȸ,  UPDATE  ����, DELETE ���� 
	// ISUD : INSERT �Է�,  SELECT ��ȸ,  UPDATE  ����, DELETE ����
	
	// ȸ�� ��ȸ
	public ArrayList<MemberVO> memSelect(){
		System.out.println("MemberScr.memSelect() ����  >>> : ");
		
		MemberService ms = new MemberServiceImpl();
		ArrayList<MemberVO> aList = ms.memSelect();
		
		return aList;
	}
	
	// ȸ�� ����
	public int memInsert(MemberVO mvo) {
		System.out.println("MemberScr.memInsert() ����  >>> : ");
		
		MemberService ms = new MemberServiceImpl();
		int nCnt = ms.memInsert(mvo);
		
		return nCnt;
	}
	
	// ȸ�� ����
	public int memUpdate(MemberVO mvo) {
		System.out.println("MemberScr.memUpdate() ����  >>> : ");
		return 0;
	}
	
	// ȸ�� ����
	public int memDelete(MemberVO mvo) {
		System.out.println("MemberScr.memDelete() ����  >>> : ");
		return 0;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String mid = "";
		String mpw = "";
		String mname = "";
		String mhp = "";
		String maddr = "";

		System.out.println("CRUD�� �����ϼ���  >>> ");
		System.out.println("I  �Է�,  S ��ȸ, U ����, D ����, Q ����");
		Scanner sc = new Scanner(System.in);
		String crudType = "";
		
		while (true) {
			
			crudType = sc.next();
			crudType = crudType.toUpperCase();
			
			if ("I".equals(crudType)) {		
				System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
				MemberScr mscr_i = new MemberScr();
				
				MemberVO mvo = new MemberVO();				
				mscr_i.memInsert(mvo);
			}
			if ("S".equals(crudType)) {
				System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
				MemberScr mscr_s = new MemberScr();
				mscr_s.memSelect();
			}
			if ("U".equals(crudType)) {
				System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
				MemberScr mscr_u = new MemberScr();
				
				MemberVO mvo = new MemberVO();				
				mscr_u.memUpdate(mvo);
			}
			if ("D".equals(crudType)) {
				System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
				MemberScr mscr_d = new MemberScr();
				
				MemberVO mvo = new MemberVO();				
				mscr_d.memDelete(mvo);
			}
			
			if ("Q".equals(crudType)) {
				System.out.println("MemberScr.main() ����  >>> : crudType ::: " + crudType);
				System.out.println("���α׷��� �����մϴ�. >>> :");
				break;				
			}
		} // end of while()		
	} // end of main()
} // end of class MemberScr







