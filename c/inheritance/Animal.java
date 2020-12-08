package c.inheritance;

public class Animal {
    protected String name;
    protected String kind;
    protected int legCoung;
    protected int iq;
    protected boolean hasWing;

    protected void move() {
        System.out.println("This animal moves");
    }
    protected void eatFood() {
        System.out.println("This animal eats");
    }
}