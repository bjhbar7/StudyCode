package a.b.c.ch5;

public class Exam_Math_106 {
	
	public static int max (int a, int b, int c) {
		System.out.println("Exam_Math_106.max() 함수 진입 >>>>> ");
		System.out.println("Exam_Math_106.max() int a >>>> : " + a);
		System.out.println("Exam_Math_106.max() int b >>>> : " + b);
		System.out.println("Exam_Math_106.max() int c >>>> : " + c);
		
		int max = a;
		System.out.println("Exam_Math_106.max() int max >>>> : " + max);
		
		if (max <= b) {
			System.out.println("Exam_Math_106.max() if(max <= b) 진입 >>>> ");
			System.out.println("Exam_Math_106.max() if(max <= b) max >>>> : " + max);
			System.out.println("Exam_Math_106.max() if(max <= b) b >>>> : " + b);
			max = b;
			System.out.println("Exam_Math_106.max() if(max <= b) max = b : max >>>> : " + max);
		}
		if (max <= c) {
			System.out.println("Exam_Math_106.max() if(max <= c) 진입 >>>> ");
			System.out.println("Exam_Math_106.max() if(max <= c) max >>>> : " + max);
			System.out.println("Exam_Math_106.max() if(max <= c) c >>>> : " + c);
			max = c;
			System.out.println("Exam_Math_106.max() if(max <= c) max = c : max >>>> : " + max);
		}
		System.out.println("Exam_Math_106.max() return max >>>> : " + max);
		return max;
	}
	//함수 max 오버로드
	public static int max(int imax[]) {
		System.out.println("Exam_Math_106.max(int imax[]) 함수 진입 >>>>> ");
		System.out.println("Exam_Math_106.max(int imax[]) imax >>>> : " + imax);
		//int imax[i]를 하나씩 log 찍어보기
		for(int i=0; i< imax.length; i++) {
			System.out.println("Exam_Math_106.max(int imax[]) int imax ["+i+"]) >>>> : " + imax[i]);
		}
		
		int max = imax[0];
		System.out.println("Exam_Math_106.max(int imax[]) int max >>>> " + max);
		for(int i=0; i< imax.length; i++) {
			System.out.println("Exam_Math_106.max(int imax[]) for(int i=0; i < imax.length; i++) imax["+i+"] >>> : " + imax[i]);
			if (imax[i] > max) {
				max = imax[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_Math_106.main() 함수 진입 >>>>>>> ");
		int max = Exam_Math_106.max(1, 5, 2);
		System.out.println("Exam_Math_106.main(1, 5, 2) 함수 결과값 호출 >>>> : " + max);
		System.out.println("Exam_Math_106.main() max >>>>>> : " + max);
		
		int imax[] = {5, 3, 4, 7, 8, 2};
		int maxArray = Exam_Math_106.max(imax);
	}

}
