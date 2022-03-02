package MAV;
import UAV.UAV;

import java.util.Objects;

public class MAV extends UAV{

    //Variable
    private String model;
    private double size;


    //Constructor
    public MAV(){
        super();
        System.out.println("Default constructor");
    }

    //Constructor
    public MAV(String model, double size) {
        this.model = model;
        this.size = size;
    }

    //Constructor
    public MAV(double weight, double price, String model, double size) {
        super(weight, price);
        this.model = model;
        this.size = size;
    }

    //Copy constructor
    MAV(MAV MV){
        model = MV.model;
        size = MV.size;
    }

    //GET and SET
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //Equals function
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MAV mav = (MAV) o;
        return Double.compare(mav.size, size) == 0 && Objects.equals(model, mav.model);
    }

    //ToString methode
    @Override
    public String toString() {
        return "MAV{" +
                "model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}
