package a.b.c.ch6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Exam_HashMap_106 {
	public ArrayList<HashMap<String, String>> hashMapGeneric() {
		
		HashMap<String, String> hm0 = new HashMap<String, String> ();
		hm0.put("이름", "배진량");
		hm0.put("나이", "30");
		hm0.put("주소", "인천");
		
		HashMap<String, String> hm1 = new HashMap<String, String> ();
		hm1.put("이름", "홍길동");
		hm1.put("나이", "25");
		hm1.put("주소", "서울");
		
		HashMap<String, String> hm2 = new HashMap<String, String> ();
		hm2.put("이름", "김김김");
		hm2.put("나이", "27");
		hm2.put("주소", "경기도");
		
		ArrayList<HashMap<String, String>> aList =
				new ArrayList<HashMap<String, String>> ();
		aList.add(hm0);
		aList.add(hm1);
		aList.add(hm2);
		
		return aList;
	}
	
	public static void main(String[] args) {
		
		Exam_HashMap_106 ex3 = new Exam_HashMap_106();
		
		ArrayList<HashMap<String, String>> aList1 = ex3.hashMapGeneric();
		System.out.println("aList1.size() >>> : " + aList1.size());
		
		for(int i=0; i < aList1.size(); i++) {
			
			HashMap<String, String> hm = aList1.get(i);
			
			Iterator<String> keys = hm.keySet().iterator();
			
			while (keys.hasNext()) {
				String key = keys.next();
				String value = "";
				
				if ("이름".equals(key)) {
					value = hm.get(key);
				}
				if ("나이".equals(key)) {
					value = hm.get(key);
				}
				if ("주소".equals(key)) {
					value = hm.get(key);
				}
				System.out.println(key + " : " + value);
			}
		}
	}
}
