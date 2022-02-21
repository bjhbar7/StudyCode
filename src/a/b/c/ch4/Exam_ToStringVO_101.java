package a.b.c.ch4;

public class Exam_ToStringVO_101 {
	private int ival;
	private String sval;
	
	
	public Exam_ToStringVO_101() {
	
	}

	public Exam_ToStringVO_101(int ival, String sval) {
	
		this.ival = ival;
		this.sval = sval;
	}
	
	public int getIval() {
		return ival;
	}
	public void setIval(int ival) {
		this.ival = ival;
	}
	public String getSval() {
		return sval;
	}
	public void setSval(String sval) {
		this.sval = sval;
	}
	
	public String toString() {
		return sval + " , " + ival;
	}
}
