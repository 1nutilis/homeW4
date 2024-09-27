package OCP;

public class InternEmployeeSalaryCalculator implements SalaryCalculator{
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 0.8;
    }
}
