import java.util.Arrays;

public class AssigningCookiesWithGreedFactorsOfChilren {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] g = {1,2,3};
		int[] s = {1,1};
		findContentChildren(g,s);

	}
	
	 public static int findContentChildren(int[] g, int[] s) {

	        int count = 0;
	        int m = g.length-1;
	        int n = s.length-1;
	        
	        System.out.println("Asdds");
	       
	        for(int i =0;i<=m;i++) {
	        
	        for(int j=0;j<=n;j++) {
	        	if(g[i]==s[j]) {
	        		count++;
	        		break;
	        	}
	        }
	        }

	       System.out.println("Count "+count);
	        
	        return count;

}
	 
	 
}


