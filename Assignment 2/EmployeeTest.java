public class EmployeeTest {
  public static void main(String args[]){
    
    // To demonstrate the Employee class, we will use two instances
    // These are placed in an array to minimize needless code repetition later
    Employee employees[] = {new Employee("John", "Doe", 16179), new Employee("Larry", "Ellison", 78400000)};
    
    // As the code to test each Employee instance is identical, we will simply
    // loop through our array of Employee instances to perform tests
    for(int i = 0; i < employees.length; i++){
      // Print the initial values set for the current Employee instance
      printEmployeeInformation(employees[i]);
      
      System.out.printf("Let's give %s a raise!%n", employees[i].getFirstName());
      // Give the current employee a 10% raise
      giveRaise(employees[i], 0.10);
      
      // Now that the employee salary has been modified, print the employee information again
      printEmployeeInformation(employees[i]);
    }
  }

  // Given an Employee instance, this method calculates their yearly salary
  // by multiplying their monthly salary by 12
  private static double getYearlySalary(Employee employee) {
    return employee.getMonthlySalary() * 12;
  }

  // Given an Employee instance and a decimal percentage by which to increase
  // their salary, this method calculates the raise and adjusts the employee's
  // salary accordingly.
  private static void giveRaise(Employee employee, double percentage) {
    double current_salary = employee.getMonthlySalary();
    employee.setMonthlySalary(current_salary * (1.0 + percentage));
  }

  // Given an Employee instance, this method demonstrates the available getter methods
  // by displaying information about the provided Employee instance.
  private static void printEmployeeInformation(Employee employee) {
    System.out.printf("%s %s is an employee with a yearly salary of $%.0f%n", employee.getFirstName(), employee.getLastName(), getYearlySalary(employee));
  }

}
