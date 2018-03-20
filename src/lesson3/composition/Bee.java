package lesson3.composition;

class Bee extends Insect implements Attack {
    private Attack attack;

    public Bee(int size, String color, Attack attack){
        super(size,color);
        this.attack = attack;
    }

    public void move(){
        attack.move();
    }

    public void attack() {
        attack.attack();
    }

    public static void main(String[] args) {
        Bee newBee = new Bee(2, "blue", new AttackImpl("Fly","Sting"));
        newBee.move();
        newBee.attack();
    }
}
