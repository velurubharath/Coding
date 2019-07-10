import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayAndInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] A = { 2,1,5};
		int k = 806;
		addToArrayForm(A, k);

	}

	public static List<Integer> addToArrayForm(int[] A, int K) {

		int sum = 0;
		int carry = 0;
		List<Integer> result = new ArrayList<Integer>();
		int m = A.length - 1;
		while (m >= 0 || K > 0) {
			int n1 = m >= 0 ? A[m] : 0;
			sum = n1 + (K % 10) + carry;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;

			}else carry=0;
			K = K / 10;
			m--;

			result.add(sum);

		}
		
		if(carry!=0) {
			result.add(carry);
		}
		Collections.reverse(result);
		System.out.println(result);
		return result;

	}

}
