package c.inheritance;

public class ParentOverridingPrivate {
    public ParentOverridingPrivate() {
        System.out.println("ParentOverriding Constructor");
    }
    private void printName() {
        System.out.println("printname() - ParentOverriding");
    }
}
