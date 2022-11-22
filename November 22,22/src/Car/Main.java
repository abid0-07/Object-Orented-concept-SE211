package Car;

public class Main {
    public static void main(String[] args){
        electric car1 = new electric();
        car1.setBrandName("Tesla");
        car1.setModel("Model-X");
        car1.setColor("White");
        car1.setMileage("350CC");
        car1.setEngineType("Electric Motor");
        car1.display();
        System.out.println("\n");
      engineCar car2 = new engineCar();
        car2.setBrandName("Lamborghini");
        car2.setModel("SVJ");
      car2.setColor("Blue");
       car2.setMileage("7 KMpl");
       car2.setEngineType("L538 V12");
        car2.display();
    }
}
