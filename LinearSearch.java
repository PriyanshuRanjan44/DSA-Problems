package Searching;

public class LinearSearch {
	public static int linearsearch(int []arr,int item) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==item) {
				System.out.print("Item '"+item+"' is found at index: "+i);
				return i;
			}
		}
		System.out.print("Item "+item+" is not in the array.");
		return -1;
	}
	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40, 50, 60};
		
		int item = 50;
		linearsearch(arr,item);
	}
}
