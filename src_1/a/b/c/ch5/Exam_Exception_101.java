package a.b.c.ch5;

public class Exam_Exception_101 {

		public static void main(String[] args) {
			
			try {
				
				String args0 = args[0];
				String args1 = args[1];
				int x = Integer.parseInt(args0);
				int y = Integer.parseInt(args1);
			
				int z = x + y;
			
				System.out.println("x + y = " + z);
			
			}catch(Exception e) {
				System.out.println("¿¡·¯°¡ >>> : " + e.getMessage());
			}
			
			System.out.println();
			
		}
}
