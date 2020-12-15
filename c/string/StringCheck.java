package c.string;

public class StringCheck {
    public static void main(String[] args) {
        String[] addresses = new String[]{
            "서울시 구로구 신도림동",
            "경기도 성남시 분당구 정자동 개발 공정",
            "서울시 구로구 개봉동"
        };
        checkAddress(addresses);
        containsAddress(addresses);
        System.out.println("this is a test".subSequence(0, 4));
        System.out.println("this is a test".substring(0, 4));
        String[] array = "this is a test".split(" ");
        for(String arr:array){
            System.out.print(arr + ", ");
        }

    }
    public static void checkAddress(String[] addresses) {
        int startCount = 0, endCount = 0;
        String startText = "서울";
        String endText = "동";
        for(String address: addresses) {
            if(address.startsWith(startText)) {
                startCount++;
            }
            if(address.endsWith(endText)) {
                endCount++;
            }
        }
        System.out.println("Starts with " + startText + " count is " + startCount);
        System.out.println("Ends with " + endText + " count is " + endCount);
    }
    public static void containsAddress(String[] addresses) {
        int containCount = 0;
        String containText = "시";
        for(String address:addresses){
            if(address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("Contains " + containText + " count is " + containCount);
    }
}
