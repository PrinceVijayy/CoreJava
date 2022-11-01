package flowcontrols;
/**
 * 
 * @author vk22051
 *Print array elements of 10,20,30,40.
 */
public class ForEachLoopDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40 };
		System.out.println("----Normal Loop----");
		for (int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}
		System.out.println("----For Each Loop----");
		for (int k : arr) {
			System.out.println(k);
		}
	}

}
