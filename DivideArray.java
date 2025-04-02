package Week_2;

public class DivideArray {
	public static boolean divideArray(int[] nums) {
		 if (nums.length % 2 != 0) {
	            return false; // Odd number of elements can't form pairs
	        }

	        // Since we can't use HashMap, we'll use an array to count frequencies
	        // First, find the maximum value to determine the size of our frequency array
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;
	        for (int num : nums) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }

	        // Create frequency array (size needs to cover all possible numbers in the input)
	        int[] freq = new int[max - min + 1];
	        
	        for (int num : nums) {
	            freq[num - min]++; // Count each number's occurrences
	        }

	        for (int count : freq) {
	            if (count % 2 != 0) {
	                return false; // Found an element with odd count
	            }
	        }

	        return true;
	    }
	public static void main(String[] args) {
		 int[] nums1 = {3, 2, 3, 2, 2, 2};
	        System.out.println(divideArray(nums1)); // Output: true

	        int[] nums2 = {1, 2, 3, 4};
	        System.out.println(divideArray(nums2)); // Output: false
	    }
	}


