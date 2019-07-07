import java.util.HashSet;
import java.util.Set;

public class AddTwoStringsOfBinaryNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String tiles= "AAB";
		int count = 0;
		//static int count;
		System.out.println("Final output is: "+generatePerm(tiles,count));

	}

	public static Set<String> generatePerm(String tiles,int count)
	{
	    Set<String> set = new HashSet<String>();
	    if (tiles == "")
	        return set;

	    Character a = tiles.charAt(0);
	    //int count;
	    int result = 0;

	    if (tiles.length() > 1)
	    {
	        tiles = tiles.substring(1);

	        Set<String> permSet = generatePerm(tiles,count);
	        
	        System.out.println(permSet);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	            	count++;
	                set.add(x.substring(0, i) + a + x.substring(i));
	                
	            }
	        }
	      result = result+count;
	      System.out.println("Result is "+result);
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    System.out.println("Count "+count);
	    return set;
	}
		
	}


