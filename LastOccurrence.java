package Week_2;

public class LastOccurrence {
	public static int lastOccurrence(int arr[],int target) {
	int left = 0;
    int right = arr.length - 1;
    int result = -1; // Initialize to -1 (not found)

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (arr[mid] == target) {
            result = mid; // Store the current position
            left = mid + 1; // Search left half for earlier occurrences
        } else if (arr[mid] < target) {
            left = mid + 1; // Search right half
        } else {
            right = mid - 1; // Search left half
        }
    }
    return result;
}
public static void main(String[] args) {
	int arr[] = {1,2,2,2,3,4};
	int x = 2;
	System.out.println(lastOccurrence(arr,x));
		}
}
