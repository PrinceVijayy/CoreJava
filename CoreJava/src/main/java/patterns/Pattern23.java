package patterns;

/**
 * 
 * @author sv22044 
 *  
 *  0 0 0 0 0
 *  1 1 1 1 1
 *  0 0 0 0 0 
 *  1 1 1 1 1
 *  0 0 0 0 0
 */

public class Pattern23 
{

	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if (i%2!=0)
				System.out.print("0 ");
				else
					System.out.print("1 ");
			
			}	 
			
			System.out.println();
		}
	}
			
}
		