//package : keyword : ch1 ���丮�� Exam_For_901 class�� �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ���� + �Լ��� �����Ǿ��ִ�. : Exam_For_901�� 1���� main() �Լ��� �����Ǿ��ִ�.
public class Exam_For_901 {
	//public : ���� ������ : �ٸ� ��Ű��, ���� ��Ű������ main() �Լ��� ������ ����Ѵ�.
	//static : ������ Ű���� : ������ �Լ� �տ� �����ϸ� JVM�� ���α׷��� �����ϸ� �޸� ���� �ø���. ���α׷� ����� �����ȴ�.
	//void : ���ϰ��� ���� �Լ����� ������ ��ġ�� �����Ѵ�.
	//main() : �ܼ� ���ø����̼��� ���� �����̴�. : interpreter ������� �����Ѵ�.
	//String args[] : ����� �μ�
	//String : java.lang.String Ŭ����
	//args : ���� ����
	//[] : �迭
	public static void main(String args[]) {
		
		//for �� : from to loop : �ݺ��� : Ư�� ���Ǻ��� Ư�� ���Ǳ��� �ݺ��Ѵ�.
		//for (�ʱ�ȭ��, ���ǽ�, ������) {������ ǥ����}
		for (int j = 1; j<10; j++) {
			for (int i = 2; i<6; i++) {
				/*
				static PrintStream	out : The "standard" output stream.
				public PrintStream format(String format,
                          Object... args)
				... : �迭�� �ǹ��Ѵ�.
				*/
				//%d : ������ ���
				//%2d : 2�ڸ� ������ ���
				System.out.format("%d * %d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}
		System.out.println();

		for (int j = 1; j<10; j++) {
			for (int i = 6; i<10; i++) {
				/*
				static PrintStream	out : The "standard" output stream.
				public PrintStream printf(String format,
                          Object... args)
				*/
				System.out.printf("%d * %d = %2d  ",i,j,i*j);
			}
			System.out.println();
		}

		for (int i =1; i<10; i++) {
			for (int j =1; j<10; j++) {
				/*
				public static String format(String format,
                            Object... args)
				*/
				System.out.print(String.format("%d * %d = %2d  ",i,j,i*j));
			}
			System.out.println();
		}
	}//end of main()
}//end of Exam_For_901
/*
	���� ������ format specifier
		%d		������ ���
		%s		������ ���
		%f		�Ǽ��� ���
		%o		8���� ���
		%x, %X	16���� ���
		%e, %E	���� ���
		%c		���� ���
		%n		�� �ٲ�
		%b		boolean ���

*/