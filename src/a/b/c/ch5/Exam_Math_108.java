package a.b.c.ch5;

public class Exam_Math_108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Math_108.main() 함수 진입 >>>>>");

		for (int n=0; n < 5; n++) {
			System.out.println("Exam_Math_108.main() for(int n=0; n<5; n++) 진입 >>>>");
			int lo[] = new int[6];		
			for (int i=0; i < lo.length; i++) {
			System.out.println("Exam_Math_108.main() for() int lo["+i+"] >>>> : " + lo[i]);
			}
			
			for (int i=0; i < lo.length; i++) {
				
				lo[i] = (int)(Math.random()*45) + 1; 

				for (int j=0;j < i; j++) {
					if (lo[j] == lo[i]) {
						System.out.println("if >>> : " + lo[j] + " : " + lo[i]);
						i--;
						break;					
					}
				} 
			}			
			
			for (int i=0; i < lo.length; i++) {
				System.out.print(lo[i] + " ");
			}					
			
		}

	}
}