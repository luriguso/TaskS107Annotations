package level1.exercise2.classData;

public class OnSiteWorker extends Worker {
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

    @Deprecated()
    public double calculateGasBonus(double distance){
        double gasBonus = 0;
        if(distance <= 0){
            throw new IllegalArgumentException("Distance must be greater than zero");
        }

        if(0 < distance && distance > 100){
            gasBonus = 50;
        }else if(100<=distance &&  distance > 200){
            gasBonus = 100;
        }else if(200<=distance &&  distance > 300){
            gasBonus = 150;
        }
        return gasBonus;
    }

    @Deprecated()
    public void oldMethod(){
        System.out.println("Another method is not in use");
    }
}
