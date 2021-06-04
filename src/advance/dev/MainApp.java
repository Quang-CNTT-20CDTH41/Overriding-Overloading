package advance.dev;

public class MainApp {

	public static void main(String[] args) {
	System.out.println("Kieu nap chong");
	Overloading ovl = new Overloading();
	System.out.println(ovl.test(8, 5));
	System.out.println(ovl.test(8.5, 5));
	
	System.out.println("Kieu ghi de");
	Overriding ovr = new Overriding();
	System.out.println(ovr.test1(5, 6));
	System.out.println(ovr.test1(8, 3, 2));
	}
}
