package a.b.c.ch4;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Variable_Case_101 {

	public void variableCaseTest(int i
								, String s
								, int iv[]
								, ArrayList aList
								, Date d
								, Calendar c
								, VariableVO vo) {
		System.out.println("variableCaseTest ::: int i >>>> : " + i);
		System.out.println("variableCaseTest ::: String s >>>> : " + s);
		System.out.println("variableCaseTest ::: int iv[] >>>> : " + iv);
		System.out.println("variableCaseTest ::: ArrayList aList >>>> : " + aList);
		System.out.println("variableCaseTest ::: Date d >>>> : " + d);
		System.out.println("variableCaseTest ::: Calendar c >>>> : " + c);
		System.out.println("variableCaseTest ::: VariableVO vo >>>> : " + vo);
	}

	public ArrayList variableCaseTest_1(ArrayList aList) {
		
		if ( aList != null && aList.size() > 0) {

			for (int i = 0; i < aList.size(); i++) {
				System.out.println("variableCaseTest_1() ::: aList.get(" + i + ") >>>> : " 
									+ aList.get(i));
			}
		}
		return aList;
	}

	public static void main(String args[]) {
	
		int i = 0;
		String s = "abc";
		int iv[] = new int[]{1,2,3};
		ArrayList aList = new ArrayList();
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		VariableVO vo = new VariableVO();

		System.out.println("Variable_Case_101 ::: int i >>>> : " + i);
		System.out.println("Variable_Case_101 ::: String s >>>> : " + s);
		System.out.println("Variable_Case_101 ::: int iv[] >>>> : " + iv);
		System.out.println("Variable_Case_101 ::: ArrayList aList >>>> : " + aList);
		System.out.println("Variable_Case_101 ::: Date d >>>> : " + d);
		System.out.println("Variable_Case_101 ::: Calendar c >>>> : " + c);
		System.out.println("Variable_Case_101 ::: VariableVO vo >>>> : " + vo);
		
		Variable_Case_101 vc= new Variable_Case_101();
		vc.variableCaseTest(i,s,iv,aList,d,c,vo);

		ArrayList aList_1 = new ArrayList();
		aList_1.add(i);
		aList_1.add(s);
		aList_1.add(iv);
		aList_1.add(aList);
		aList_1.add(d);
		aList_1.add(c);
		aList_1.add(vo);

		ArrayList aList_2 = vc.variableCaseTest_1(aList_1);
		if (aList_2 != null && aList_2.size() >0 ) {

			//Variable_Case_101.java:70: error: variable i is already defined in method main(String[])
            //          for (int i = 0; i < aList_2.size(); i++) {
			for (int n = 0; n < aList_2.size(); n++) {
				System.out.println("aList_2 ::: aList.get(" + n + ") >>>> : " + aList.get(n));
			}
		}
		
	}
}

/*
ArrayList<> aList = new ArrayList();를 사용해야하는데, 
ArrayList aList = new ArrayList();로 그냥 사용할 경우...

C:\00.KOSMO108_BJR\10.JExam\eclipseTest\javaProject_101\src\a\b\c\ch4>javac -d . Variable_Case_101.java VariableVO.java
Note: Variable_Case_101.java uses unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.

-Xlint 처리해줘야한다.

C:\00.KOSMO108_BJR\10.JExam\eclipseTest\javaProject_101\src\a\b\c\ch4>javac -d . -Xlint Variable_Case_101.java VariableVO.java

C:\00.KOSMO108_BJR\10.JExam\eclipseTest\javaProject_101\src\a\b\c\ch4>java a.b.c.ch4.Variable_Case_101

Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        at java.util.ArrayList.rangeCheck(ArrayList.java:657)
        at java.util.ArrayList.get(ArrayList.java:433)
        at a.b.c.ch4.Variable_Case_101.main(Variable_Case_101.java:73)
*/