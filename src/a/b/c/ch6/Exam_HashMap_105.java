package a.b.c.ch6;

import java.util.HashMap;
import java.util.Iterator;

public class Exam_HashMap_105 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("�̸�", "ȫ�浿");
		hm.put("����", "30");
		hm.put("�ּ�", "��õ");
		String name = hm.get("�̸�");
		String age = hm.get("����");
		String addr = hm.get("�ּ�");
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
			
			if ("�̸�".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("����".equals(key)) {
				value = (String)hm.get(key);
			}
			if ("�ּ�".equals(key)) {
				value = (String)hm.get(key);
			}
			System.out.println(key + " : " + value);
		}
	}

}
