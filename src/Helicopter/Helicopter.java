package Helicopter;
import Airplane.Airplane;

public class Helicopter extends Airplane{

    private int cylinderNB; // numver on cylinder
    private int creation; //date of creation
    private int passenger;

    //Default constructor
    public Helicopter(){
    }

    //Constructor
    public Helicopter(int cylinderNB, int creation, int passenger) {
        this.cylinderNB = cylinderNB;
        this.creation = creation;
        this.passenger = passenger;
    }

    //If Airplane not declared
    public Helicopter(String brand, double price, int hp, int cylinderNB, int creation, int passenger) {
        super(brand, price, hp);
        this.cylinderNB = cylinderNB;
        this.creation = creation;
        this.passenger = passenger;
    }

    //With airplane
    public Helicopter(Airplane a1, int cylinderNB, int creation, int passenger) {
        super(a1);
        this.cylinderNB = cylinderNB;
        this.creation = creation;
        this.passenger = passenger;
    }

    //copy constructor
    public Helicopter(Helicopter h1){
        cylinderNB = h1.cylinderNB;
        creation = h1.creation;
        passenger = h1.passenger;
    }


    //Getter and setter
    public int getCylinderNB() {
        return cylinderNB;
    }

    public void setCylinderNB(int cylinderNB) {
        this.cylinderNB = cylinderNB;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    //equals function
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Helicopter that = (Helicopter) o;
        return cylinderNB == that.cylinderNB && creation == that.creation && passenger == that.passenger;
    }

    //ToString function
    @Override
    public String toString() {
        return "Helicopter{" +
                "cylinderNB=" + cylinderNB +
                ", creation=" + creation +
                ", passenger=" + passenger +
                '}';
    }
}
