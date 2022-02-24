package a.b.c.ch5;

public class Exam_Math_107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Math_107.main() 함수 진입 >>>>>>");
		int lo[] = new int[6];
		System.out.println("Exam_Math_107.main() int lo[] 주소값 >>>> : " + lo);
		for (int i=0; i < lo.length; i++) {
			System.out.println("Exam_Math_107.main() int lo["+ i +"] >>>> : " + lo[i] );
		}//end of for()
		
		for (int i=0; i < lo.length; i++) {
			//java.lang.Math
			//public static double random()
			//Returns: a pseudorandom double greater than or equal to 0.0 and less than 1.0.
			System.out.println("Exam_Math_107.main() for(int i=0; i<lo.length; i++) 진입 >>>>>> ");
			int ii = (int)(Math.random()*45) +1;
			System.out.println("Exam_Math_107.main() for() int ii = (int)(Math.random()*45) +1 >>>> : " + ii);
			lo[i] = ii;
			System.out.println("Exam_Math_107.main() for() lo["+i+"]" + lo[i]);
			
			for(int j=0; j< i; j++) {
				System.out.println("Exam_Math_107.main() for(int i=0; i<lo.length; i++) for(int j=0; j<i; j++) 진입 >>>>>>");
				System.out.println("for () lo[j] : lo[i] >>>> : " + lo[j] + " : " + lo[i]);
				if(lo[j] == lo[i]) {
					System.out.println("Exam_Math_107.main() for(int i=0; i<lo.length; i++) for(int j=0; j<i; j++) if(lo[j] == lo[i]) 진입 >>>>>");
					System.out.println("if () lo[j] : lo[i] >>>> : " + lo[j] + " : " + lo[i]);
					i--;
					System.out.println("if () i-- >>>> lo[i] >>>> : lo["+i+"] >>> : " + lo[i]);
					break;
				}//end of if()
				
			}//end of for()
		}//end of for()
		
		for (int i=0; i < lo.length; i++) {
			System.out.println("Exam_Math_107.main() for(int i=0; i<lo.length; i++) 진입 >>>>>>");
			System.out.println("Exam_Math_107.main() for() lo["+i+"] >>>>>> : "+lo[i]);
		}//end of for()
		
	}//end of main()

}//end of Exam_Math_107
