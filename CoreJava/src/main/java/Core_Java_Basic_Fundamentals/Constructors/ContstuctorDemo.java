package constructorDemo;

public class ContstuctorDemo {
    String name, domain;
    int age ;
    public ContstuctorDemo(){

        System.out.println("default");

    }
    public ContstuctorDemo(String name){
        this.name=name;
        System.out.println("name="+name);
    }
    public ContstuctorDemo(int age){
        this.age=age;
        System.out.println("age="+age);
    }
    public ContstuctorDemo(String name, int age, String domain){
        this.name=name;
        this.age=age;
        this.domain=domain;
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Domain="+domain);
    }
    public ContstuctorDemo(String name, String domain, int age){
        this.name=name;
        this.age=age;
        this.domain=domain;
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Domain="+domain);
    }

    public static void main(String[] args){
        ContstuctorDemo s1=new ContstuctorDemo("vijay",22,"java");
        ContstuctorDemo s2=new ContstuctorDemo("ravali",26,"java");
        ContstuctorDemo s3=new ContstuctorDemo("vijay");
        ContstuctorDemo s4=new ContstuctorDemo(22);
        ContstuctorDemo s5=new ContstuctorDemo("manu","java",30);
        ContstuctorDemo s6=new ContstuctorDemo();
    }
}
