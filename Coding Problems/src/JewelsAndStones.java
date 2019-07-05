
public class JewelsAndStones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Checking the number of jewel types given in a string to 
		 * jewels and stones given in other string
		 * 
		 * time complexity is O(n^2)
		 * Space Complexity is O(n)
		 */
		
		String J= "aA";
		String S = "aAAbbbb";
		numJewelsInStones(J,S);
		
		

	}
	
	 public static int numJewelsInStones(String J, String S) {
	        
	        char[] JToCharArray = J.toCharArray();
	        System.out.println("J in CHarArray is "+JToCharArray);
	        
	        char[] SToCharArray = S.toCharArray();
	        System.out.println("S in charArray is "+SToCharArray);
	        
	        int result = 0;
	        
	        for(int i=0;i<JToCharArray.length;i++){
	            for(int j=0;j<SToCharArray.length;j++){
	                if(SToCharArray[j]==JToCharArray[i])
	                    result++;
	                
	            }
	        }
	        System.out.println(result);
	        return result;
	        
	    }

}
