//package 선언
package a.b.c.ch6;

//import 선언
import java.util.HashMap;
//class 선언
public class Exam_HashMap_102 {
	
	//상수 선언
	//맴버변수 선언
	//생성자 선언
	//함수 선언
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_HashMap_102.main() 진입 >>>>");
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
