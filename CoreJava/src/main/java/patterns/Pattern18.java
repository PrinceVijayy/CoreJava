package patterns;

/**
 * 
 * @author sv22044 
 * 			*
 *  	  * * * 
 * 	    * * * * * 
 *    * * * * * * *
 *  * * * * * * * * * 
 */
public class Pattern18 {

	public static void main(String[] args) {
		
		/**for (int i = 1; i <=10; i++) {
			if((i % 2) != 0)
			{
					for (int j = 10; j >= 1; j--) 
					{
						if (j <= i)
						{
							System.out.print("* ");
						}
						else
						System.out.print(" ");
					}	
					System.out.println(); 
			}*/
		int star=1, space=4;
		for (int i=1;i<=5;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
				
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*") ;
				
			}
			star=star+2;
			space=space-1;
			System.out.println(" ");


		}
	}

}