
public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(reverse(1534236469));
	}
	
	public static int reverse(int x) {
		int sum=0;
		 if(x > Integer.MAX_VALUE) return 0;
         if(x < Integer.MIN_VALUE) return 0;
		int i =x;
		 x = modulus(x);

		while(x>0) {
			sum=10*sum;
			sum=sum+x%10;
			x=x/10;
			System.out.println(sum);
			
		}
	
		int result = i>0?sum:-1*sum;
		return result;
	}

	private static int modulus(int x) {
		// TODO Auto-generated method stub
		int y = x>0?x:-1*x;
		return y;
	}

}
