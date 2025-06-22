package level1.exercise2.main;

import level1.exercise2.classData.OnlineWorker;
import level1.exercise2.classManagement.WorkerManagement;

public class Main {
    public static void main(String[] args) {
        WorkerManagement workerManagement = new WorkerManagement();
        workerManagement.addWorkerInitial();
        workerManagement.printData();

        OnlineWorker onlineWorker = new OnlineWorker("Juan", "Perez", 20);
        System.out.println("Price Internet: " + onlineWorker.getPriceInternet("Premium"));
        onlineWorker.oldMethod();
    }
}
