package d.lang.practice;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects sam = new NumberObjects();
        sam.printOtherBase(sam.parseLong("1024"));
    }
    public long parseLong(String data) {
        long result;
        try {
            result = Long.parseLong(data);
        } catch (NumberFormatException e) {
            result = -1;
            System.out.println(data + " is not a number");
        }
        return result;
    }

    public void printOtherBase(long value) {
        System.out.println("Original:" + value);
        System.out.println("Binary  :" + Long.toBinaryString(value));
        System.out.println("Hex     :" + Long.toHexString(value));
        System.out.println("Octal   :" + Long.toOctalString(value));
    }
}
