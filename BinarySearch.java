package Searching;

public class BinarySearch {
	int binarysearch(int []arr, int x) {
		int low = 0, high = arr.length -1;
		while(low<=high) {
			int mid = low + ((high - low)/2);
			if(arr[mid]==x) 
				return mid;
			
			if(arr[mid]<x) 
				low = mid + 1;
				
			else 
				high = mid - 1;
			
			
		}
		return -1;
	}
	int binarysearchR(int arr[], int low, int high, int x) {
		if(high >= low) {
			int mid = low + (high - low)/2;
			if(arr[mid] == x) {
				return mid;
			}
			if(arr[mid]>x) {
				return binarysearchR(arr,low,mid-1,x);
		
			}else {
				return binarysearchR(arr,mid+1,high,x);
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		int x = 2;
		
		BinarySearch ob = new BinarySearch();
		int result = ob.binarysearch(arr, x);
		int resultR = ob.binarysearchR(arr, 1, 6, x);
		if(result == -1) {
			System.out.print("Element is not present in the array.");
		}
		else {
			System.out.println("Element is present at index: "+result);
		}
		if(resultR == -1) {
			System.out.print("Element is not present in the array.");
		}
		else {
			System.out.println("Element is present at index: "+resultR);
		}
	}
}
