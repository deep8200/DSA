
package problems;

/**
 * @author @DEEP
 * @date 28-Jul-2025 10:44:54 am for PurpleBits InfoSystems

 */
public class RunningSumofArray {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		System.out.println(runningSum(nums));

	}

	
public static int[] runningSum(int[] nums) {
	int[] res = new int[nums.length];
	res[0] = nums[0];
	for (int i = 1; i < nums.length; i++) {
	res[i]= nums[i]+res[i-1];
		
	}
	
	return res;
        
    }
}

