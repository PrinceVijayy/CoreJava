package flowcontrols;
/**
 * 
 * @author vk22051
 *Print Multiplication table of 1,2,3.
 */

public class NestedForLoopDemo {

	public static void main(String[] args) {
		for(int i=1;i<=3;++i) {
			for(int j=1;j<=10;++j)
			System.out.println(i+"x"+j+"="+(i*j));
		}
		System.out.println("------------------------");

	}

}
