package MAV;
import UAV.UAV;

import java.util.Objects;

public class AgriculturalDrone extends UAV{

    //Variable
    private String brand;
    private int capacity;

    //Default constructor
    public AgriculturalDrone(){
    }

    //constructor
    public AgriculturalDrone(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    //constructor
    public AgriculturalDrone(double weight, double price, String brand, int capacity) {
        super(weight, price);
        this.brand = brand;
        this.capacity = capacity;
    }

    //copy constructor
    public AgriculturalDrone (AgriculturalDrone AD){
        brand = AD.brand;
        capacity = AD.capacity;
    }

    //Mutator and setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    //TO string function
    @Override
    public String toString() {
        return "AgriculturalDrone{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AgriculturalDrone that = (AgriculturalDrone) o;
        return capacity == that.capacity && Objects.equals(brand, that.brand);
    }


}
