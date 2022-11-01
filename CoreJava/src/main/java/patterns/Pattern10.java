package patterns;

/**
 * 
 * @author sv22044 
 * A B C D E
 * A B C D E
 * A B C D E
 * A B C D E
 * A B C D E
 * 
 */
public class Pattern10 {

	public static void main(String[] args) {
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
	}

}