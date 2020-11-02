package c.javapackage.sub;

public class AccessModifier {
    public void publicMethod(){
        System.out.println("public");
    }
    protected void protectedMethod(){
        System.out.println("protected");
    }
    void packagePrivateMethod(){
        System.out.println("package private");
    }
    private void privateMethod(){
        System.out.println("private");
    }
}
