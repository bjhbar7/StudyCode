package a.b.c.ch5;

@SuppressWarnings("serial")
class IDFormatException extends Exception{
	public IDFormatException(String s) {
		super(s);
	}
}

class IDFormatTest{
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException {
		
		if (userID == null) {
			IDFormatException ide = new IDFormatException("���̵�� null�� �� �����ϴ�.");
			throw ide;
		}else if (userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException("���̵�� 8~20�� ���� �Դϴ�.");
		}
		this.userID = userID;
	}
}

public class Exam_Throw_102 {
	
	public static void main(String[] args) {
		
		IDFormatTest idt = new IDFormatTest();
		
		String userID = null;
		try {
			idt.setUserID(userID);
		}catch (IDFormatException i) {
			System.out.println("i.getMessage() >>> : " + i.getMessage());
		}
		
		userID = "1234567";
		try {
			idt.setUserID(userID);
		}catch (IDFormatException i) {
			System.out.println("i.getMessage() >>> : " + i.getMessage());
		}
		
		System.out.println("try-catch �� ���� >>> : ");
	}
}
