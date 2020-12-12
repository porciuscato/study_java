package c.exception;

public class FinallySample {
    public void FinallySample() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        } finally {
            System.out.println("finally");
        }
        System.out.println("must run");
    }
}
