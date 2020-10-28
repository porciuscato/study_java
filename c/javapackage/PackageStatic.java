package c.javapackage;

import c.javapackage.sub.SubStatic;

public class PackageStatic{
    public static void main(String[] args){
        SubStatic.subStaticMethod();
        System.out.println(SubStatic.CLASS_NAME);
    }
}