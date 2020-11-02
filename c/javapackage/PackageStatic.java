package c.javapackage;

// import c.javapackage.sub.SubStatic;
import static c.javapackage.sub.SubStatic.subStaticMethod;
import static c.javapackage.sub.SubStatic.CLASS_NAME;

public class PackageStatic{
    public static void main(String[] args){
        // SubStatic.subStaticMethod();
        // System.out.println(SubStatic.CLASS_NAME);
        subStaticMethod();
        System.out.println(CLASS_NAME);
    }
}