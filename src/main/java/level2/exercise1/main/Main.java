package level2.exercise1.main;

import level2.exercise1.classManagement.CarManagement;
import level2.exercise1.classManagement.JsonSerializer;
import level2.exercise1.exceptions.JsonSerializationException;

public class Main {
    public static void main(String[] args) {
        CarManagement carManagement = new CarManagement();
        carManagement.addCarInitial();
        carManagement.listCars();


        String Path = "src/main/java/resources/Car.json";

        try {
            JsonSerializer.saveToFile(carManagement,Path);
        }catch (JsonSerializationException e){
            System.out.println("Error serializing the object to JSON" + e.getMessage());
        }
    }
}
