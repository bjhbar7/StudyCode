package a.b.c.ch4;

import java.util.ArrayList;
import a.b.c.ch3.HelloVO;

public class ArrayListTest_101 {

	public void arrayListTest_1() {
		ArrayList<HelloVO> aList = new ArrayList<HelloVO>();
		
		for(int i=0; i < 3; i++) {
			HelloVO hvo = new HelloVO();
			System.out.println("\nhvo >>> : " + i +  " ::: " + hvo + "\n");
			
			hvo.setMid("BJR_" + i);
			hvo.setMpw("BJR00_" + i);
			hvo.setMname("BJR" + i);
			
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
			aList.add(hvo);
			
			System.out.println("ArrayList>>> : " );
			System.out.println("aList.size() >>> : " + aList.size());
			System.out.println("aList >>> : " + aList);
			
		}
		
		for (int i = 0; i < aList.size(); i++) {
			System.out.println("aList.get (" + i + ") >>> : " + aList.get(i));
			
			HelloVO _hvo = aList.get(i);
			System.out.print(_hvo.getMid() + " ");
			System.out.print(_hvo.getMpw() + " ");
			System.out.println(_hvo.getMname());
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Hello");
		new ArrayListTest_1().arrayListTest_1();
	}
}
