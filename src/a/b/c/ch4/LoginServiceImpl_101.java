package a.b.c.ch4;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO_101;

public class LoginServiceImpl_101 implements LoginService_101 {

	@Override
	public  ArrayList<HelloVO_101> loginTest(HelloVO_101 hvo) {
	
	ArrayList<HelloVO_101> aList = null;
	aList = new ArrayList<HelloVO_101>();

	aList.add(hvo);

	return aList;
	}
}