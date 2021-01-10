package d.collection.practice;

import java.util.Random;
import java.util.HashSet;

public class RandomNumberMaker {    
    public static void main(String[] args) {
        RandomNumberMaker maker = new RandomNumberMaker();
        for(int i = 0; i < 10; i++) {
            System.out.println(maker.getSixNumber());
        }
    }
    public HashSet<String> getSixNumber() {
        Random random = new Random();
        HashSet<String> set = new HashSet<String>();
        String num;
        int a;
        while(set.size() < 6) {
            a = random.nextInt(46);
            num = String.valueOf(a);
            set.add(num);
        }
        return set;
    }
}
