
public class JewelsAndStonesUsingIndexOfAndCharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Jewels and Stones with TimeComplexoty of O(m+n)
		 * m is length of S and n i length of J
		 */
		
		String S = "aAAAbbbb";
		String J = "aA";
		
		
		JewelsInStones(S,J);

	}

	private static int JewelsInStones(String S, String J) {
		// TODO Auto-generated method stub
		
		int result = 0;
		
		for(int i=0;i<S.length();i++) {
			if(J.indexOf(S.charAt(i))!=-1)
				result++;
		}
		
		System.out.println("Result is "+result);
		return result;
		
	}

}
