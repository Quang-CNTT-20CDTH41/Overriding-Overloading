package advance.dev;

public class Overriding extends Overloading{
	public int test1(int a, int b) {
		return a + b;
	}
	public int test1(int a, int b, int c) {
		return a - b - c;
	}
}
