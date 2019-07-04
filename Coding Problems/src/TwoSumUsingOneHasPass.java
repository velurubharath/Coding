import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingOneHasPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * IN this solution instead of copyin the entire array to map before hand,
		 * We paralelly check the compliment in hashmap and if not available 
		 * add the number to hashmap 
		 * 
		 * 
		 * timeComplexity isO(n) as transversing the whole lenth\
		 * Space complexity is O(n) as using hashmap
		 */

		int[] nums = { 2, 11, 7, 15 };
		int target = 9;
		twoSums(nums, target);

	}

	private static int[] twoSums(int[] nums, int target) {
		// TODO Auto-generated method stub
		
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++) {
			int compliment = target-nums[i];
			if(map.containsKey(compliment)) {
				
				System.out.println("The two indices are "+map.get(compliment)+" "+i);
				return new int[] {i,map.get(compliment)};
			}
			map.put(nums[i],i);
		}
		
	

	throw new IllegalArgumentException("No two solution");
}

}
