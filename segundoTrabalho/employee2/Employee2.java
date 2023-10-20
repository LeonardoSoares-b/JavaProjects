package employee2;

abstract class Employee2 {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public abstract double earnings();

    @Override
    public String toString() {
        return String.format("%s %s", getFirstName(), getLastName());
    }
}

class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, double weeklySalary) {
        super(firstName, lastName);
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

class HourlyEmployee extends Employee {
    private double wage;
    private double hours;

    public HourlyEmployee(String firstName, String lastName, double wage, double hours) {
        super(firstName, lastName);
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

class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, double grossSales, double commissionRate) {
        super(firstName, lastName);
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

class Pieceworker extends Employee {
    private double wagePerPiece;
    private int piecesProduced;

    public Pieceworker(String firstName, String lastName, double wagePerPiece, int piecesProduced) {
        super(firstName, lastName);
        this.wagePerPiece = wagePerPiece;
        this.piecesProduced = piecesProduced;
    }

    public double getWagePerPiece() {
        return wagePerPiece;
    }

    public void setWagePerPiece(double wagePerPiece) {
        this.wagePerPiece = wagePerPiece;
    }

    public int getPiecesProduced() {
        return piecesProduced;
    }

    public void setPiecesProduced(int piecesProduced) {
        this.piecesProduced = piecesProduced;
    }

    @Override
    public double earnings() {
        return wagePerPiece * piecesProduced;
    }

    @Override
    public String toString() {
        return String.format("Pieceworker: %s%nWage per Piece: $%.2f, Pieces Produced: %d", super.toString(), getWagePerPiece(), getPiecesProduced());
    }
}

public class PayrollSystemTest {
    public static void main(String[] args) {
        Employee[] employees = new Employee[4];
        employees[0] = new SalariedEmployee("John", "Doe", 800.0);
        employees[1] = new HourlyEmployee("Jane", "Smith", 12.0, 45.0);
        employees[2] = new CommissionEmployee("Mike", "Johnson", 5000.0, 0.1);
        employees[3] = new Pieceworker("Alice", "Brown", 2.5, 200);

        for (Employee employee : employees) {
            System.out.println(employee.toString());
            System.out.println("Earnings: $" + employee.earnings());
            System.out.println();
        }
    }
}

}
