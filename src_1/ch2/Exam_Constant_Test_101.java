package ch2;

import ch2.Exam_Constant_101;

public class Exam_Constant_Test_101 {

	public static void main(String args[]) {
	

		String fileUploadPath = Exam_Constant_101.FILE_UPLOAD_PATH;
		System.out.println("fileUploadPath >>>>>> : " + fileUploadPath);
		String img_Upload_Path = Exam_Constant_101.IMG_UPLOAD_PATH;
		System.out.println("img_Upload_Path >>>>>>>>> : " + img_Upload_Path);
		int file_Upload_Size = Exam_Constant_101.FILE_UPLOAD_SIZE;
		System.out.println("file_Upload_Size >>>>>>>>> : " + file_Upload_Size);
		int img_Upload_Size = Exam_Constant_101.IMG_UPLOAD_SIZE;

		String jdbc_Driver = Exam_Constant_101.JDBC_DRIVER;
		System.out.println("jdbc_Driver >>>>>>>> : " + jdbc_Driver);
		String jdbc_Url = Exam_Constant_101.JDBC_URL;
		System.out.println("jdbc_Url >>>>>>> : " + jdbc_Url);
		String jdbc_User = Exam_Constant_101.JDBC_USER;
		System.out.println("jdbc_User >>>>>>>> : " + jdbc_User);
		String jdbc_Pwd = Exam_Constant_101.JDBC_PWD;
		System.out.println("jdbc_Pwd >>>>>>>> : " + jdbc_Pwd);
	}
}