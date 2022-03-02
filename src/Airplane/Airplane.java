package Airplane;

import java.util.Objects;

public class Airplane {

    //variable
    private String brand;
    private double price;
    private int hp;

    //default constructor
    public Airplane() {
    }

    //first constructor
    public Airplane(String brand, double price, int hp) {
        this.brand = brand;
        this.price = price;
        this.hp = hp;
    }

    //copy constructor
    public Airplane(Airplane a1){
        brand = a1.brand;
        price = a1.price;
        hp = a1.hp;
    }


    //Getter and Setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }


    @Override
    public String toString() {
        return "Airplane{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", hp=" + hp +
                '}';
    }

    // equals methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return Double.compare(airplane.price, price) == 0 && hp == airplane.hp && Objects.equals(brand, airplane.brand);
    }


}
