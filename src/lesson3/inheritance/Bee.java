package lesson3.inheritance;

class Bee extends Insect {
    public Bee(int size, String color){
        super(size, color);
    }

    public void move(){
        newMove();
    }

    /*
    public void attack(){
       // move();
        newMove();
        super.attack();
    }
     */

    public void newMove() {
        System.out.println("Fly");
    }

    public static void main(String[] args) {
        Bee newBee = new Bee(2,"red");
        newBee.attack();

    }
}
