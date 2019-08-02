
public class PowerOfFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(isPowerOfFour(20));	

	}
	
	public static boolean isPowerOfFour(int num) {
		
		long i = 1;
		while(i<num) {
			i*=4;	
		}
		
		return i==num;
		
		
	}

}
