package exam05;

public class PersonTest_01 {
	public static void main(String[] args) {
		Person_01 personKim = new Person_01();
		personKim.name = "������";
		personKim.weight = 85.5F;
		personKim.height = 180.0F;
		
		Person_01 personLee = new Person_01("�̼���", 175, 75);
		System.out.println("personLee :" + personLee.name + personLee.weight + personLee.height);
	}
}
