package programs;

public class _08_ValidParenthesis {


    public static void main(String[] args) {
        _08_ValidParenthesis obj=new _08_ValidParenthesis();
        obj.isValid("(){}[]");
    }
    public boolean isValid(String str){
        boolean result=false;
        char opening_normal_bracket='(';
        char opening_flower_bracket='{';
        char opening_square_bracket='[';
        char[] arr=str.toCharArray();


        return result;
    }
}
