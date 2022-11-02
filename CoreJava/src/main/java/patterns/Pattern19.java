package patterns;
/**
 * 
 * @author sv22044 
 *
 *  * * * * * * * * * 
 *    * * * * * * *
 *   	* * * * * 
 *    	  * * * 
 *   		*
 *  
 *  
 */
public class Pattern19 {

	public static void main(String[] args) {
		
		for (int i = 9; i >=1; i--) {
			if((i % 2) != 0)
			{
					for (int j = 9; j >= 1; j--) 
					{
						if (j<=i)
						{
							System.out.print("* ");
						}
						else
						System.out.print(" ");
					}	
					System.out.println();
			}
			


		}
	}

}