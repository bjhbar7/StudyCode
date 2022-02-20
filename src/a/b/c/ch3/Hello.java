package a.b.c.ch3;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("안녕 이클립스 ㅎㅎㅎ!!!");
		
		HelloInterface hif = new HelloInterfaceImpl();
		hif.interfaceFunc();
		
		HelloVO hvo = new HelloVO();
		hvo.setMid("BJR");
		hvo.setMpw("BJR00");
		hvo.setMname("배진량");
		
		System.out.print(hvo.getMid() +" ");
		System.out.print(hvo.getMpw() +" ");
		System.out.println(hvo.getMname());
	}

}
