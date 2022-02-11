//package : keyword : ch1 ���丮�� Exam_For_701 class �����Ѵ�.
package ch1;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ Exam_For_701 class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : �ڹٴ� ���� + �Լ��� �̷�����ִ�.
public class Exam_For_701 {
	//public : ���� ������ : �ٸ� ��Ű��, ���� ��Ű������ main() �Լ��� ������ ����Ѵ�.
	//static : ������ Ű���� : ����, �Լ� �տ� �����ϰ� JVM�� ���α׷� ���۽� �޸� ���� �÷��д�. ���α׷� ����� �����ȴ�.
	//void : ���ϰ��� ���� ��� ������ ��ġ�� ����Ѵ�.
	//main() : console application�� ���������̴�. : ��������Ʈ ���(�Լ����� ��� ����)���� �����Ѵ�.
	//String : java.lang.String class
	//String args[] : ����� �μ� : String �迭�� args ���� (��ü)
	public static void main(String args[]) {
		//int : �ڷ��� : 4byte ���� : ����
		//int�� ���� ���� �迭�� iArr ������ �ʱ�ȭ�Ѵ�.
		int iArr[] = {1,2,3,4,5,6,7,8,9};
		System.out.println("iArr�� �ּҰ� >>>> : " + iArr);
		
		//iArr ������ �����ϰ� null(default)�� �ʱ�ȭ�Ѵ�.
		iArr = null;

		/*
		�Ʒ� �� ���� null�� ����� �˿� ���ϸ� null ������ ����� ����.

		int iArrLen = iArr.length; -> �̰����� ���� �����Ѵ�.
		System.out.println("iArr.length �迭�� ���� >>> : " + iArr.length); 
		
		if (iArrLen > 0){

			for (int i=0; i < iArrLen; i++ ){
				System.out.println("iArr[" + i + "] >>> : " + iArr[i]);
			}
		}
		*/
		
		//int : �ڷ��� : 4byte ���� : ����
		//int�� iArrLen ������ �����ϰ� 0(default)���� �ʱ�ȭ�Ѵ�.
		int iArrLen = 0;
		// iArr�� null �� �ƴϰ�, ���̰� 0�� �ƴϸ� true�� if���� �����Ѵ�.
		if (iArr != null && iArr.length > 0) {
			//iArrLen ������ iArr�迭�� ���̷� �ʱ�ȭ�Ѵ�.
			iArrLen = iArr.length;
			System.out.println("iArr�� ���� >>>> : " + iArrLen);
			
			//for �� : from to loop : �ݺ��� : Ư�� ���Ǻ��� Ư�� ���Ǳ��� �ݺ��Ѵ�.
			for (int i = 0; i<iArrLen; i++) {
				System.out.println("iArr["+i+"] >>>> : " + iArr[i]);
			}
		} else { //else : if�� ������ false�̸� ����ȴ�.
			//System.out.println(); : () ������ ����Ѵ�.
			System.out.println("�����͸� ����� ��������." + iArr);
		}
	}//end of main()
}//end of Exam_For_701