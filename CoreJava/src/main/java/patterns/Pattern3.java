package patterns;

/**
 * 
 * @author sv22044 
 * ***** 
 * ##### 
 * ***** 
 * #####
 * *****
 */
public class Pattern3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if(i==2||i==4) {
					System.out.print("#");
				}
				else
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
