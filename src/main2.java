import Airplane.Airplane;
import Helicopter.Helicopter;
import MAV.AgriculturalDrone;
import MAV.MAV;
import Multirotor.Multirotor;
import UAV.UAV;

public class main2 {

//   MAIN2 is similar to main 1 except for the copy function, here the array is created then a for loop
//   then a if statement make sure it's the good class to attribute a new object called with the copy constructor.

    public static Object copyFlyingObjects(Object[] arr) {

        Object[] newArr = new Object[arr.length]; //Create new array with the same of oldArray

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getClass() == Airplane.class) {
                newArr[i] = new Airplane(arr[i]);
            } else if (arr[i].getClass() == Helicopter.class) {
                newArr[i] = new Helicopter(arr[i]);
            } else if (arr[i].getClass() == MAV.class) {
                newArr[i] = new MAV(arr[i]);
            } else if (arr[i].getClass() == Multirotor.class) {
                newArr[i] = new Multirotor(arr[i]);
            } else if (arr[i].getClass() == AgriculturalDrone.class) {
                newArr[i] = new AgriculturalDrone(arr[i]);
            } else if (arr[i].getClass() == UAV.class) {
                newArr[i] = new UAV(arr[i]);
            }
        }
        return newArr;
    }


    public static void main(String[] args) {

        //  Create 15 objects with the 7 class

//      Airplane OBJECT
        Airplane a1 = new Airplane("Boeing", 3650000, 13000);
        Airplane a2 = new Airplane("Airbus", 3890000, 16000);
        Airplane a3 = new Airplane("bombardier", 1950000, 8450);
        Airplane a4 = new Airplane("bombardier", 1950000, 8450);

//      Helicopter OBJECT
        Helicopter h1 = new Helicopter(7, 2015, 5);
        Helicopter h2 = new Helicopter(10, 2017, 7);
        Helicopter h3 = new Helicopter(12, 2019, 8);

//      Multirotor
        Multirotor m1 = new Multirotor(2);
        Multirotor m2 = new Multirotor(1, 2017, 1, 2);
        Multirotor m3 = new Multirotor(h1, 4);

//      UAV
        UAV u1 = new UAV(150, 75000);
        UAV u2 = new UAV(500, 250000);
        UAV u3 = new UAV(750, 500000);

//      AgriDrone
        AgriculturalDrone d1 = new AgriculturalDrone(250, 200000, "moushard", 10000);
        AgriculturalDrone d2 = new AgriculturalDrone(500, 300000, "Borduas", 20000);
        AgriculturalDrone d3 = new AgriculturalDrone(2, 104000, "discounted", 5000);

//      MAV
        MAV mav1 = new MAV(10, 100400, "ABE3", 320);
        MAV mav2 = new MAV(75, 120000, "Mektoub", 324);
        MAV mav3 = new MAV(25, 1300, "lolito", 500);

//      Copy constructor test
        MAV copyMav = new MAV(mav3);
        System.out.println(copyMav);
        System.out.println(mav1);

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



       // System.out.println(copyFlyingObjects(x));
    }
}
