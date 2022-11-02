package strings;

public class String2 {


    public static void main(String[] args){
    String s1="vijayviifhhsdijhah";
    String s2= new String("vijaY");
    String s3= "vijay mohan";
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s1));
        System.out.println(s1.equalsIgnoreCase(s2));
        //methods

        System.out.println(s1.length());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('z'));
        System.out.println(s3.trim());
        System.out.println(s3.substring(2,5));


    }
}
