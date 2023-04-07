public class GasPoweredCar extends Car{
    private double avhKmPerLiter;
    private int cylinders = 6;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avhKmPerLiter, int cylinders) {
        super(description);
        this.avhKmPerLiter = avhKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are filled up, Ready! %n", cylinders);
    }

    @Override
    public void runEngine() {
        System.out.printf("Gas -> usage exceeds the average: %.2f %n", avhKmPerLiter);
    }
}
