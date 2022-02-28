package a.b.c.ch6;

import java.util.HashMap;
import java.util.Iterator;

public class Exam_HashMap_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("이름", "홍길동");
		hm.put("나이", "30");
		hm.put("주소", "인천");
		String name = hm.get("이름");
		String age = hm.get("나이");
		String addr = hm.get("주소");
		System.out.println("name >>> : " + name);
		System.out.println("age >>> : " + age);
		System.out.println("addr >>> : " + addr);
		System.out.println("\n###################\n");
		System.out.println("hm.keySet() >>> : " + hm.keySet());
		System.out.println("hm.values() >>> : " + hm.values());
		System.out.println("hm.entrySet() >>> : " + hm.entrySet());
		System.out.println("\n##################\n");
		
		Iterator<String> keys = hm.keySet().iterator();
		
		while (keys.hasNext()) {
			String key = (String)keys.next();
			String value = "";
			
			if ("이름".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("나이".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("주소".equals(key)) {
				value = (String)hm.get(key);
			}
			System.out.println(key + " : " + value);
		}
	}

}
