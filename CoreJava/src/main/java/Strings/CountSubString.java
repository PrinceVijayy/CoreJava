
import java.util.Scanner;

public class CountSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the substring");
        String ss=sc.next();
        String s1="java util java java of your java util";
        String s2[]=s1.split(" ");
        int count=0;
        for (String k:s2) {
            if(k.equals(ss))
                count++;
        }
        System.out.println("Count of the given sub string is="+count);
    }
}
