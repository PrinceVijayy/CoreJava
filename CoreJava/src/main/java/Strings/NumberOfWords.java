package StringDemo;

public class NumberOfWords {
    public static void main(String[] args) {
        String s1=new String("java util java java of util");
        String s2[]=s1.split(" ");
        System.out.println(s2.length);
        int count=0;
        for(int i=0;i<s2.length;++i){
            System.out.println(s2[i]);
            count+=1;
        }
        System.out.println("no.of words in the given string is="+count);
    }
}
