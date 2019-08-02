
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 121;
		System.out.println(isPalindrome(x));
	}
	
    public static boolean isPalindrome(int x) {
    	
        if(x<0) return false;
        if((x%10==0) && (x!=0))  return false;
    	
    	String str = new Integer(x).toString();
    	int length = str.length();
    	
    	System.out.println("Length is "+length);
    	for(int i=0;i<=length/2+1;i++) {
    	//	System.out.println(i);
    		if(str.charAt(i)!=str.charAt(length-1)) return false;
    		
    	}
		return true;
    	

    	
        
        
        
    }

}
