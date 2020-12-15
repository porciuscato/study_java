package c.string;

public class StringSample {
    String test = "자바의 신 최고!!!";

    public static void main(String[] args) {
        StringSample sample = new StringSample();
        sample.convert();
        sample.converUTF16();

    }
    public void convert() {
        try {
            String korean = test;
            byte[] array1 = korean.getBytes();
            printByteArray(array1);
            String korean2 = new String(array1);
            System.out.println(korean2);
        } catch( Exception e) {
            e.printStackTrace();
        }
    }

    public static void printByteArray(byte[] array) {
        for(byte data: array){
            System.out.print(data + " ");
        }
        System.out.println();
    }
    
    public void converUTF16() {
        try {
            String korean = test;
            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);
            String korean2 = new String(array1, "UTF-16");
            System.out.println(korean2);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
