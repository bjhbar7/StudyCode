package a.b.c.ch5;

public class Exam_Math_109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Math_109.main() 함수 진입 >>>");
		
		String n0 = "";
		String n1 = "";
		char c = 'A';
		String n2[] = {"자 동","수 동"};
		System.out.println("Exam_Math_109.main() String n0 >>>> : " + n0);
		System.out.println("Exam_Math_109.main() String n1 >>>> : " + n1);
		System.out.println("Exam_Math_109.main() char c >>>> : " + c);
		for (int i=0; i<n2.length; i++) {
			System.out.println("Exam_Math_109.main() String n2["+i+"] >>>> : "+ n2[i]);
		}
		
		for (int n=0; n<5; n++) {
			System.out.println("Exam_Math_109.main() for(int n=0; n<5; n++) 진입 >>>");
			int lo[] = new int[6];
			for (int i=0; i<lo.length; i++) {
				System.out.println("Exam_Math_109.main() int lo["+ i +"] >>>> : " + lo[i]);
			}//end of for()
			
			for (int i=0; i<lo.length; i++) {
				System.out.println("Exam_Math_109.main() for() for(int i=0; i<lo.length; i++) 진입 >>>>");
				//java.lang.Math
				//public static double random()
				//Returns: a pseudorandom double greater than or equal to 0.0 and less than 1.0.
				int ii = (int)(Math.random()*45)+1;
				System.out.println("Exam_Math_109.main() for() for() int ii = (int)(Math.random()*45)+1 >>> : " + ii);
				lo[i] = ii;
				System.out.println("Exam_Math_109.main() for() for() lo["+i+"] >>> : " + lo[i]);
				
				for (int j=0; j<i; j++) {
					System.out.println("Exam_Math_109.main() for() for() for(int j=0; j<i; j++) 진입 >>>");
					System.out.println("Exam_Math_109.main() for() for() for() lo[j] : lo[i] >>> : " + lo[j] +" : "+ lo[i]);
					if(lo[j]==lo[i]) {
						System.out.println("Exam_Math_109.main() for() for() for() if(lo[j]==lo[i]) 진입 >>>");
						System.out.println("Exam_Math_109.main() for() for() for() if() lo[j] : lo[i] >>> : " + lo[j] + " : " + lo[i]);
						i--;
						System.out.println("Exam_Math_109.main() for() for() for() if() lo[i] >>> lo["+ i +"] >>> : " + lo[i]);
						break;
					}//end of if()
				}//end of for()
			}//end of for()	
			
			for (int i=0; i<lo.length; i++) {
				System.out.println("Exam_Math_109.main() for() for(int i=0; i<lo.length; i++) 진입 >>>>");
				System.out.println("Exam_Math_109.main() for() for() lo[0] : lo[i] >>> : " + lo[0] +" : "+lo[i]);
				if(lo[0] == lo[i]) {
					System.out.println("Exam_Math_109.main() for() for() if(lo[0] == lo[i]) 진입 >>>>");
					System.out.println("Exam_Math_109.main() for() for() if() lo[0] : lo[i] >>> : " + lo[0] +" : "+lo[i]);
					//java.lang.String
					//public static String valueOf(int i)
					//Returns: a string representation of the int argument.
					n1 =String.valueOf(lo[i]);
					System.out.println("Exam_Math_109.main() for() for() if() n1=String.valueOf(lo[i]) >>> : n1 >>> : " + n1);
					
					if (1 == n1.length()) {
						n1 = "0" + n1;
					}//end of if()
					
					n0 = c + n2[1] + n1;
					c += 1;
				}else {
					
					n0 = String.valueOf(lo[i]);
					
					if(1 == n0.length()) {
						n0 = "0" + n0;
					}
				}//end of if else
				
				n0 += " ";
				
				System.out.print(n0);
					
			}//end of for()
			
			System.out.println();
		}//end of for(int n=0; n<5; n++)
	}//end of main()

}//end of Exam_Math_109
