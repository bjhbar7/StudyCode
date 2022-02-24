package a.b.c.ch5;

import java.math.BigDecimal;

public class Exam_Math_111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 50000;
		int y = 50000;
		int z = x * y;
		System.out.println("z >>> : " + z);
		
		long x1 = 50000;
		long y1 = 50000;
		long z1 = x1 * y1;
		System.out.println("z1 >>> : " + z1);
		
		int x2 = 1;
		double y2 = 0.1;
		int num = 7;
		double z2 = x2 - num * y2;
		System.out.println("z2 >>> : " + z2);
		
		int x3 = 1;
		double y3 = x3 * 10;
		int num1 = 7;
		double z3 = (y3 - num1) / 10.0;
		System.out.println("z3 >>> : " + z3);
		
		//java.math.BigDecimal
		BigDecimal b1 = BigDecimal.valueOf(1);
		BigDecimal b2 = BigDecimal.valueOf(0.7);
		System.out.println("b1.subtract(b2) >>> : " + b1.subtract(b2));
	}

}
