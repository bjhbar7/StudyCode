package a.b.c.ch5;

import java.text.DecimalFormat;

public class Exam_Math_101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main 함수의 시작 >>>>> ");
		//java.lang.Math
		//public static final double E
		//The double value that is closer than any other to e, the base of the natural logarithms.
		double e = Math.E;
		System.out.println("e >>>>>> : " + e);
		
		//public static int round(float a)
		//Returns the closest int to the argument, with ties rounding to positive infinity.
		System.out.println("Math.round(e) >>> : " + Math.round(e));
		System.out.println("Math.round(e*100) >>> : " + Math.round(e*100));
		System.out.println("Math.round(e*100)/100 >>> : " + Math.round(e*100)/100);
		System.out.println("Math.round(e*1000) >>> : " + Math.round(e*1000));
		System.out.println("Math.round(e*1000)/1000 >>> : " + Math.round(e*1000)/1000);
		System.out.println("Math.round(e*10000) >>> : " + Math.round(e*10000));
		System.out.println("Math.round(e*10000)/10000" + Math.round(e*10000)/10000);
		
		//java.lang.String
		//public static String format(String format, Object... args)
		//Returns a formatted string using the specified format string and arguments.
		System.out.println("String.format() >>>> : " + String.format("%.3f", e));
		System.out.println("String.format() >>>> : " + String.format("%.4f", e));
		
		//java.text.DecimalFormat
		//public DecimalFormat(String pattern)
		DecimalFormat df = new DecimalFormat("#.###");
		//public StringBuffer format(double number, StringBuffer result, FieldPosition fieldPosition)
		//Formats a double to produce a string.
		System.out.println("df.format(1.234567) >>>> : " + df.format(1.234567));
		System.out.println("df.formet(e) >>>> : " + df.format(e));
		
		//public static double floor(double a)
		//Returns the largest (closest to positive infinity) double value that is less than or equal to the argument and is equal to a mathematical integer. Special cases:
		System.out.println("Math.floor(e) >>> : " + Math.floor(e));
		
		//java.lang.Math
		//public static final double PI
		//The double value that is closer than any other to pi, the ratio of the circumference of a circle to its diameter.
		double pi = Math.PI;
		System.out.println("pi >>>>>>> : " + pi);
		System.out.println("Math.round(pi) >>> : " + Math.round(pi));
		System.out.println("Math.floor(pi) >>> : " + Math.floor(pi));
		
		//public static double ceil(double a)
		double ceil = Math.ceil(pi);
		System.out.println("Math.ceil(pi) >>> : " + ceil);
		
		//public static double pow(double a, double b)
		double pow = Math.pow(5, 2);
		System.out.println("Math.pow(5, 2) >>> : " + pow);
		
		//public static double abs(double a)
		System.out.println("Math.abs(-10) >>> : " + Math.abs(-10));
		
		//public static int max(int a, int b)
		int max = Math.max(3, 2);
		System.out.println("max >>> : " + max);
				
		//public static int min(int a, int b)
		int min = Math.min(3, 2);
		System.out.println("min >>> : " + min);
		
		

		
	}//end of main

}//end of Exam_Math
