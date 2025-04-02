package Week_2;

import java.util.Arrays;
public class DivideArray1 {

	public static boolean divideArray(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length;
		if(n%2!=0) return false;
		
		for(int i = 0; i<n;i+=2) {
			if(arr[i]==arr[i+1]) {
				return true;
			}
			else {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		int[] arr = {18,19,5,5,18,19,5,6,12,19,13,4,16,11,4,16,10,8,12,8,2,1,8,17,4,18,3,5,16,2,16,12,17,16,7,16,2,17,19,9,1,20,17,17,4,6};
		System.out.println(arr.length);
		System.out.println(divideArray(arr));
		
		
			}
		
	}

