package d.string.practice;

public class UseStringMethod {
    public static void main(String[] args) {
        UseStringMethod method = new UseStringMethod();
        String test = "The String class represents character strings.";
        method.printWords(test);
        method.findString(test, "string");
        method.findAnyCaseString(test, "string");
        method.countChar(test, 's');
        method.printContainWords(test, "ss");
    }
    public void printWords(String str){
        String[] words = str.split(" ");
        for(String word: words){
            System.out.println(word);
        }
    }
    public void findString(String str, String findStr){
        if(String.valueOf(str) == null || String.valueOf(findStr) == null) {
            System.out.println("null is detected.");
        }
        System.out.println("string is appeared at " + str.indexOf(findStr));
    }
    public void findAnyCaseString(String str, String findStr){
        if(String.valueOf(str) == null || String.valueOf(findStr) == null) {
            System.out.println("null is detected.");
        }
        System.out.println("string is appeared at " + str.toLowerCase().indexOf(findStr));
    }
    public void countChar(String str, char c) {
        if(String.valueOf(str) == null || String.valueOf(c) == null) {
            System.out.println("null is detected.");
        }
        int count = 0;
        for(char chr: str.toCharArray()){
            if(chr == c){
                count++;
            }
        }
        System.out.println("char 's' count is " + count);
    }
    public void printContainWords(String str, String findStr) {
        if(String.valueOf(str) == null || String.valueOf(findStr) == null) {
            System.out.println("null is detected.");
        }
        for(String word: str.split(" ")){
            if(word.contains(findStr)){
                System.out.println(word + " contains ss");
            }
        }
    }
}
