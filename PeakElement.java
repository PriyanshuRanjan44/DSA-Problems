package Week_2;

public class PeakElement {
	public static int peakElement(int[] arr) {
		for(int i = 0; i<arr.length; i++) {
			if((i == 0 || arr[i]>=arr[i-1]) && (i==arr.length-1 || arr[i]>=arr[i+1])){
				return i;
			}
		}
		return -1;
		
	}
	public static int peakElementBinarySearch(int[] arr) {
		int left = 0;
		int right = arr.length-1;
		while(left<right) {
			int mid = left+(right-left)/2;
			if(arr[mid]<arr[mid+1]) {
				left = mid+1;
			}
			else {
				right = mid;
			}
		}
		return left;
	}
	public static void main(String[] args) {
		int arr[] = {1,2,5,3,7};
		System.out.println("The peak element is at index:"+peakElement(arr));
		System.out.println("The peak element is at index:"+peakElementBinarySearch(arr));
	}
	

}
