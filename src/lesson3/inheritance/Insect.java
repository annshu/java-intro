package lesson3.inheritance;

public class Insect {
    private int size;
    private String color;

    public Insect(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public void move(){
        System.out.println("Move");
    }

    public void attack(){
        move();
        System.out.println("Attack");
    }
}
