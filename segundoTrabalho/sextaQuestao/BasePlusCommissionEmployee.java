package sextaQuestao;

private CommissionEmployee commissionEmployee;
private double baseSalary;

public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
    commissionEmployee = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
    setBaseSalary(baseSalary);
}

public void setBaseSalary(double salary) {
    baseSalary = (salary < 0.0) ? 0.0 : salary;
}

public double getBaseSalary() {
    return baseSalary;
}

public double earnings() {
    return getBaseSalary() + commissionEmployee.earnings();
}

@Override
public String toString() {
    return String.format("%s %s\n%s: %.2f", "base-salaried", commissionEmployee.toString(), "base salary", getBaseSalary());
}

}
