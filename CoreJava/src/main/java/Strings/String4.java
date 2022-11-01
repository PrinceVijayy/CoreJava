package strings;

public class String4 {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String args[]){
        StringBuffer s1=new StringBuffer("vijay");
        String s2=new String("vijay");
        s2= "vijay mohan";
        s1.append(" mohan");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());


    }
}
