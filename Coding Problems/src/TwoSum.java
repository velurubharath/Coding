
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*The solution is created by using brute force of 
		 *using two for loops and one if condition
		 * Assumming exactly one or no solution is avaiable
		 * 
		 * time complexity is O(n^2)
		 * Space Complxity is O(n)
		 */
		
		int[] nums = {2,9,11,15};
		int target = 9;
		
		twoSum(nums,target);

	}

	public static  int[] twoSum(int[] nums, int target) {
		// TODO Auto-generated method stub
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[j]==target-nums[i]) {
					System.out.println("second number is found");
					System.out.println("Indices of two numbers are "+i+" "+j);
					return new int[] { i,j};
				}
			}
		}
		throw new IllegalArgumentException ("No two solution");
		
	}

}
