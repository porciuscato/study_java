package d.lang;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint sample = new JavaLangSystemPrint();
        sample.printStreamCheck();
        sample.printNull();
    }

    public void printStreamCheck() {
        byte b = 127;
        short s = 32767;
        System.out.println(b);
        System.out.println(s);
        printInt(b);
        printInt(s);
    }

    public void printInt(int value) {
        System.out.println(value);
    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj);
        System.out.println(obj + " is null");
        System.out.println(String.valueOf(obj));
        // System.out.println(obj.toString()); // NullPointerException
        System.out.format("%d is 7", 7);
        System.out.println();
        System.out.printf("%d is 7", 7);
    }
}
