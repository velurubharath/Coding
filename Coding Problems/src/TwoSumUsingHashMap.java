import java.util.HashMap;
import java.util.Map;

public class TwoSumUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Two numbers sum using Hashmap instead of for loops
		 * By using Hashmap we can lookup Hashmap at time complexity of O(1)
		 * But as we are creating Hashmap we are trading the space complexity to increase the speed
		 */

		int[] nums = {2,7,11,15};
		int target = 9;
		twoSums(nums,target);
		
	}

	public static int[] twoSums(int[] nums, int target) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> map = new HashMap();
		for(int i=0;i<nums.length;i++) {
			map.put(nums[i],i);
		}
		
		for(int j=0;j<nums.length;j++) {
			int compliment = target-nums[j];
			if(map.containsKey(compliment) && map.get(compliment)!=j) {
				System.out.println("The two indices are "+j+" "+map.get(compliment));
				return new int[] {j,map.get(compliment)};
			}
		}
		
	
	throw new IllegalArgumentException("No solution");
}
}
