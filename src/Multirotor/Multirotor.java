package Multirotor;
import Airplane.Airplane;
import Helicopter.Helicopter;

public class Multirotor extends Helicopter {

    private int rotorsNB; //number of rotors

//    Constructor
    public Multirotor(){
    }

    public Multirotor(int rotorsNB) {
        this.rotorsNB = rotorsNB;
    }

    public Multirotor(int cylinderNB, int creation, int passenger, int rotorsNB) {
        super(cylinderNB, creation, passenger);
        this.rotorsNB = rotorsNB;
    }

    public Multirotor(String brand, double price, int hp, int cylinderNB, int creation, int passenger, int rotorsNB) {
        super(brand, price, hp, cylinderNB, creation, passenger);
        this.rotorsNB = rotorsNB;
    }

    public Multirotor(Airplane a1, int cylinderNB, int creation, int passenger, int rotorsNB) {
        super(a1, cylinderNB, creation, passenger);
        this.rotorsNB = rotorsNB;
    }

    public Multirotor(Helicopter h1, int rotorsNB) {
        super(h1);
        this.rotorsNB = rotorsNB;
    }
//    Copy constructor
    public Multirotor(Multirotor m1){
        rotorsNB = m1.rotorsNB;
    }

//    Getter and setter
    public int getRotorsNB() {
        return rotorsNB;
    }

    public void setRotorsNB(int rotorsNB) {
        this.rotorsNB = rotorsNB;
    }

//     Equals function
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Multirotor that = (Multirotor) o;
        return rotorsNB == that.rotorsNB;
    }

//    To string function


    @Override
    public String toString() {
        return "Multirotor{" +
                "rotorsNB=" + rotorsNB +
                '}';
    }
}
