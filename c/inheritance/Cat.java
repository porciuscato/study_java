package c.inheritance;

public class Cat extends Animal {
    protected int legCount = 4;
    protected boolean hasWing = false;

    protected void move() {
        System.out.println("This cat moves");
    }
    protected void eatFood() {
        System.out.println("This cat eats");
    }
}
