package level1.exercise1.main;

import level1.exercise1.classManagement.WorkerManagement;

public class Main {
    public static void main(String[] args) {
        WorkerManagement workerManagement = new WorkerManagement();
        workerManagement.addWorkerInitial();
        workerManagement.printData();
    }
}
