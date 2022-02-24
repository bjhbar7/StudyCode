package a.b.c.ch4;

public class Exam_StringBufferTest_101 {
	
	public static String getBoardSelectAllQuery() {
		
		StringBuffer sb = new StringBuffer();
		//public StringBuffer append(String str)
		//java.lang.StringBuffer Since:JDK1.0
		//Appends the specified string to this character sequence.
		sb.append(" SELECT							\n");
		sb.append("		A.BNUM			BNUM		\n");
		sb.append("		,A.BSUBJECT		BSUBJECT	\n");
		sb.append("		,A.BWRITER		BWRITER		\n");
		sb.append("		,A.BPW			BPW			\n");
		sb.append("		,A.BMEMO		BMEMO		\n");
		sb.append("		,A.BPHOTO		BPHOTO		\n");
		sb.append("		,A.DELETEYN		DELETEYN	\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE \n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE \n");
		sb.append(" FROM							\n");
		sb.append("		MVC_BOARD A					\n");
		sb.append(" WHERE A.DELETEYN = 'Y'			\n");
		sb.append(" OBDER BY 1 DESC					\n");
		
		//public String toString()
		//java.lang.StringBuffer Since:JDK1.0
		/*
		 * Returns a string representing the data in this sequence. A new String object is allocated 
		 * and initialized to contain the character sequence currently represented by this object. 
		 * This String is then returned. Subsequent changes to this sequence do not affect the contents of the String.
		*/
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sqlQuery = Exam_StringBufferTest_101.getBoardSelectAllQuery();
		System.out.println("sqlQuery \n" + sqlQuery);
	}

}
