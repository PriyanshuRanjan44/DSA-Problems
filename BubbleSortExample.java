package Chapter2;

public class BubbleSortExample {
	static void bubbleSort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<(n-1-i); j++) {
				if(arr[j]>arr[j+1]) {
					//swap
					int temp = 0;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	static void display(int []arr) {
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		int arr[] = {3,60,35,2,45,320,5};
		System.out.println("Array before Bubble Sort: ");
		display(arr);
		
		bubbleSort(arr);
		System.out.println("Array after Bubble Sort: ");
		display(arr);
		
	}

}
