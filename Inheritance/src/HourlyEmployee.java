public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;//max hours someone can work a week times the hourly rate gives you their weekly salary
    }

    public double getDoublePay(){
        return 2 * collectPay();//get gives you the bi week pay using the hourly rate
    }
}
