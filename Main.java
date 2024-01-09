package decorator;

public class Main {
	public static void main(String[] args) {
		
		P p = new P("This is a great paragraph!");
		
		Small small = new Small(p);
		
		Em em = new Em(small);
		
		U u = new U(em);
		
		System.out.println(u.display());
		
		H h3 = new H("This heading", 3);
		
		A a = new A(h3, "www.goFish.com");
		
		I i = new I(a);
		
		System.out.println(i.display());
		
	}
}
