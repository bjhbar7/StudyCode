package a.b.c.ch3;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;
import a.b.c.ch3.LoginService_101;

public class LoginServiceImpl implements LoginService_101 {

		@Override
		public  ArrayList<HelloVO_101> loginTest(HelloVO_101 hvo) {
		
		ArrayList<HelloVO_101> aList = null;
		aList = new ArrayList<HelloVO_101>();

		aList.add(hvo);

		return aList;
		}

		@Override
		public ArrayList<HelloVO> loginTest(HelloVO hvo) {
			// TODO Auto-generated method stub
			return null;
		}
	}