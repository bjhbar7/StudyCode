//package ����
package a.b.c.ch6;

//import ����
import java.util.HashMap;
//class ����
public class Exam_HashMap_102 {
	
	//��� ����
	//�ɹ����� ����
	//������ ����
	//�Լ� ����
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_HashMap_102.main() ���� >>>>");
		//java.util.HashMap<K,V>
		//public class HashMap<K,V>
		//public HashMap()
		HashMap hp = new HashMap();
		System.out.println("Exam_HashMap_102.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_102.main() hp.size() >>> : " + hp.size());
		
		//public V put(K key, V value)
		hp.put("1", 1);
		System.out.println("Exam_HashMap_102.main() hp.get(1) >>> : " + hp.get("1"));
		System.out.println("Exam_HashMap_102.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_102.main() hp.size >>> : " + hp.size());
	}//end of main()

}//Exam_HashMap_102
