package OCP;

public class ContractEmployeeSalaryCalculator implements SalaryCalculator{
    public double calculateSalary(Employee employee) {
        return employee.getBaseSalary() * 1.1;
    }
}
