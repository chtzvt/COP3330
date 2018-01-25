public class Employee {
  private String first_name, last_name;
  private double monthly_salary;
  
  public Employee(String first, String last, double salary) {
    this.first_name = first;
    this.last_name = last;
    this.monthly_salary = salary;
  }

  public String getFirstName() {
    return this.first_name;
  }

  public void setFirstName(String first) {
    this.first_name = first;
  }
  
  public String getLastName() {
    return this.last_name;
  }

  public void setLastName(String last) {
    this.last_name = last;
  }

  public double getMonthlySalary() {
    return this.monthly_salary;
  }

  public void setMonthlySalary(double salary) {
    this.monthly_salary = (salary > 0) ? salary : this.monthly_salary;
  }

}
