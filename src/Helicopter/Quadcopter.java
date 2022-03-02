package Helicopter;

import Airplane.Airplane;

public class Quadcopter extends Helicopter{

    private int maxSpeed;

    //Default constructor
    public Quadcopter(){
    }

    //Constructor
    public Quadcopter(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Quadcopter(int cylinderNB, int creation, int passenger, int maxSpeed) {
        super(cylinderNB, creation, passenger);
        this.maxSpeed = maxSpeed;
    }

    public Quadcopter(String brand, double price, int hp, int cylinderNB, int creation, int passenger, int maxSpeed) {
        super(brand, price, hp, cylinderNB, creation, passenger);
        this.maxSpeed = maxSpeed;
    }

    public Quadcopter(Airplane a1, int cylinderNB, int creation, int passenger, int maxSpeed) {
        super(a1, cylinderNB, creation, passenger);
        this.maxSpeed = maxSpeed;
    }

    //Copy constructor
    public Quadcopter(Quadcopter q1){
        maxSpeed = q1.maxSpeed;
    }


//    Getter and setter
    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

//    Equals method
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Quadcopter that = (Quadcopter) o;
        return maxSpeed == that.maxSpeed;
    }


    //to string function
    @Override
    public String toString() {
        return "Quadcopter{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
}
