package Week_3;

import java.util.*;
public class MergeSort {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void mergeSort(int arr[], int si, int ei) {
		if(si>=ei)
			return;
		int mid = si + (ei - si)/2;
		mergeSort(arr,si,mid);//left part
		mergeSort(arr,mid+1,ei);//right part
		merge(arr,si,mid,ei);
	}
	public static void merge(int arr[], int si, int mid, int ei) {
		int temp[] = new int[ei-si+1];
		int i = si; //left
		int j = mid+1; //right
		int k = 0;
		while(i<=mid && j<=ei) {
			if(arr[i]<arr[j]) {
				temp[k++] = arr[i++];
				 
			}else {
				temp[k++] = arr[j++];
				
			}
			
			
		}
		//left
		while(i<=mid) {
			temp[k++] = arr[i++];
		}
		//right
		while(j<=ei) {
			temp[k++] = arr[j++];
		}
		for(k=0,i=si; k<temp.length; k++, i++) {
			arr[i] = temp[k];
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i = 0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		mergeSort(arr, 0, arr.length-1);
		printArray(arr);
		sc.close();
		
	}
	
	
}
