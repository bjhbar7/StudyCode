package ch2;

//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ class�� ������ ����Ѵ�.
//class : �ڹ��� �ּ� ���� : class�� ���� + �Լ�
//implements : keyword : �������̽��� ����� ����� ���� �ִ�. : �������̽����� �������̽��� ����� extends�� ����ؾ��Ѵ�. implements�� ����� ����� ���� ����� �����ϴ�.
public class Ex_MessageKorImpl_101 implements Ex_MessageInterface_101 {
	//@Override : ������̼� : �߻� �Լ��� �������� �� ����Ѵ�. �����Ϸ��� ������ �˻��Ѵ�.
	@Override
	//public : ���� ������ : Access Modifier : �ٸ� ��Ű��, ���� ��Ű������ �Լ�() ������ ����Ѵ�.
	public void sayHello(String name) {
		System.out.println("�ȳ��ϼ���, " + name + " !!");
	}
}