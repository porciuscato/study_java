package c.inheritance;

public class Dog extends Animal {
    protected int legCount = 4;
    protected boolean hasWing = false;

    protected void move() {
        System.out.println("This dog moves");
    }
    protected void eatFood() {
        System.out.println("This dog eats");
    }
}
