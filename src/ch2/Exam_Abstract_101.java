package ch2;

abstract class Class_Abstract_2 {

	abstract int add();
	abstract String eat();

	int add_1(){
		return 1;
	}
}

class Class_Abstract_1 extends Class_Abstract_2{

	int add() {
		return 1+2;
	}

	String eat(){
		return "Class_Abstract_1.eat() >>> : ";
	}
}

public class Exam_Abstract_101 {

	public static void main(String args[]) {
	
		Exam_Abstract_101 ea = new Exam_Abstract_101();
		System.out.println("ea 참조변수 주소값 >>> : " + ea);

		Class_Abstract_1 ca1 = new Class_Abstract_1();
		int add = ca1.add();
		System.out.println("add >>> : " + add);
		String eat = ca1.eat();
		System.out.println("eat >>> : " + eat);
	}
}