package ch2;

public interface Ex_MessageInterface_101 {
	
	public void sayHello(String name);

	//public void byeHello(String name);
	/*
	Ex_MessageKorImpl_101.java:3: error: Ex_MessageKorImpl_101 is not abstract and does not override abstract method byeHello(String) in Ex_MessageInterface_101
	public class Ex_MessageKorImpl_101 implements Ex_MessageInterface_101 {
       ^
	Ex_MessageEngImpl_101.java:3: error: Ex_MessageEngImpl_101 is not abstract and does not override abstract method byeHello(String) in Ex_MessageInterface_101
	public class Ex_MessageEngImpl_101 implements Ex_MessageInterface_101 {
       ^
	2 errors
	*/
}