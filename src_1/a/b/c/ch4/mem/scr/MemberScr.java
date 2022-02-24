package a.b.c.ch4.mem.scr;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch4.mem.service.MemberService;
import a.b.c.ch4.mem.service.MemberServiceImpl;
import a.b.c.ch4.mem.vo.MemberVO;

public class MemberScr {
	
	//회원을 가입(입력), 수정, 삭제, 조회
	//CRUD : CREATE 입력, READ 조회, UPDATE 수정, DELETE 삭제
	//ISUD : INSERT 입력, SELECT 조회, UPDATE 수정, DELETE 삭제
	
	//회원 조회
	public ArrayList<MemberVO> memSelect() {
		System.out.println("MemberScr.memSelect() 시작 >>> : ");
		MemberService ms = new MemberServiceImpl();
		ArrayList<MemberVO> aList = ms.memSelect();
		return aList;
	}
	
	//회원 가입
	public int memInsert(MemberVO mvo) {
		System.out.println("MemberScr.memInsert() 시작 >>> : ");
		MemberService ms = new MemberServiceImpl();
		int nCnt = ms.memInsert(mvo);
		return nCnt;
	}
	
	//회원 수정
	public int memUpdate(MemberVO mvo) {
		System.out.println("MemberScr.memUpdate() 시작 >>> : ");
		return 0;
	}
	
	//회원 삭제
	public int memDelete(MemberVO mvo) {
		System.out.println("MemberScr.memDelete() 시작 >>> : ");
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mid = "";
		String mpw = "";
		String mname = "";
		String mhp = "";
		String maddr = "";
		
		System.out.println("CRUD를 선택하세요 >>> ");
		System.out.println("I 입력, S 조회, U 수정, D 삭제, Q 종료");
		Scanner sc =new Scanner(System.in);
		String crudType = "";
		
		while(true) {
		
			crudType = sc.next();
			crudType = crudType.toUpperCase();
			
			if("I".equals(crudType)) {
				System.out.println("MemberScr.main() 시작 >>> : crudType ::: " + crudType);
				MemberScr mcsr_I = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_I.memInsert(mvo);
			}
			if("S".equals(crudType)) {
				System.out.println("MemberScr.main() 시작 >>> : cruType ::: " + crudType);
				MemberScr mcsr_S = new MemberScr();
				mcsr_S.memSelect();
			}
			if("U".equals(crudType)) {
				System.out.println("MemberScr.main() 시작 >>> : cruType ::: " + crudType);
				MemberScr mcsr_U = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_U.memUpdate(mvo);
			}
			if("D".equals(crudType)) {
				System.out.println("MemberScr.main() 시작 >>> : cruType ::: " + crudType);
				MemberScr mcsr_D = new MemberScr();
				MemberVO mvo = new MemberVO();
				mcsr_D.memDelete(mvo);
			}
			if("Q".equals(crudType)) {
				System.out.println("MemberScr.main() 시작 >>> : cruType ::: " +crudType);
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

}
