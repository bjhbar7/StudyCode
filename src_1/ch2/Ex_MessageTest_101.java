//package : ch2 ���丮�� Ex_MessageTest_101 class�� �����Ѵ�.
package ch2;

//public : ���� ������ : Access Modifier : ���� ��Ű�� �ٸ� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ������ �Լ� + �����̴�.
public class Ex_MessageTest_101 {
	
	//console application�� ���� �����̴�. : �Լ��� ��������Ʈ ������� ����ȴ�.
	public static void main(String args[]) {
		
		//Ex_MessageInterface_101 �������̽��� ���� ���� emk�� �����Ѵ�.
		//new �����ڸ� �̿��ؼ� Ex_MessageKorImpl_101()��(��������) �ν��Ͻ��Ѵ�.
		//�ν��Ͻ��� Ex_MessageKorImpl_101() �����ڷ� ���� ���� emk�� �ʱ�ȭ�Ѵ�.
		Ex_MessageInterface_101 emk = new Ex_MessageKorImpl_101();
		//emk�� Ex_MessageKorImpl_101()�� �ּҰ��� ���´�.
		System.out.println("emk �� �ּҰ� >>>>>>>> : " + emk);
		//Ex_MessageInterface_101�� sayHello(); �߻� �Լ��� ȣ���Ѵ�.
		emk.sayHello("ȫ�浿");
		Ex_MessageInterface_101 eme = new Ex_MessageEngImpl_101();
		//eme�� Ex_MessageEngImpl_101()�� �ּҰ��� ���´�.
		System.out.println("eme �� �ּҰ� >>>>>>>> : " + eme);
		//Ex_MessageInterface_101�� sayHello(); �߻� �Լ��� ȣ���Ѵ�.
		eme.sayHello("Hong Gil Dong");
	} //end of main()
} //end of Ex_MessageTest_101
/*
C:\00.KOSMO108_BJR\10.JExam\ch2>java a.b.c.ch2.Ex_MessageTest_101
emk �� �ּҰ� >>>>>>>> : a.b.c.ch2.Ex_MessageKorImpl_101@15db9742
�ȳ��ϼ���, ȫ�浿 !!
eme �� �ּҰ� >>>>>>>> : a.b.c.ch2.Ex_MessageEngImpl_101@6d06d69c
Hello, Hong Gil Dong !!
*/