
package problems;

/**
 * @author @DEEP
 * @date 28-Jul-2025 8:28:46 pm for PurpleBits InfoSystems

 */
public class RichestCustomerWealth {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		int[][] arr = {
			    {1, 5},
			    {7, 3},
			    {3, 5}
			};
		
		int[][] arr1 = {
			    {1, 2, 3},
			    {3, 2, 1}
			};
		
		
		int[][] arr2 = {
			    {2, 8, 7},
			    {7, 1, 3},
			    {1, 9, 5}
			};
		
		int[][] arr3 = {
			    {6, 59, 64, 19, 30, 76, 71, 86, 90, 25, 56, 17, 19, 72, 61, 56, 24, 40, 35, 39, 67, 28, 52, 11, 82, 72, 8, 82, 81, 47}
			};
		int maximumWealth = maximumWealth(arr3);
		
	}

public  static int maximumWealth(int[][] accounts) {
	int wealth = 0;
	int[] res =  new int[accounts.length];
	for (int i = 0; i < accounts.length; i++) {
		int[] js = accounts[i];
		int sum = 0;
		for (int j = 0; j < js.length; j++) {
			int k = js[j];
			sum  =sum+ k;
			}
		res[i] = sum;
		if(i>0)
		{
			if(res[i]>= res[i-1])
			{
				if(wealth<= res[i])
				wealth= res[i];
			}else
			{
				if(wealth<= res[i-1])
				wealth= res[i-1];
			}
		}else
			wealth= res[i] ;
		
	}
	
	return wealth;
        
    }
	
	
}

