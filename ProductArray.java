package Week_2;

public class ProductArray {
	public static int[] productArray(int[] arr) {
		int n = arr.length;
		int[] result = new int[n];
		int temp = 1;
		for(int i = 0; i<arr.length ; i++) {
			for(int j = 0; j<arr.length;j++) {
				if(i!=j) {
					temp = temp*arr[j];
					
				}
			}
			result[i]=temp;
			temp =1;
		}
		return result;
	}
	public static void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		printArray(productArray(arr));
		
	} 

}
