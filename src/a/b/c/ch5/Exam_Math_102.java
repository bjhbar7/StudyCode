package a.b.c.ch5;

public class Exam_Math_102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//public static double random()
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. 
		//Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.
		double r = Math.random();
		System.out.println("r >>> : " + r);
		
		double r1 = Math.random()*10;
		System.out.println("r1 >>> : " + r1);
		
		int r2 = (int)(Math.random()*10);
		System.out.println("r2 >>> : " + r2);
		
		int r3 = (int)(Math.random()*100);
		System.out.println("r3 >>> : " + r3);
		
		int r4 = (int)(Math.random()*100);
		System.out.println("r4 >>> : " + r4);
	}//end of main()

}//end of Exam_Math_102
