package c.inheritance;

public class ChildOverridingPrivate extends ParentOverridingPrivate {
    public ChildOverridingPrivate() {
        System.out.println("ChildOverriding Constructor");
    }
    void printName() {
        System.out.println("ChildOverriding printName");
    }
}
