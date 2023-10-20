package employee;
import java.util.Date;
import java.util.Calendar;

public class Employee {
	private String firstName;
    private String lastName;
    private Date birthDate;

    public Employee(String firstName, String lastName, Date birthDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s%nBirthdate: %s", firstName, lastName, birthDate);
    }
}

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, Date birthDate, double weeklySalary) {
        super(firstName, lastName, birthDate);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double earnings() {
        return getWeeklySalary();
    }

    @Override
    public String toString() {
        return String.format("Salaried Employee: %s%nWeekly Salary: $%.2f", super.toString(), getWeeklySalary());
    }
}

public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, Date birthDate, double wage, double hours) {
        super(firstName, lastName, birthDate);
        this.wage = wage;
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
            return (40 * wage) + ((hours - 40) * wage * 1.5);
        }
    }

    @Override
    public String toString() {
        return String.format("Hourly Employee: %s%nWage: $%.2f, Hours: %.2f", super.toString(), getWage(), getHours());
    }
}

public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, Date birthDate, double grossSales, double commissionRate) {
        super(firstName, lastName, birthDate);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }

    @Override
    public String toString() {
        return String.format("Commission Employee: %s%nGross Sales: $%.2f, Commission Rate: %.2f", super.toString(), getGrossSales(), getCommissionRate());
    }
}

public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, Date birthDate, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, birthDate, grossSales, commissionRate);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }

    @Override
    public String toString() {
        return String.format("Base Plus Commission Employee: %s%nBase Salary: $%.2f", super.toString(), getBaseSalary());
    }
}

public class PayrollSystemTest {
    public static void main(String[] args) {
        // Criando um array de Employees
        Employee[] employees = new Employee[4];

        // Criando as instâncias de Employee
        Date birthDate1 = new Date(1990, 6, 30);
        employees[0] = new SalariedEmployee("John", "Doe", birthDate1, 800.0);

       
}
