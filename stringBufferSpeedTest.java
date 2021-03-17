public class stringBufferExample {

    public static void main(String args[]) {
        Runtime rt = Runtime.getRuntime();
        System.out.print("메모리 : " + rt.freeMemory());
        System.out.println(" / " + rt.totalMemory());

        long start = System.currentTimeMillis();
        StringBuffer a = new StringBuffer("a");
        for(int i=0; i < 100000000; i++) {
            a.append("a");
        }
        long stop = System.currentTimeMillis();
        System.out.println("총 소요시간 : " + (stop - start) + " ms");
        System.out.print("메모리 : " + rt.freeMemory());
        System.out.println(" / " + rt.totalMemory());
    }
}

/**
메모리 : 419749888 / 421527552
총 소요시간 : 2 ms
메모리 : 419244448 / 421527552
 */