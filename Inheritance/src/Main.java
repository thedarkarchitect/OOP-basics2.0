public class Main {
    public static void main(String[] args) {
        Employee rey = new Employee("Rey", "06/06/1991", "01/06/2023");

        System.out.println(rey);
        System.out.println("Age = "+ rey.getAge());
        System.out.println("Pay = "+ rey.collectPay());

        SalariedEmployee rob = new SalariedEmployee("Rob", "11/11/1998", "03/03/2021", 60000);
        System.out.println(rob);
        System.out.println("Rob's Paycheck = $"+rob.collectPay());

        rob.retire();//this boolean transition makes the tenary function act on the collectPay result.
        System.out.println("Rob's Pension check = $"+rob.collectPay());

        HourlyEmployee suzie = new HourlyEmployee("Suzie", "05/051/1982", "03/03/2021", 17);
        System.out.println(suzie);
        System.out.println("Suzie's Paycheck = $"+suzie.collectPay());
        System.out.println("Suzie's Holiday Pay = $"+ suzie.getDoublePay());

    }
}
