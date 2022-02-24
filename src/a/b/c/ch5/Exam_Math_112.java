package a.b.c.ch5;

import java.math.BigDecimal;

public class Exam_Math_112 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "1.1234456789223";
		System.out.println("String x >>> : " + x);
		String y = "1.236456862555";
		System.out.println("String y >>> : " + y);
		//문자 숫자를 사용해야한다. 
		//기초자료형이 BigDecimal에 argument로 들어갈 때  형변환되기 때문에 
		//public BigDecimal(String val)
		BigDecimal b1 = new BigDecimal(x);
		System.out.println("b1 >>> : " + b1);
		
		BigDecimal b2 = new BigDecimal(y);
		System.out.println("b2 >>> : " + b2);
		
		//public BigDecimal add(BigDecimal augend)
		BigDecimal badd = b1.add(b2);
		System.out.println("badd >>> : " + badd);
		badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("badd >>> : " + badd);
		
		BigDecimal bsub = b1.subtract(b2);
		System.out.println("bsub >>> : " + bsub);
		bsub = bsub.setScale(3, BigDecimal.ROUND_HALF_EVEN);
		System.out.println("bsub >>> : " + bsub);
		
		BigDecimal bmul = b1.multiply(b2);
		System.out.println("bmul >>> : " + bmul);
		bmul = bmul.setScale(3, BigDecimal.ROUND_DOWN);
		System.out.println("bmul >>> : " + bmul);
		//나눗셈은 한번에 해줘야한다. 소수점에서 계산이 이상해 질 수 있어서
		BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		System.out.println("bdiv >>> : " + bdiv);
	}

}
