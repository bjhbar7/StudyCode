package ch2;

public class Ex_MessageEngImpl_101 implements Ex_MessageInterface_101 {

	@Override
	public void sayHello(String name) {
		System.out.println("Hello, " + name + " !!");
	}
}