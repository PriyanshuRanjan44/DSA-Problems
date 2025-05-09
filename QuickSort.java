package Week_3;

public class QuickSort {
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void quickSort(int arr[], int si, int ei) {
		if(si>=ei)
			return;
		int pIdx = partition(arr,si,ei);
		quickSort(arr, si, pIdx - 1); //left sort
		quickSort(arr, pIdx + 1, ei); //right sort
		
	}
	public static int partition(int arr[], int si, int ei) {
		int pivot = arr[ei];
		int i = si - 1, temp = 0;
		for(int j = si; j<ei; j++) {
			if(arr[j]<=pivot) {
				i++;
				//Swap
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			
		}
		i++;
		temp = pivot;
		arr[ei] = arr[i];
		arr[i] = temp;
		return i;
	}
	public static void main(String[] args) {
//		Quick
		int arr[] = {6,3,9,8,2,5};
		quickSort(arr, 0, arr.length - 1);
		printArray(arr);
		
	}
}
