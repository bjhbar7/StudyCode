package a.b.c.ch6;

public class Exam_File_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//public static String getProperty(String key)
		//the string value of the system property, or null if there is no property with that key.
		String javaVersion = System.getProperty("java.version");
		System.out.println("javaVersion >>> : " + javaVersion);
		
		String userDir = System.getProperty("user.dir");
		System.out.println("userDir 현재디렉토리 >>> : " + userDir);
		
		String osName = System.getProperty("os.name");
		System.out.println("osName 운영체제이름 >>> : " + osName);
		
		String userHome = System.getProperty("user.home");
		System.out.println("userHome 유저홈 >>> : " + userHome);
		
		String fileSeparator = System.getProperty("file.separator");
		System.out.println("fileSeparator 파일 구분문자 >>> : " + fileSeparator);
		//public static final String separator
		//The system-dependent default name-separator character, represented as a string for convenience. 
		//This string contains a single character, namely separatorChar.
		System.out.println("java.io.File.separator 파일 구분문자 >>> : " + java.io.File.separator);
	
		System.out.println("\n==============================");
		java.util.Properties p = System.getProperties();
		System.out.println("System.getProperties() \n" + p);
		System.out.println("\n==============================");
		
		System.out.println("\n==============================");
		for (java.util.Enumeration e = p.propertyNames(); e.hasMoreElements();) {
			String key = (String)e.nextElement();
			String value = p.getProperty(key);
			System.out.println(key + "=" + value);
		}
		System.out.println("\n==============================");
		
		System.out.println("\n==============================");
		System.out.println("p.list(System.out) \n");
		p.list(System.out);
		System.out.println("\n==============================");
	}

}
