package strings;

public class String5 {
    public java.lang.String name;

    @Override
    public java.lang.String toString() {
        return name ;
    }
    public String5(java.lang.String name){
        this.name=name;
    }
    public static void main(java.lang.String[] args){
        String5 s1=new String5("vijay");
        System.out.println(s1);
    }
}
