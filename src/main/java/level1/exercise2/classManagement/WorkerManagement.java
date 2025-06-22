package level1.exercise2.classManagement;

import level1.exercise2.classData.OnSiteWorker;
import level1.exercise2.classData.OnlineWorker;
import level1.exercise2.classData.Worker;

import java.util.ArrayList;
import java.util.List;

public class WorkerManagement {
    List<Worker> workers;

    public WorkerManagement() {
        workers = new ArrayList<>();
    }

    public void addWorkerInitial() {
        workers.add(new OnlineWorker("Luis", "Gutierrez", 20));
        workers.add(new OnlineWorker("Ricardo", "Soliz", 15));
        workers.add(new OnlineWorker("Luri", "Guso", 25));

        workers.add(new OnSiteWorker("Jhandira", "Aiza", 40));
        workers.add(new OnSiteWorker("Laura", "Llusco", 25));
        workers.add(new OnSiteWorker("Brenda", "Chavez", 20));
    }

    public void printData(){
        if(workers.isEmpty()){
            System.out.println("No workers have been added");
            return;
        }
        final int HOURSWORKED = 30;
        for(Worker worker : workers){
            System.out.println(worker instanceof OnlineWorker ? "Online Worker" : "OnSite Worker");
            System.out.println("Name: " + worker.getName());
            System.out.println("Last Name: " + worker.getLastName());
            System.out.println("Price Hour: " + worker.getPriceHour());
            System.out.println("Hours worked: " + HOURSWORKED);
            System.out.println((worker instanceof OnlineWorker ? "Price Internet: " : "Gasoline") + worker.getBonusSalary());
            System.out.println("Salary: " + worker.calculateSalary(HOURSWORKED));
            System.out.println("Bonus: " + (worker instanceof OnlineWorker ? ((OnlineWorker) worker).getPriceInternet("Medium"): ((OnSiteWorker) worker).calculateGasBonus(150)));
            System.out.println("-----------------------------");
        }
    }
}
