package Week_1;

public class SmallestElement {
	static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}

//	Binary Search Approach
	static int smallest_Element(int[] arr) {
		int low = 0; int high = arr.length-1;
		while(low<high) {
			if(arr[low]<arr[high]) {
				return arr[low];
			}
			int mid = (high - low)/2;
			if(arr[mid]>arr[high]) {
				low = mid+1;
			}
			else {
				high = mid;
			}
		}
		return arr[low];
	}
	static int smallest_Element_linear(int[] arr) {
//		Linear Search Approach
		int mini = Integer.MAX_VALUE;
		for(int i = 0; i<arr.length;i++) {
			mini = Math.min(mini,arr[i]);
		}
		return mini;
		
	}
	public static void main(String[] args) {
		int arr[] = {3,4,5,1,2};
		System.out.println(smallest_Element(arr));
		System.out.println(smallest_Element_linear(arr));

		
	}

}
