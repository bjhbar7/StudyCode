package a.b.c.ch5;

public class Exam_TryCatch_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String args0 = args[0];
			String args1 = args[1];
			//public static int parseInt(String s)
            //			throws NumberFormatException
			//Parses the string argument as a signed decimal integer.
			int x = Integer.parseInt(args0);
			int y = Integer.parseInt(args1);
			
			int z = x / y ;
			
			System.out.println("x / y = " + z);
		/*
		//public class NumberFormatException
		//Thrown to indicate that the application has attempted to convert a string to one of the numeric types, 
		//but that the string does not have the appropriate format.
		}catch (NumberFormatException n) {
			System.out.println("NumberFormatException :: ���� �α� ��� >>> : " + n);
		
		//public class ArithmeticException
		//extends RuntimeException
		//Thrown when an exceptional arithmetic condition has occurred. 
		//For example, an integer "divide by zero" throws an instance of this class.
		}catch (ArithmeticException a) {
			System.out.println("ArithmeticException ::: ���� �α� ��� >>> : " + a);
		*/
		}catch (Exception e) {
			System.out.println("Exception ::: ���� �α� ��� >>> : " + e);
		}finally {
			System.out.println("finally �� >>> : ");
			System.out.println("���� �Ǵ� ���� ��� �����Ѵ�. >>> : ");
		}
		
		System.out.println("���� �� ����Ǵ� ��ƾ�̴�. >>> : ");
	}

}
