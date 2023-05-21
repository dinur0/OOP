package SRP;

public class CalculateService {
    private Employee employee; //добавил параметр

    public int calculateNetSalary() {
        int tax = (int) (employee.getBaseSalary() * 0.25);
        return employee.getBaseSalary() - tax;
        }
}
