package challenges;

public class FabonacciNo {

	public static void main(String[] args) {
//		int n=0;
//		int a=0;
//		int b=1;
//		System.out.println(a);
//		System.out.println(b);
//		Fabo(n,a,b);
		System.out.println(fibo(5));

	}

	//private static void Fabo(int n,int a, int b) {
//		if(n==5) {
//			return;
//		}
//		int sum=a+b;
//		System.out.println(sum);
//		Fabo(n+1,b,sum);
	//}
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		}
		return fibo(n-1)+fibo(n-2);
		
	}

}
