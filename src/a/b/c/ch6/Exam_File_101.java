//package 선언
package a.b.c.ch6;
//import 선언
import java.io.File;
//class 선언
public class Exam_File_101 {
	/*
	 * createNewFile() :
	 * 	public boolean createNewFile() throws IOException
       	true if the named file does not exist and was successfully created; false if the named file already exists
	 * mkdir() :
	 * 	public boolean mkdir()
	  	true if and only if the director along with all necessary parent directories;y was created; false otherwise
	 * mkdirs()
	 *	public boolean mkdirs()
	 	true if and only if the directory was created, along with all necessary parent directories; false otherwise
	 * File 클래스가 가르키는  기본 위치(default directory)를 꼭 확인하고 사용해야 한다.
	 * */
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_File_101.main() 진입 >>>>");
		//public class File
		//java.io.File
		File f = new File("배진량");
		System.out.println("Exam_File_101.main() File f >>> : " + f);
		//public String getName()
		System.out.println("f.getName() >>> : " + f.getName());
		
		File fd = new File("aaaa");
		System.out.println("Exam_File_101.main() File fd >>> : " + fd);
		System.out.println("fd.getName() >>> : " + fd.getName());
		
		File fds = new File("aa/bb/cc");
		System.out.println("Exam_File_101.main() File fds >>> : " + fds);
		System.out.println("fds.getName() >>> : " + fds.getName());
		
		try {
			System.out.println("Exam_File_101.main().try{} >>>>");
			//public boolean createNewFile() throws IOException
			boolean b = f.createNewFile();
			System.out.println("Exam_File_101.main().try{} boolean b >>> : " + b);
			
			//public boolean isDirectory()
			//true if and only if the file denoted by this abstract pathname exists and is a directory; false otherwise
			boolean bdir = f.isDirectory();
			System.out.println("bdir >>> : " + bdir);
			//public boolean isFile()
			//true if and only if the file denoted by this abstract pathname exists and is a normal file; false otherwise
			boolean bfile = f.isFile();
			System.out.println("bfile >>> : " + bfile);
			
			//public boolean mkdir()
			//true if and only if the directory was created; false otherwise
			boolean bd = fd.mkdir();
			System.out.println("bd >>> : " + bd);
			
			boolean bddir = fd.isDirectory();
			System.out.println("bddir >>> : " + bddir);
			boolean bdfile = fd.isFile();
			System.out.println("bdfile >>> : " + bdfile);
			
			//public boolean mkdirs()
			//true if and only if the directory was created, along with all necessary parent directories; false otherwise
			boolean bds = fds.mkdirs();
			System.out.println("bds >>> : " + bds);
			
			boolean bdsdir = fds.isDirectory();
			System.out.println("bdsdir >>> : " + bdsdir);
			boolean bdsfile = fds.isFile();
			System.out.println("bdsfile >>> : " + bdsfile);
			//public class Exception
			//java.lang.Exception
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace(); : 사용하지 않는다.
			
			//java.lang.Throwable
			//public class Throwable
			//public String getMessage()
			//the detail message string of this Throwable instance (which may be null).
			System.out.println("에러가 >>> : " + e.getMessage());
		}//end of try catch
	}//end of main()

}//end of Exam_File_101
