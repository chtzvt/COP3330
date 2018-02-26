public class DateClass {
  private int day, month, year, dayInYear, dateType;
  private String monthName;
  private int[][] months = {{1, 31, 0},{2, 28, 59},{3, 31, 90},{4, 30, 120},{5, 31, 151},{6, 30, 181},{7, 31, 212},{8, 31, 243},{9, 30, 273},{10, 31, 304},{11, 30, 334},{12, 31, 365}};
  
  public DateClass() {
    this.month = 1;
    this.day = 1;
    this.year = 1970;
    this.dateType = 1;
  }
  
  public DateClass(int m, int d, int y) {
    this.month = m;
    this.day = d;
    this.year = y;
    this.dateType = 1;
  }
  
  public DateClass(String m, int d, int y) {
    this.monthName = m;
    this.day = d;
    this.year = y;
    this.dateType = 2;
  }
  
  public DateClass(int d, int y) {
    this.day = d;
    this.year = y;
    this.dateType = 3;
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

  public String toMonthNameDateString() {
    return this.toString();
  }
  
  public String toDayDateString() {
    return this.toString();
  }
  
  public int domFromDoy(int day) {
//   private int[][] months = {{1, 31, 0},{2, 28, 59},{3, 31, 90},{4, 30, 120},{5, 31, 151},{6, 30, 181},{7, 31, 212},{8, 31, 243},{9, 30, 273},{10, 31, 304},{11, 30, 334},{12, 31, 365}};
    int candidate = 0;
    int index = -1;
    while(day > candidate) {
      index++;
      candidate += this.months[index][2];
    }
    
    
    
  }
  
  public String toString() {
    switch(this.dateType){
      
      case 1:
        return String.format("%d/%d/%d%n", this.month, this.day, this.year);
      
      case 2:
        return String.format("%d %d, %d%n", this.monthName, this.day, this.year);
        
      case 3:
        return String.format("%.3d %d%n", this.day, this.year);

      default:
        return "";
    }
  }
}
