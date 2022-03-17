package challenges;


public class BS {
   //Binary search problem
	public static void main(String[] args) {
		int[] arr= {23,21,16,10,20,45,60};
		int end=arr.length-1;
		int n=45;
		System.out.println(search(arr, n, 0, end));
		

	}
	static int search(int[] arr,int target,int start, int end) {
		if(start>end) {
			return -1;
		}
		int mid=start+(end-start)/2;
		if(target==arr[mid]) {
			return mid;
		}
		 if (target>arr[mid]) {
			
			search(arr, target, start, mid-1);
		}
		
		return search(arr, target, mid+1, end);
		 }
		
		
	}


