import Airplane.Airplane;
import Helicopter.Helicopter;
import MAV.AgriculturalDrone;
import MAV.MAV;
import Multirotor.Multirotor;
import UAV.UAV;

public class main {

    public static String findLeastAndMostExpensiveUAV(Object [] array){
        double[] UAVprice = new double [array.length]; // Create array containing all the UAV price
        double price = 0; //init price
        double minvalue;
        double maxvalue;
        String toString = "UAV NOT FOUND"; // init ToString()
        int i = 0; //index
        for (Object o : array) { //loop through the array of objects
                if(o.getClass() == UAV.class || o.getClass() == AgriculturalDrone.class || o.getClass() == MAV.class) { //Making sure the object belong to UAV or child
                    price = ((UAV) o).getPrice(); // use the Get.price function for the object
                    toString = ((UAV) o).toString(); //to string func
                }

            UAVprice[i] = price; //populate price array
            i++;
        }

         minvalue = findMin(UAVprice); //Call findmin price method
         maxvalue = findMax(UAVprice);
        System.out.println("Smallest value found " + minvalue);
        System.out.println("Biggest value found " + maxvalue);
        return "NOT FOUND ANY UAV";
    }

//    Function to get the minimum value of an array
    private static double findMin(double[] array) {
        double min = array[0];
        for(int i=1;i<array.length;i++) {
            if(min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

//    Function to get the maximim value for an array
    private static double findMax(double[] array) {
        double max = array[0];
        for(int i=1;i<array.length;i++) {
            if(max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }


    public static void main(String[] args){

        //  Create 15 objects with the 7 class

//      Airplane OBJECT
        Airplane a1 = new Airplane("Boeing", 3650000, 13000 );
        Airplane a2 = new Airplane("Airbus", 3890000, 16000);
        Airplane a3 = new Airplane("bombardier", 1950000, 8450);
        Airplane a4 = new Airplane("bombardier", 1950000, 8450);

//      Helicopter OBJECT
        Helicopter h1 = new Helicopter(7, 2015,5);
        Helicopter h2 = new Helicopter(10, 2017,7);
        Helicopter h3 = new Helicopter(12, 2019, 8);

//      Multirotor
        Multirotor m1 = new Multirotor(2);
        Multirotor m2 = new Multirotor(1,2017, 1, 2);
        Multirotor m3 = new Multirotor(h1, 4);

//      UAV
        UAV u1 = new UAV(150, 75000);
        UAV u2 = new UAV(500, 250000);
        UAV u3 = new UAV(750, 500000);

//      AgriDrone
        AgriculturalDrone d1 = new AgriculturalDrone(250,200000,"moushard", 10000);
        AgriculturalDrone d2 = new AgriculturalDrone(500, 300000, "Borduas", 20000);
        AgriculturalDrone d3 = new AgriculturalDrone(2,104000,"discounted",5000);

//      MAV
        MAV mav1 = new MAV(10,100400,"ABE3", 320);
        MAV mav2 = new MAV(75, 120000, "Mektoub", 324);
        MAV mav3 = new MAV(25,1300,"lolito", 500);




//      Combination of object between airplane and UAV
        Object[] x = new Object[18];
        x[0] = d3;
        x[1] = a1;
        x[2] = a2;
        x[3] = a3;
        x[4] = h1;
        x[5] = h2;
        x[6] = h3;
        x[7] = m1;
        x[8] = m2;
        x[9] = m3;
        x[10] = u1;
        x[11] = u2;
        x[12] = u3;
        x[13] = d1;
        x[14] = d2;
        x[15] = d3;
        x[16] = mav1;
        x[17] = mav2;

//      Array containing only airplane object
        Object [] y = new Object [9];
        y[0] = a1;
        y[1]= a2;
        y[2] = a3;
        y[3] = h1;
        y[4] = h2;
        y[5] = h3;
        y[6] = m1;
        y[7] = m2;
        y[8] = m3;



//      Equals method working !
        System.out.println(a4.equals(a3));


        findLeastAndMostExpensiveUAV(x);



    }
}
