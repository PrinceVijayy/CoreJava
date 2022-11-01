package patterns;

/**
 * 
 * @author sv22044
 *   * * * * *
 *    * * * *
 *     * * *
 *      * *
 *       *
 *  
 */
public class Pattern17 {

	public static void main(String[] args) {
		for(int i=5;i>=1;i--) {
			for(int j=5;j>=1;j--) {
				if(i>=j) 
				{
				System.out.print(" *");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}


}