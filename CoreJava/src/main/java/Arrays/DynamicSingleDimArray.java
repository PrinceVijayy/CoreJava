package arrays;

import java.util.Scanner;

public class DynamicSingleDimArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter the array elements");
		for(int i=0;i<size;++i){
			arr[i]=sc.nextInt();
			
		}
		for(int j:arr)
		System.out.print(" "+j);
		
	}

}
