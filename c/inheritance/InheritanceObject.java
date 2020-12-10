package c.inheritance;

public class InheritanceObject {
    public static void main(String[] args) {
        InheritanceObject object = new InheritanceObject();
        System.out.println(object.hashCode());
        System.out.println(object.getClass());
        InheritanceObject obj2 = new InheritanceObject();
        System.out.println(obj2.toString());
    }
}
