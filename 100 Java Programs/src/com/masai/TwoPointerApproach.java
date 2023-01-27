package com.masai;

import java.util.Arrays;

//public class TwoPointerApproach { // Brute Force Approach 
//	public static void checkPair(int[] arr,int target) {
////		System.out.println(Arrays.toString(arr));
//		boolean flag=false;
//		for(int i=0;i<arr.length-1;i++) {
//			for(int j=i+1;j<arr.length;j++) {
//				if(arr[i]+arr[j]==target) {
//					System.out.println("Pair Exist with given sum");
//					flag=true;
//				}
//				
//			}
//		}
//		if(flag==false) {
//			System.out.println("Pair Does not exist");
//		}
//	}
//	
//public static void main(String[] args) {
//	int target=30;
//	int[] arr= {8,12,20,15,19};
//	checkPair(arr,target);
//}
//}

// Two Pointer Approach 
public class TwoPointerApproach { // Brute Force Approach 
	public static void checkPair(int[] arr,int target) {

	Arrays.sort(arr);
	int left=0;
	int right=arr.length-1;
	boolean flag=false;
	while(left<right) {
		if(arr[left]+arr[right]>target) {
			right--;
		}else if(arr[left]+arr[right]<target) {
			left++;
		}else {
			System.out.println("Pair Exist,Pairs are "+arr[left]+" "+arr[right]);
			flag=true;
			return;
		}
	}
	if(flag==false) {
		System.out.println("Pair does not Exist");
	}
	}
	
public static void main(String[] args) {
	int target=30;
	int[] arr= {8,12,20,15,18};
	checkPair(arr,target);
}
}
