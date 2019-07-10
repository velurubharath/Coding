
public class ArrangingCoinsAsSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 5;
		arrangeCoins(n);
	}

	  public static int arrangeCoins(int n) {
		  
		  int rows = 0;
	        for(int i =1;n-i>=0;i++){
	            if(n-i>=0){
	                rows++;
	                n=n-i;
	            }else
	            	rows--;
	                 
	        }
	        System.out.println(rows);
			return rows;
	        
	    }
}
