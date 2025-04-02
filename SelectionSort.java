package Chapter2;

public class SelectionSort {
	void selectionSort(int []arr) {
		int temp = 0;
		int n = arr.length;
		for(int i = 0; i<n-1; i++) {
			int min_idx = i;
			for(int j = i+1; j<n; j++) {
				if(arr[j]<arr[min_idx]) {
					min_idx = j;
					
				}
			}
			temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
			
		}
	}
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println(); 
	}
	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort();
		int arr[] = {3, 60, 35, 2, 45, 320, 5};
		ob.selectionSort(arr);
		ob.printArray(arr);
		
	}
}
	