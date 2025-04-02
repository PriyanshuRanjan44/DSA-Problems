package Chapter2;

public class InsertionSort {
	void insertionSort(int []arr) {
		int n = arr.length;
		for(int i = 1; i<n; i++) {
			int key = arr[i], j = i-1;
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {12,24,17,8,14,35,48,23};
		InsertionSort ob = new InsertionSort();
		ob.insertionSort(arr);
		ob.printArray(arr);
		
	}
}
