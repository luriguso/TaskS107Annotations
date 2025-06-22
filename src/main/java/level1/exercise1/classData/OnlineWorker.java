package level1.exercise1.classData;

public class OnlineWorker extends Worker{
    private final double INTERNET = 100;

    public OnlineWorker(String name, String lastName, double priceHour) {
        super(name, lastName, priceHour);
    }

    @Override
    public double calculateSalary(int hours) {
        if(hours < 0){
            throw new IllegalArgumentException("Hours must be greater than zero");
        }
        if (getPriceHour()<0){
            throw new IllegalArgumentException("Hours must be greater than zero");
        }

        return (hours * getPriceHour()) +  INTERNET;
    }

    @Override
    public double getBonusSalary() {
        return INTERNET;
    }
}
