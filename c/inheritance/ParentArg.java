package c.inheritance;

public class ParentArg {
    public ParentArg(String name) {
        System.out.println("ParentArg(" + name + ") Constructor");
    }

    public ParentArg(int num) {
        System.out.println("ParentArg(int " + num + ") Constructor");
    }

    public void printName() {
        System.out.println("printName() - ParentArg");
    }
}
