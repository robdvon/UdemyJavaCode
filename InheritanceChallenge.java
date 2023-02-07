public class InheritanceChallenge {
    public static void main(String[] args) {

        Employee tim = new Employee("Tim", "11/11/1985",  "01/01/2020");
        System.out.println(tim);
        System.out.println("Age = " +tim.getAge());
        System.out.println("Pay = " +tim.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990",  "03/03/2020", 35000);
        System.out.println(joe);
        System.out.println("Joe's paycheck = $" +joe.collectPay());

        joe.retire();
        System.out.println("Joe's pension check = $" +joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" +mary.collectPay());
        System.out.println("Mary's Holiday pay = $" +mary.getDoublePay());
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {

        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));

        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public class Employee extends Worker {

    private long employeeId;
    private String hireDate;

    private static int employeeNo = 1;
    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                "} " + super.toString();
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public class SalariedEmployee extends Employee {

    double annualSalary;
    boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {

        double paycheck = annualSalary / 26;
        double adjustedPay = (isRetired) ? 0.9 * paycheck : paycheck;

        return (int) adjustedPay;
    }

    public void retire() {

        terminate("12/12/2025");
        isRetired = true;
    }
}

------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public class HourlyEmployee extends Employee {

    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthDate, String hireDate, double hourlyPayRate) {
        super(name, birthDate, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();
    }
}


