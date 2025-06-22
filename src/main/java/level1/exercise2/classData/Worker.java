package level1.exercise2.classData;

public abstract class Worker {
    private String name;
    private String lastName;
    private double priceHour;

    public Worker(String name, String lastName, double priceHour) {
        this.name = name;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public abstract double calculateSalary(int hours);
    public abstract double getBonusSalary();
}
