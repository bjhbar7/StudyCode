//package 선언
package a.b.c.ch6;

//import 선언
import java.util.ArrayList;
import java.util.HashMap;

//class 선언
public class Exam_HashMap_104 {
	//상수 선언
	//맴버 변수 선언
	//생성자 선언
	//함수 선언
	public ArrayList hashMap() {
		System.out.println("Exam_HashMap_104.hashMap() 진입 >>>>");
		//public class HashMap<K,V>
		//public HashMap()
		HashMap hm0 = new HashMap();
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		//public V put(K key,V value)
		hm0.put("이름", "홍길동");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		hm0.put("나이", "25");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		hm0.put("주소", "서울");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		
		HashMap hm1 = new HashMap();
		hm1.put("이름", "김광석");
		System.out.println("Exam_HashMap_104.hashMap() hm1 >>> : " + hm1);
		hm1.put("나이", "30");
		System.out.println("Exam_HashMap_104.hashMap() hm1 >>> : " + hm1);
		hm1.put("주소", "경기도");
		System.out.println("Exam_HashMap_104.hashMap() hm1 >>> : " + hm1);
		
		//java.util.ArrayList<E>
		//public class ArrayList<E>
		//public ArrayList()
		ArrayList alist = new ArrayList();
		System.out.println("Exam_HashMap_104.hashMap() alist >>> : " + alist);
		//public boolean add(E e)
		alist.add(hm0);
		alist.add(hm1);
		
		return alist;
	}
	
	//main() 선언
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_HashMap_104.main() 진입 >>>>");
		Exam_HashMap_104 ep = new Exam_HashMap_104();
		System.out.println("Exam_HashMap_104.main() ep >>> : " + ep);
		
		ArrayList alist = ep.hashMap();
		System.out.println("Exam_HashMap_104.main() alist >>> : " + alist);
		System.out.println("Exam_HashMap_104.main() alist.size() >>> : " + alist.size());
	}//end of main()

}//end of Exam_HashMap_104
