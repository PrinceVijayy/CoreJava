package flowcontroldemo;

import java.util.Scanner;
public class Discount {
    public static double orginalPRice, discount;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Original Price");
        orginalPRice= sc.nextDouble();
        System.out.println("Enter Discount in percentage(%)");
        discount=sc.nextDouble();
        System.out.println("The Given Discount is= "+disc());
        System.out.println("The Price After Discount is="+priceAfterDiscount());
        sc.close();
    }
    public static double priceAfterDiscount(){

        double result= orginalPRice-disc();
        return result;
    }

    public static double disc(){
        double result=orginalPRice*(discount/100);
        return result;

    }
    


}
