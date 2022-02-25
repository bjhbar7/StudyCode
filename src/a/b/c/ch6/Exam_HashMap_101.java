//package ����
package a.b.c.ch6;

//import ����
import java.util.ArrayList;
import java.util.HashMap;

//class ����
public class Exam_HashMap_101 {
	
	//main() �Լ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_HashMap_101.main() ���� >>>>");
		//java.util.ArrayList<E>
		//public ArrayList()
		ArrayList alist = new ArrayList();
		System.out.println("Exam_HashMap_101.main() alist >>> : " + alist);
		//java.lang.System
		//public static int identityHashCode(Object x)
		System.out.println("Exam_HashMap_101.main() System.identityHashCode(alist) >>> : " + System.identityHashCode(alist));
		
		//java.util.HashMap<K,V>
		//public HashMap()
		HashMap hp = new HashMap();
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_101.main() System.identityHashCode(hp) >>> : " + System.identityHashCode(hp));
		
		//public V put(K key, V value)
		hp.put("ȫ", 25);
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		
		hp.put(23, "��");
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		
		hp.put("��", "����");
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_101.main() hp.size >>> : " + hp.size());
		
		hp.put("��", 27);
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_101.main() hp.size >>> : " + hp.size());
		
		hp.put(23, "��2");
		System.out.println("Exam_HashMap_101.main() hp >>> : " + hp);
		System.out.println("Exam_HashMap_101.main() hp.size >>> : " + hp.size());
		
		//public V get(Object key)
		Object obj0 = hp.get(23);
		System.out.println("Exam_HashMap_101.main() obj0 >>> : " + obj0);
		String s0 = (String)obj0;
		System.out.println("Exam_HashMap_101.main() s0 >>> : " + s0);
		//java.util.AbstractMap<K,V>
		//public String toString()
		String s0_1 = obj0.toString();
		System.out.println("Exam_HashMap_101.main() s0_1 >>> : " + s0_1);
		String s0_2 = hp.get(23).toString();
		System.out.println("Exam_HashMap_101.main() s0_2 >>> : " + s0_2);
		String s0_3 = String.valueOf(hp.get(23));
		System.out.println("Exam_HashMap_101.main() s0_3 >>> : " + s0_3);
		String s0_4 = hp.get(23) + "";
		System.out.println("Exam_HashMap_101.main() s0_4 >>> : " + s0_4);
		
		Object obj1 = hp.get("��");
		System.out.println("Exam_HashMap_101.main() obj1 >>> : " + obj1);
		Integer s1 = (Integer)obj1;
		System.out.println("Exam_HashMap_101.main() s1 >>> : " + s1);
		String s1_1 = hp.get("��").toString();
		System.out.println("Exam_HashMap_101.main() s1_1 >>> : " + s1_1);
		String s1_2 = String.valueOf(hp.get("��"));
		System.out.println("Exam_HashMap_101.main() s1_2 >>> : " + s1_2);
		String s1_3 = hp.get("��") + "";
		System.out.println("Exam_HashMap_101.main() s1_3 >>> : " + s1_3);
	}//end of main()

}//end of Exam_HashMap_101 
