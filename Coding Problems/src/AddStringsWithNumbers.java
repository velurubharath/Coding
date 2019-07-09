
public class AddStringsWithNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String num1 = "123";
		String num2 = "4567";
		
		System.out.println(addStrings(num1,num2));
	}
	
	
	public static String addStrings(String num1, String num2) {
	        
	        System.out.println("num1 length "+num1.length());
	        System.out.println("num2 length "+num2.length());
	       int carry = 0, m= num1.length()-1,n=num2.length()-1;
	       StringBuilder sb = new StringBuilder();
	       while(m>=0 || n>=0 ) {
	    	   int n1=0,n2=0;
	    	   if(m>=0) {
	    		   n1=num1.charAt(m)-'0';
	    	   }
	    	   
	    	   if(n>=0) {
	    		   n2=num2.charAt(n)-'0';
	    	   }
	    	   int sum = carry+n1+n2;
	    	   carry = sum/10;
	    	   sb.append(sum%10);
	    	   m--;
	    	   n--;
	       }
	       if(carry!=0) {
	    	   sb.append(carry);
	       }
	       
	       return sb.reverse().toString();
	       
	}
}
