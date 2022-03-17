package challenges;

public class CountZeroes {

	public static void main(String[] args) {
		int ans=Count(400003020);
System.out.println(ans);
	}

	 static int Count(int n) {
		return helper(n,0);
		
	}

	static int helper(int n, int count) {
		int rem=n%10;
		if(n==0) {
			return count;
		}
		if(rem==0) {
			return helper(n/10, count+1);
		}
		return helper(n/10, count);
		
	}

}
