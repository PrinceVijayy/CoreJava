package programs;

import java.util.Arrays;

public class _04_Program {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        String sArray[] = trimmedString.split(" ");
        char arr[]=sArray[sArray.length-1].toCharArray();
        return arr.length;
    }

    public static void main(String[] args) {
        _04_Program obj = new _04_Program();
        System.out.println(obj.lengthOfLastWord("Today is a nice day"));
    }
}
