package truePackage1;

public class Solution {
	public int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					int[] result = new int[2];
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 3 };
		int n = 6;
		int[] result = new int[2];
		Solution sol = new Solution();
		result = sol.twoSum(arr, n);
		System.out.println("result = [ " + result[0] + " , " + result[1] + " ]");
	}
}
