import java.util.Arrays;

public class ArrayPartition1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = {7,3,1,0,0,6};
		arrayPairSum(nums);
	}
	
	public static int arrayPairSum(int[] nums) {
        
	    Arrays.sort(nums);
	   // System.out.println(nums);
	    int n = nums.length/2;
	    int sum = 0;
	    for(int i=0; i<(2*n);i+=2){
	    	sum +=nums[i];
	    	
	    }
	     
	  //  System.out.println(sum);
	    return sum;
	    }


}
