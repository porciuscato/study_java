package c.string;

public class StringCompare {
    public static void main(String[] args) {
        StringCompare sample = new StringCompare();
        // sample.checkString();
        sample.checkCompare();
    }
    public void checkString() {
        String text = "한글은 어떨까?";
        System.out.println("text.length() = " + text.length());
    }
    public void checkCompare() {
        // String text = "Check value";
        String text = new String("Check value");
        String text2 = "Check value";
        if(text == text2) {
            System.out.println("text and text2 is same.");
        } else {
            System.out.println("text and text2 is different.");
        }
        if(text.equals("Check value")) {
            System.out.println("text.equals(text2) result is same");
        } else {
            System.out.println("text.equals(text2) result is diffrent.");
        }
        String text3 = "check value";
        if(text.equalsIgnoreCase(text3)) {
            System.out.println("text and text3 is same");
        }
    }
}
