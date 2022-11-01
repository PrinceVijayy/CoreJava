package programs;

import java.util.ArrayList;
import java.util.List;

public class _05_Program {
    public static void main(String[] args) {
        String words[] = {"Hello", "Alaska", "Dad", "Peace"};
        _05_Program obj = new _05_Program();
        for (String k : words) {
            System.out.println(k);
        }
    }


    public String[] findWords(String[] words) {
//creating rows
        String[] rows = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};


        //creating result String array
        String[] result = new String[words.length];
        //using for each to work with String array of words
        for (int j = 0; j < words.length; j++) {

            //converting each word to char array
            char[] w1 = words[j].toCharArray();
            //intializing a boolean as false
            boolean rs = false;
            //using for loop to go through each letter in a word
            for (String row : rows) {
                for (char c : w1) {
                    //checking if that letter has any index in that array
                    int ind = row.indexOf(c);
                    //if there is an index make rs as true
                    if (ind >= 0) {
                        rs = true;
                    } else {
                        rs = false;
                        break;
                    }
                }
                if (rs) {
                    result[j] = words[j];
                }
            }
        }
        List<String> list = new ArrayList<>();
        for (String s : result) {
            if (s != null && s.length() > 0) {
                list.add(s);
            }
        }
        return list.toArray(new String[0]);
    }
}
