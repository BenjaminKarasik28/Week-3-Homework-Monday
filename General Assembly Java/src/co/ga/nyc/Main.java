package co.ga.nyc;

public class Main {

    private static int maxOfTwoNumbers(int a, int b) {
        int maxVal = (a > b) ? a: b;
        return maxVal;
    }
    private static int maxOfThree(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if (b > a && b > c){
            return b;
        }
        else return c;
    }
    private static boolean isCharacterAVowel(char a){
        String vowels = "aeiouy";
        if(vowels.indexOf(a) >= 0){
            return true;
        }
        else return false;
    }
    private static String reverseString(String stringToReverse){
        String newStr = "";
        for(int i=stringToReverse.length()-1; i>=0; i--){
            newStr+=stringToReverse.charAt(i);
        }
        return newStr;
    }
    public static int findLongestWord(String [] s){
        int longest = s[0].length();
        for (String word : s) {
            if(word.length() > longest){
                longest = word.length();
            }
        }
        return longest;
    }
    public static String filterLongWords(String [] s, int i){
        String wordsLongerThani = "";
        for (String words: s) {
            if(words.length() > i) {
                wordsLongerThani += " " + words + ", ";
            }
        }
        return wordsLongerThani;
    }
    public static void main(String[] args) {
        System.out.println(maxOfTwoNumbers(12, 14));
        System.out.println(maxOfThree(12, 14, 1100));
        System.out.println(isCharacterAVowel('b'));
        System.out.println(isCharacterAVowel('a'));
        System.out.println(reverseString("jag testar"));
        String [] s = {"YES", "NOOOOO", "HELLLLLO", "YESYESYES", "HELLLLLLOOOOOOOO"};
        System.out.println(findLongestWord(s));
        System.out.println(filterLongWords(s, 8));
    }
}
