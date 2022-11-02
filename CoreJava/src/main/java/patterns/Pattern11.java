package patterns;

/**
 * 
 * @author sv22044 
 *  
 * A B C D E
 * F G H I J 
 * K L M N O 
 * P Q R S T
 * U V W X Y
 */
public class Pattern11 {

	public static void main(String[] args) {
		char a='A';
		for (char i = 'A'; i <= 'E'; i++) {
			for (char j = 'A'; j <= 'E'; j++) {
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
