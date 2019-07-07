
public class AddDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 69;
		
		
		addDigits(sum);
	}
	
	
    public static int addDigits(int sum) {
        int result =0;
        if(sum<10) {
        	return sum;
        }
        while(sum-10>=0){
          result=sumTheIntegers(sum);
          sum=result;
         
        }
        System.out.println("Result is "+sum);
       
		return result;
        
    }
    
    public static int sumTheIntegers(int sum){
    	int summation = 0;
        
      int reminder = sum%10;
      sum=sum/10;
      summation=reminder+sum;
      
        
      System.out.println("Summation is "+summation);
		return summation; 
    }

}
