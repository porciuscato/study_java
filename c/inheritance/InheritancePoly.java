package c.inheritance;

public class InheritancePoly {
    public static void main(String[] args) {
        InheritancePoly inheritance = new InheritancePoly();
        inheritance.callPrintName();
    }
    private void callPrintName() {
        Parent parent1 = new Parent();
        parent1.printName();
        Parent parent2 = new Child();
        parent2.printName();
        Parent parent3 = new ChildOther();
        parent3.printName();
    }
}
