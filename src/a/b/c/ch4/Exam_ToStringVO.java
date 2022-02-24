package a.b.c.ch4;

//java.lang.Object
//public class Object : Since:JDK1.0
public class Exam_ToStringVO extends Object{
	
	//��� ����
	private String sval;
	private int ival;
	
	//�Ű� ������ ���� �⺻������
	public Exam_ToStringVO() {
		
	}
	//�Ű� ������ �ִ� ������
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
	//Exam_ToStringVO class�� ����ϴ� ������ toString() �Լ��� ȣ���ϸ�, �����ǵ� toString()�� ���� ���ϵȴ�.
	@Override
	public String toString() {		
		return sval + " , " + ival;
	}	
}
