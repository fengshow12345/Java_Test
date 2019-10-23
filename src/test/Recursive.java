package test;

public class Recursive {
	public static void main(String[] args) {
		int d = test(10, 0, 5);
		System.out.print(d);
	}
	public static int test(int a, int b, int x) {
		int c = x++;
		int y = 7;
		if (c == y) {
			return c;
		}
		return test(a, b, x);
	}
}
