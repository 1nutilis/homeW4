package OCP;

public class PermanentEmployeeSalaryCalculator implements SalaryCalculator {
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.2;
    }

}
