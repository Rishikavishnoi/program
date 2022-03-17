package challenges;

public class Recursion1 {

	public static void main(String[] args) {
		message();
		
		int n=1;
		print(n);
	}
	public static void print(int n) {
		if(n==6) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n+1);
	}
	
	public static void message() {
		System.out.println("hello world");
		message1();
	}
	public static void message1() {
		System.out.println("hello world");
		message2();
	}
	public static void message2() {
		System.out.println("hello world");
	message3();
	}
	public static void message3() {
		System.out.println("hello world");
	message4();
	}
	public static void message4() {
		System.out.println("hello world");
	}

}
