package collectionframework;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Mapex {
	public static void main(String[] args) {
		//m1();
		m2();
		//m3();
	}
	public static void m1() {
		Map mapA = new TreeMap();

		mapA.put("e01", "abc");
		mapA.put("e03", "element 3");
		mapA.put("e02", "pqr");
		mapA.replace("e02", "xyz");
		System.err.println(mapA);

		System.err.println(mapA.get("e01"));
		System.err.println(mapA.get("e02"));
		boolean contains = mapA.containsKey("e03");
		System.out.println(contains);
	}
public static void m2() {
	Map mapA = new HashMap();

	mapA.put("key1", "element 1");
	mapA.put("key2", "element 2");
	mapA.put("key3", "element 3");
	//Set keys =  mapA.keySet();
//	Set keys=new TreeSet();
//	keys= mapA.keySet();
//	Iterator iterator = keys.iterator();
//	
//	while(iterator.hasNext()){
//	  Object key   = iterator.next();
//	  Object value = mapA.get(key);
//	  System.out.println(value);
//	}
//	
//	Iterator iterator1 = mapA.values().iterator();
//
//	while(iterator1.hasNext()) {
//	    Object nextValue = iterator1.next();
//	    System.out.println(nextValue);
//	}
	Set key=mapA.keySet();
	Collection vaal= mapA.values();
	Iterator it1=key.iterator();
	Iterator it2=vaal.iterator();
	
	while(it1.hasNext()) {
		Object ob=it1.next();
		Object qw=mapA.get(ob);
		System.out.println(qw);
	}
	System.out.println("*******");
	while(it2.hasNext()) {
		Object va=it2.next();
		System.out.println(va);
	}
	
//	
//	for(Object value : mapA.values()){
//	    System.out.println(value);
//	}
//	for(Object value : mapA.keySet()){
//	    System.out.println(value);
//	}
//	for(Object value : mapA.entrySet()){
//	    System.out.println(value);
//	}
}
public static void m3() {
	Map mapA = new HashMap();

	mapA.put("key1", "element 1");
	mapA.put("key2", "element 2");
	mapA.put("key3", "element 3");
	Set entries = mapA.entrySet();
	Iterator iterator = entries.iterator();
	while(iterator.hasNext()) {
	    Map.Entry entry = (Map.Entry) iterator.next();
	    Object key = entry.getKey();
	    Object value = entry.getValue();
	    System.out.println("Entry : " + key + " : " + value);
	}
	
	for(Object entryObj : mapA.entrySet()){
	    Map.Entry entry = (Map.Entry) entryObj;
	    Object key = entry.getKey();
	    Object value = entry.getValue();
	    System.out.println("Entry : " + key + " : " + value);
	}
}
}