package a.b.c.ch5;

@SuppressWarnings("serial")
class IDFormatException_1 extends Exception{
	public IDFormatException_1(String s) {
		super(s);
	}
}

class IDFormatTest_1{
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	
	public void setUserID(String userID) throws IDFormatException_1 {
		
		if (userID == null) {
			IDFormatException_1 ide = new IDFormatException_1("아이디는 null일 수 없습니다.");
			throw ide;
		}else if (userID.length() < 8 || userID.length() >20) {
			throw new IDFormatException_1("아이디는 8~20자 이하 입니다.");
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
		
		System.out.println("try-catch 블럭 이후 >>> : ");
	}
}
