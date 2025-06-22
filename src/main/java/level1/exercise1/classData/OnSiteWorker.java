package level1.exercise1.classData;

public class OnSiteWorker extends Worker{
    private static double gasoline = 50;

    public OnSiteWorker(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public double calculateSalary(int hours) {
        if(hours < 0){
            throw new IllegalArgumentException("Hours must be greater than zero");
        }
        if(getPriceHour() < 0){
            throw new IllegalArgumentException("Price hours must be greater than zero");
        }

        return (hours * getPriceHour())+ gasoline;
    }

    @Override
    public double getBonusSalary() {
        return gasoline;
    }
}
