package org.prog;

import java.util.*;
import java.util.Map.Entry;

public class Encaps {
	
	public static void main(String[] args) {
	Program2 naveen=new Program2();
	naveen.setId(123);
	naveen.setName("Naveen");
	naveen.setNumber(9884541277l);
	
	Program2 rakshan=new Program2();
	rakshan.setId(134);
	rakshan.setName("Rakshan");
	rakshan.setNumber(6330867521l);

	List<Program2>li=new LinkedList<Program2>();
	li.add(naveen);
	li.add(rakshan);
	li.add(naveen);
	
	System.out.println(li.get(0).getName());
	
	for (Program2 program2 : li) {
		System.out.println(program2.getId());
		System.out.println(program2.getName());
		System.out.println(program2.getNumber());
	}
	
	Set<Program2>s=new LinkedHashSet<>();
	s.add(naveen);
	s.add(rakshan);
	s.add(naveen);
	
	for (Program2 program2 : s) {
		System.out.println(program2.getName());
		System.out.println(program2.getNumber());
	}
	
	Map<Integer,Program2>m=new LinkedHashMap<Integer, Program2>();
	m.put(1, rakshan);
	m.put(2, naveen);
	
	Set<Entry<Integer,Program2>> entrySet = m.entrySet();
	for (Entry<Integer, Program2> entry : entrySet) {
		System.out.println(entry.getValue().getId());
		System.out.println(entry.getValue().getName());
	}
		// String a = "WElcome to JAva ClasS";
//		String a1 = a.replaceAll(" ", "");
//		String b = a1.toLowerCase();
//		char[] c = b.toCharArray();
//		Map<Character,Integer>m=new LinkedHashMap<>();
//		for (char d : c) {
//			if(!m.containsKey(d)) {
//				m.put(d, 1);
//			}
//			else {
//				m.put(d, m.get(d)+1);
//			}
//		}
//		System.out.println(m);

		// String s = "";
//		Map<Character, Integer> m = new LinkedHashMap<>();
//		String st = s.replaceAll(" ", "");
//		char[] ch = st.toCharArray();
//		for (char c : ch) {
//			if(!m.containsKey(c)) {
//				m.put(c, 1);
//				
//			}
//			else {
//				m.put(c, m.get(c)+1);
//			}
//		}
//		System.out.println(m);
	}
}
