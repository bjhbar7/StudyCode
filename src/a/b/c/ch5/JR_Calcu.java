package a.b.c.ch5;

import java.math.BigDecimal;
import java.util.Scanner;

public class JR_Calcu {
	
	public static void main(String args[]) {
		
		Scanner sc = null;
		
		String str1 = "";
		String str2 = "";
		String oper = "";
		char cOper = '\u0000';
		
		try {
			sc = new Scanner(System.in);
		 
			System.out.println("계산할 숫자 x를 입력하시오"); 
			str1 = sc.next();
			System.out.println("str1 >>> : " +str1);
			
			System.out.println("연산자 + - * / 중 하나를 입력하시오");
			oper = sc.next();
			System.out.println("oper >>> : " +oper);
			cOper = oper.charAt(0);
			System.out.println("cOper >>> : " +cOper);
	    
			System.out.println("계산할 숫자 y를 입력하시오");
			str2 = sc.next();
			System.out.println("str2 >>> : " +str2);
			
			BigDecimal b1 = new BigDecimal(str1);
			System.out.println("b1 >>> : " + b1);
			BigDecimal b2 = new BigDecimal(str2);
			System.out.println("b2 >>> : " + b2);
	     
			if (0x2B ==  cOper) {
				BigDecimal badd = b1.add(b2);
				System.out.println("badd >>> : " + badd);
				badd = badd.setScale(3, BigDecimal.ROUND_DOWN);
				System.out.println("badd >>> : " + badd);
			}
			if (0x2D == cOper) {
				BigDecimal bsub = b1.subtract(b2);
				System.out.println("bsub >>> : " + bsub);
				bsub = bsub.setScale(3, BigDecimal.ROUND_HALF_EVEN);
				System.out.println("bsub >>> : " + bsub);
			}
			if (0x2A == cOper) {
				BigDecimal bmul = b1.multiply(b2);
		    	System.out.println("bmul >>> : " + bmul);
		    	bmul = bmul.setScale(3, BigDecimal.ROUND_DOWN);
		    	System.out.println("bmul >>> : " + bmul);
			}
			if (0x2F == cOper) {
				BigDecimal bdiv = b1.divide(b2, 3, BigDecimal.ROUND_DOWN);
		    	System.out.println("bdiv >>> : " + bdiv);	
			}
	    	
	    	sc.close();
		} catch (Exception e) {
			System.out.println("error >>> : " + e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();
			}
		}
		
	}
}
