package c.inheritance;

public class Equals {
    public static void main(String[] arsg) {
        Equals thisObject = new Equals();
        thisObject.equalMethod();
        thisObject.equalMethod2();
        thisObject.equalMethod3();
    }
    public void equalMethod() {
        System.out.println("----- == -----");
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1 == obj2){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
    public void equalMethod2() {
        System.out.println("----- equals() -----");
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1.equals(obj2)){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
    public void equalMethod3() {
        System.out.println("----- getClass().getName() -----");
        MemberDTO obj1 = new MemberDTO("Sangmin");
        MemberDTO obj2 = new MemberDTO("Sangmin");
        if(obj1.getClass().getName() == obj2.getClass().getName()){
            System.out.println("obj1 and obj2 is same");
        } else {
            System.out.println("obj1 and obj2 is different");
        }
    }
}
