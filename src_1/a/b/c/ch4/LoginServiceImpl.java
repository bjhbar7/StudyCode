package a.b.c.ch4;

import java.util.ArrayList;

import a.b.c.ch3.HelloVO;

public class LoginServiceImpl implements LoginService {

	@Override
	public ArrayList<HelloVO> loginTest(HelloVO hvo) {
		// TODO Auto-generated method stub
		
		// ����Ͻ� ������ ���ļ� �����ͺ��̽��� �ٳ���� ������ ���� �����̴�.
		ArrayList<HelloVO> aList = null;
		aList = new ArrayList<HelloVO>();
		
		aList.add(hvo);
		
		return aList;
	}

}
