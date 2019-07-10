import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayAndInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = {1,2,0,0};
		int k = 34;
		addToArrayForm(A,k);

	}
	
	  public static List<Integer> addToArrayForm(int[] A, int K) {

	        int sum = 0;
	        int carry=0;
	        List<Integer> result = new ArrayList<Integer>();
	        int  m = A.length-1;
	     while(m>=0  || K>0) {
	    	 int n1 = m>=0?A[m]:0;
	    	 sum = n1+(K%10)+carry;
	    	 K=K/10;
	    	 m--;
	    	 carry = sum/10;
	    	 result.add(sum);
 
	     }	        
	        Collections.reverse(result);
	        return result;
	        
	    }

}
