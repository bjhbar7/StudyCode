package a.b.c.ch4;

//java.lang.Object
//public class Object : Since:JDK1.0
public class Exam_ToStringVO extends Object{
	
	//멤버 변수
	private String sval;
	private int ival;
	
	//매개 변수가 없는 기본생성자
	public Exam_ToStringVO() {
		
	}
	//매개 변수가 있는 생성자
	public Exam_ToStringVO(String sval, int ival) {
		
		this.sval = sval;
		this.ival = ival;
	}
	
	//getter
	public String getSval() {
		return sval;
	}
	public int getIval() {
		return ival;
	}
	//setter
	public void setSval(String sval) {
		this.sval = sval;
	}
	public void setIval(int ival) {
		this.ival = ival;
	}
	//Exam_ToStringVO class를 사용하는 블럭에서 toString() 함수를 호출하면, 재정의된 toString()의 값이 리턴된다.
	@Override
	public String toString() {		
		return sval + " , " + ival;
	}	
}
