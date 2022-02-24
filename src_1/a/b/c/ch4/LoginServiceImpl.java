package a.b.c.ch4;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;

public class LoginServiceImpl implements LoginService {

	@Override
	public ArrayList<HelloVO> loginTest(HelloVO hvo) {
		// TODO Auto-generated method stub
		
		// 비즈니스 로직을 거쳐서 데이터베이스에 다녀오는 로직이 들어올 예정이다.
		ArrayList<HelloVO> aList = null;
		aList = new ArrayList<HelloVO>();
		
		aList.add(hvo);
		
		return aList;
	}

}
