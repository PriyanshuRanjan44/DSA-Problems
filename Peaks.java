package Week_2;

import java.util.ArrayList;
import java.util.List;
	
public class Peaks {
	public static List<Integer> findAllPeaks(int[]nums){
		   List<Integer> peaks = new ArrayList<>();
		        int n = nums.length;
		        
		        // Handle empty array or single element array
		        if (n == 0) return peaks;
		        if (n == 1) {
		            peaks.add(0);
		            return peaks;
		        }
		        
		        // Check first element
		        if (nums[0] >= nums[1]) {
		            peaks.add(0);
		        }
		        
		        // Check middle elements
		        for (int i = 1; i < n - 1; i++) {
		            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
		                peaks.add(i);
		            }
		        }
		        
		        // Check last element
		        if (nums[n - 1] >= nums[n - 2]) {
		            peaks.add(n - 1);
		        }
		        
		        return peaks;
		    }

		    public static void main(String[] args) {
		        int[] arr = {1, 2, 5, 3, 4, 2, 6, 1};
		        List<Integer> peakIndices = findAllPeaks(arr);
		        
		        System.out.println("All peak elements in the array:");
		        for (int index : peakIndices) {
		            System.out.println("Index: " + index + ", Value: " + arr[index]);
		        }
		    }
		}
