public class EmployeeTest {
  public static void main(String args[]){
    
    Employee employees[] = {new Employee("John", "Doe", 16179), new Employee("Larry", "Ellison", 78400000)};
    
    for(int i = 0; i < employees.length; i++){
      printEmployeeInformation(employees[i]);
      
      System.out.printf("Let's give %s a raise!%n", employees[i].getFirstName());
      giveRaise(employees[i], 0.10);
      
      printEmployeeInformation(employees[i]);
    }
  }

  private static double getYearlySalary(Employee employee) {
    return employee.getMonthlySalary() * 12;
  }

  private static void giveRaise(Employee employee, double percentage) {
    double current_salary = employee.getMonthlySalary();
    employee.setMonthlySalary(current_salary * (1.0 + percentage));
  }

  private static void printEmployeeInformation(Employee employee) {
    System.out.printf("%s %s is an employee with a yearly salary of $%.0f%n", employee.getFirstName(), employee.getLastName(), getYearlySalary(employee));
  }

}
