package collectionframework;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Listex {
// static Listex() {}
	public static void main(String[] args) {
		//arraylist();
		Set t=new TreeSet();
		
	}

	private static void arraylist() {
		List list=new ArrayList();
		list.add(10);
		list.add("string");
		list.add(20.8f);
		Exception ex=new NullPointerException();
		Integer x;
		list.add(ex);
		System.out.println(list);//simple iterate
		
//		Iterator iterator=list.iterator();
//		while(iterator.hasNext())
//		{
//			//Object object = iterator.next();
//			if(iterator.next().getClass().getSimpleName().equals("Integer")){
//				iterator.remove();
//			}
//			//if(iterator.next().getClass() == x)
//		}
//	//	System.out.println(list);
//		
//		//for each loop
////		for(Object ob: list)
////			System.out.println(ob);
//		
////		list.add(0, 20);
////		System.out.println(list.indexOf(20));
////		list.remove(0);
////		System.out.println(list.indexOf(10));
////		System.out.println(list.contains(20));
////		System.out.println(list.get(2));
//		
	}

}
