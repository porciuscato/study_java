package c.inheritance;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.move();
        cat.move();
        System.out.println(dog.legCount);
    }
}
