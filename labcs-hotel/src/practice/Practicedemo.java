package practice;

//import java.awt.List;

class Practicedemo{
	
	public Practicedemo(Practicedemo pd){
		this(pd,"hi");
	}
	 Practicedemo() {
	
	}
	
	public Practicedemo(Practicedemo pd, String string) {
		pd.misc();
		System.out.println(string);
	}
	public static void main(String[] args) {
//		Practicedemo ob=new Practicedemo();
//		Practicedemo ob1=new Practicedemo(ob);
//		//ob.misc();
//		//listimp();
		final byte b=1;
		char c=2;
		short s=3;
		int i=4;
		c=b;
		i=b;
		s=b;
	
	}

	 public static void misc() {
		double a[]=new double[3];
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

//	@SuppressWarnings("deprecation")
//	private static void listimp() {
//		List x= new List();
//		x.add("jwdh");
//		x.add("abc");
//		System.out.println(x.countItems());
//		for(int i=0;i<x.countItems();i++) {
//			System.out.println(x.getItem(i));
//		}
//	}
	 
	 
}