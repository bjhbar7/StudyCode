package a.b.c.ch5;

import java.math.BigDecimal;
import java.util.Scanner;

public class JR_Calcu_1 {
	
	public BigDecimal jrAdd(BigDecimal b1, BigDecimal b2) {
		return b1.add(b2);
	}
	
	public BigDecimal jrSubtract(BigDecimal b1, BigDecimal b2) {
		return b1.subtract(b2);
	}
	
	public BigDecimal jrMultiply(BigDecimal b1, BigDecimal b2) {
		return b1.multiply(b2);
	}
	
	public BigDecimal jrDivide(BigDecimal b1, BigDecimal b2) {
		return b1.divide(b2);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = null;
		
		String x = "";
		String y = "";
		String oper = "";
		char cOper = '\u0000';
		
		try {
			
			sc = new Scanner(System.in);
			
			System.out.println("연산할 x 값을 입력하시오 >>> : ");
			x = sc.next();
			System.out.println("x >>> : " + x);
			
			System.out.println("연산할 y 값을 입력하시오 >>> : ");
			y = sc.next();
			System.out.println("y >>> : " + y);
			
			System.out.println("연산할 연산자를 + - * / 입력하시오 >>> : ");
			oper = sc.next();
			cOper = oper.charAt(0);
			System.out.println("cOper >>> : " + cOper);
			
			BigDecimal b1 = new BigDecimal(x);
			BigDecimal b2 = new BigDecimal(y);
			
			if (0x2B == cOper) {
				System.out.println("연산할 연산자는 >>> : " + cOper);
				
				JR_Calcu_1 jr_add = new JR_Calcu_1();
				BigDecimal badd = jr_add.jrAdd(b1, b2);
				
				System.out.println(x + " + " + y + " = " +badd);
			}
			if (0x2D == cOper) {
				System.out.println("연산할 연산자는 >>> : " + cOper);
				
				JR_Calcu_1 jr_sub = new JR_Calcu_1();
				BigDecimal bsubtract = jr_sub.jrSubtract(b1, b2);
				
				System.out.println(x + " - " + y + " = " + bsubtract);
			}
			if (0x2A == cOper) {
				System.out.println("연산할 연산자는 >>> : " + cOper);
				
				JR_Calcu_1 jr_mul = new JR_Calcu_1();
				BigDecimal bmultiply = jr_mul.jrMultiply(b1, b2);
				
				System.out.println(x + " * " + y + " = " + bmultiply);
			}
			if (0x2F == cOper) {
				System.out.println("연산할 연산자는 >>> : " + cOper);
				
				JR_Calcu_1 jr_div = new JR_Calcu_1();
				BigDecimal bdivide = jr_div.jrDivide(b1, b2);
				
				System.out.println(x + " / " + y + " = " + bdivide);
			}
			
			sc.close();
		} catch (Exception e) {
			System.out.println("error >>> : " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}//end of if
		}//end of try catch finally
	}//end of main
}//end of JR_Calcu_1
