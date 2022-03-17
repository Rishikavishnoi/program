package challenges;

import java.util.ArrayList;

public class LinearSearchRec {
  
	public static void main(String[] args) {
		int[] arr= {1,34,3,56,3,16};
		//boolean ans=find(arr, 16, 0);
		//System.out.println(findIndex(arr,56,0));
		//findMulIndex(arr,3,0);
		//System.out.println(list);
		//System.out.println(ans );
		ArrayList<Integer> ans=findAllIndex(arr,3 , 0, new ArrayList<Integer>());
    	 System.out.println(ans);
     }
	  
	static ArrayList<Integer> findAllIndex(int[] arr, int target, int index,ArrayList<Integer> list) {
		if(index==arr.length) {
			return list;
		}
		if(arr[index]==target) {
			 list.add(index);
		 }
		
		return findAllIndex(arr, target, index+1,list);
		
	}
	
	
	
	
	
	//static ArrayList<Integer> list=new ArrayList<>();
	static void findMulIndex(int[] arr, int target, int index) {
		 if(index==arr.length) {
				return ;
			}
		 if(arr[index]==target) {
			 list.add(index);
		 }
		  findMulIndex(arr, target, index+1);
		
		
	}
	static int findIndex(int[] arr, int target, int index) {
		 if(index==arr.length) {
				return -1;
			}
		 if(arr[index]==target) {
			 return index;
		 }
		 return findIndex(arr, target, index+1);
		
	}
	static boolean find(int[] arr, int target, int index) {
		if(index==arr.length) {
			return false;
		}
		return arr[index]==target|| find(arr, target, index+1);
	}
}
