package programs;

public class _07_LongestCommonPrefix {


    public static void main(String[] args) {
        String str[] = {"flower", "flow", "flight"};
        _07_LongestCommonPrefix obj = new _07_LongestCommonPrefix();
        System.out.println(obj.longestCommonPrefix(str));
//        System.out.println(str[0].substring(0,str[0].length()+1));
    }

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }else{
            // taking the first String and checking if it is a sub string in the remaining
            String firstWord = strs[0];
            //loop for going through each string
            for (int i = 0; i < firstWord.length(); i++) {
                String wordSubStrings = firstWord.substring(0, firstWord.length() - i);
                if (subStringOfRemainingStrings(wordSubStrings, firstWord.length() - i, strs)) {
                    return wordSubStrings;
                }
            }
        }
        return "";
    }

    public boolean subStringOfRemainingStrings(String str, int endIndex, String[] strs) {
        boolean report = false;
        boolean indexReport = false;
        for (int i = 1; i < strs.length; i++) {
            if (endIndex<=strs[i].length()) {
                indexReport = true;
            }else {
                indexReport=false;
                break;
            }
        }
        if(indexReport){
            for (int i = 1; i < strs.length; i++) {
                if ( strs[i].substring(0,endIndex).equals(str)) {
                    report = true;
                } else {
                    report = false;
                    break;
                }
            }
        }
        return report;
    }
}
