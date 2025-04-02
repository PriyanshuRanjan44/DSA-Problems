public class Check_Sorted_Array {


	public static void main(String[] args) {
	int[] a = {3,4,5,6,7};
	boolean check = true;
	for(int i = 0; i<a.length - 1; i++) {
		if(a[i+1] > a[i]) {
//			System.out.println("1");
			check = true;
		}
		else {
			check = false;
			break;
//			System.out.println("The array is not sorted.");
		}
		
	}
	System.out.println("Is the array sorted? : "+ check);
	}

}
