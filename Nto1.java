package challenges;



public class Nto1 {

	public static void main(String[] args) {
		NoRev(5);

	}

	private static void NoRev(int n) {
		if(n==0) {
			return;
		}
		NoRev(n-1);
		System.out.println(n);
		
		
	}

}
