package ch2;

// ȸ������ ���α׷����� ȸ�������� ������ Ŭ���� 
public class MemberVO_101 {
	
	public String mid;
	public String mpw;
	public String mname;
	public String mhp;
	public String maddr;
	
	/* ������ ����� ��Ģ : Ŭ�����̸� () {}
	1.Ŭ�����̸� ���� (����Ϸ��� �ϴ� Ŭ�����̸��� �����ϰ� ����)
	2.() �Ұ�ȣ�� �Ű������� ����� �� �ִ�.
	3.{} ������ Ŭ������ �ν��Ͻ� �ϸ鼭 �� ���� �ؾ��� �Լ�(������) �����Ѵ�.
	4.�����ڴ� �ɹ������� �ʱ�ȭ �Ѵ�.
	*/
	//�Ű� ������ ���� �⺻ ������
	public MemberVO_101() {
		System.out.println("mid >>> : " + mid);
		System.out.println("mpw >>> : " + mpw);
		System.out.println("mname >>> : " + mname);
		System.out.println("mhp >>> : " + mhp);
		System.out.println("maddr >>> : " + maddr);
	}
	//�Ű� ������ �ִ� ������
	public MemberVO_101(String mid, String mpw, String mname, String mhp, String maddr) {
		System.out.println("mid >>> : " + mid);
		System.out.println("mpw >>> : " + mpw);
		System.out.println("mname >>> : " + mname);
		System.out.println("mhp >>> : " + mhp);
		System.out.println("maddr >>> : " +maddr + "\n");
	}
}