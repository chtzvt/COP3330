public class Date {
  private int day, month, year;
  
  public Date(int m, int d, int y) {
    this.month = m;
    this.day = d;
    this.year = y;
  }
  
  public int getMonth() {
    return this.month;
  }
  
  public void setMonth(int m){
    this.month = m;
  }
  
  public int getDay() {
    return this.day;
  }
  
  public void setDay(int d){
    this.day = d;
  }
  
  public int getYear() {
    return this.year;
  }
  
  public void setYear(int y){
    this.year = y;
  }
  
  public void displayDate() {
    System.out.printf("%d/%d/%d%n", this.month, this.day, this.year);
  }
}
