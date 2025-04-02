package Week_2;

public class MajorityElement {
	public static int majorityElement(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count>n/2){
                return nums[i];
            }
        }
        return -1;
    }
	public static void main(String[] args) {
		int[] nums = {1,2,2,3,2,2};
		int result = majorityElement(nums);
        System.out.println("Majority element: " + result);
	}
}

