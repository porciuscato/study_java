package d.collection;

import java.util.ArrayList;

public class ListSample {
    public static void main(String[] args) {
        ListSample sample = new ListSample();
        // sample.checkArrayList2();
        // sample.checkArrayList3();
        // sample.checkArrayList4();
        // checkArray();
        // checkSize();
        // sample.checkArrayList5();
        // sample.checkArrayList6();
        sample.checkArrayList7();
    }
    public void checkArrayList1() {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("new Object()");
        list1.add("ArrayListSample");
        list1.add("1.23f");
        ArrayList<String> list2 = new ArrayList<>(100);
    }
    public void checkArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        System.out.println();
        for(String ele: list) {
            System.out.print(ele + " ");
        }
    }
    public void checkArrayList3() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add(1, "A1");
        ArrayList<String> list2 = new ArrayList<String>();
        // ArrayList<String> list2 = new ArrayList<String>(list);
        list2.add("0");
        list2.addAll(list);
        list.add("F");
        System.out.println();
        for(String ele: list2) {
            System.out.print(ele + " ");
        }
    }
    public void checkArrayList4() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        ArrayList<String> list2 = list;
        list.add("C");
        System.out.println();
        for(String ele: list2){
            System.out.print(ele + " ");
        }
    }
    public static void checkArray() {
        int[] arr = new int[10];
        for(int i = 0; i< arr.length; i++){
            arr[i] = i * i;
        }
        System.out.println();
        for(int ele: arr){
            System.out.print(ele + " ");
        }
    }
    public static void checkSize() {
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);
        System.out.println();
        System.out.println(list.size());
    }
    public void checkArrayList5() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        int listSize = list.size();
        for(int i = 0; i < listSize; i++){
            System.out.println("list.get(" + i + ")=" + list.get(i));
        }
    }
    public void checkArrayList6() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        String[] strList = list.toArray(new String[0]);
        for(String ele: strList){
            System.out.println(ele);
        }
    }
    public void checkArrayList7() {
        ArrayList<String> list = new ArrayList<> ();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] temp = new String[2];
        String[] strList = list.toArray(temp);
        for(String ele: temp){
            System.out.println("temp   = " + ele);
        }
        for(String ele: strList){
            System.out.println("strList= " + ele);
        }
    }
}
