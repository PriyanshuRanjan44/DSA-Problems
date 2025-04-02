package Week_1;

public class MoveZero {
	void printArray(int arr[]) {
		int n = arr.length;
		for(int i = 0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	public static void main(String[] args) {
		int arr[] = {0,1,0,2,3,5};
		int count = 0;
		for(int i = 0;i<arr.length; i++) {
//			for(int j = 1; j<arr.length; j++) {
//				if(arr[j-1] == 0) {
			if(arr[i] != 0) {
				if(arr[count] == 0) {
					int temp = arr[count];
					arr[count] = arr[i];
					arr[i] = temp;
//					int temp = arr[j-1];
//					arr[j-1] = arr[j];
//					arr[j] = temp;
				}
				count++;
			}
		}
		MoveZero ob = new MoveZero();
		ob.printArray(arr);
	}

}
