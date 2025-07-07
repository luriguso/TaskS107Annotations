package level1.exercise2.classData;

public class OnlineWorker extends Worker {
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

    /**
     * @deprecated This feature will be removed in version 2.0.
     */
    @Deprecated()
    public double getPriceInternet(String type){
        double price = 0;
        switch(type){
            case "Premium": price = 100;
            break;
            case "Medium": price = 75;
            break;
            case "Low": price = 50;
            break;
            default: throw new IllegalArgumentException("Invalid type");
        }
        return price;
    }

    /**
     * @deprecated This feature will be removed in version 2.0.
     */
    @Deprecated()
    public void oldMethod(){
        System.out.println("Another method is not in use");
    }
}
