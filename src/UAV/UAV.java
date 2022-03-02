package UAV;

public class UAV {

    //Variable
    private double weight;
    private double price;

    //Default constructor
    public UAV() {
    }

    //1 Constructor
    public UAV(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    //Copy constructor

    UAV(UAV uav) {
        System.out.println("Copy constructor called");
        weight = uav.weight;
        price = uav.price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UAV{" +
                "weight=" + weight +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UAV uav = (UAV) o;
        return Double.compare(uav.weight, weight) == 0 && Double.compare(uav.price, price) == 0;
    }
}
