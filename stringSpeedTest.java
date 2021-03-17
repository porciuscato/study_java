public class stringSpeedTest {
    public static void main(String args[]) {
        Runtime rt = Runtime.getRuntime();
        System.out.print("메모리 : " + rt.freeMemory());
        System.out.println(" / " + rt.totalMemory());
        
        long start = System.currentTimeMillis();
        String a = "a";
        for(int i=0; i < 100000000; i++) {
            a.concat(a);
            // a += "a";
        }
        long stop = System.currentTimeMillis();
        System.out.println("총 소요시간 : " + (stop - start) + " ms");
        System.out.print("메모리 : " + rt.freeMemory());
        System.out.println(" / " + rt.totalMemory());
    }
}