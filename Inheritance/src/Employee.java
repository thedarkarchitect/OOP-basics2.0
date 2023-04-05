public class Employee extends Worker{
    private long employeeId;
    private String hireDate;

    private static  int employeeNo = 1;//this is a static variable that can be effected

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;//this tapping into a static variable which is incremented on instance
        this.hireDate = hireDate;
    }

    @Override
    public String
    toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
