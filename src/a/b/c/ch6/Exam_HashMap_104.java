//package ����
package a.b.c.ch6;

//import ����
import java.util.ArrayList;
import java.util.HashMap;

//class ����
public class Exam_HashMap_104 {
	//��� ����
	//�ɹ� ���� ����
	//������ ����
	//�Լ� ����
	public ArrayList hashMap() {
		System.out.println("Exam_HashMap_104.hashMap() ���� >>>>");
		//public class HashMap<K,V>
		//public HashMap()
		HashMap hm0 = new HashMap();
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		//public V put(K key,V value)
		hm0.put("�̸�", "ȫ�浿");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		hm0.put("����", "25");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		hm0.put("�ּ�", "����");
		System.out.println("Exam_HashMap_104.hashMap() hm0 >>> : " + hm0);
		
		HashMap hm1 = new HashMap();
		hm1.put("�̸�", "�豤��");
		System.out.println("Exam_HashMap_104.hashMap() hm1 >>> : " + hm1);
		hm1.put("����", "30");
		System.out.println("Exam_HashMap_104.hashMap() hm1 >>> : " + hm1);
		hm1.put("�ּ�", "��⵵");
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
	
	//main() ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exam_HashMap_104.main() ���� >>>>");
		Exam_HashMap_104 ep = new Exam_HashMap_104();
		System.out.println("Exam_HashMap_104.main() ep >>> : " + ep);
		
		ArrayList alist = ep.hashMap();
		System.out.println("Exam_HashMap_104.main() alist >>> : " + alist);
		System.out.println("Exam_HashMap_104.main() alist.size() >>> : " + alist.size());
	}//end of main()

}//end of Exam_HashMap_104
