import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateClass {
  private Calendar cal;
  private SimpleDateFormat formatter;
  private String monthName;

  // Overloaded constructors
  
  // Default (no arguments - Jan 1 1970)
  public DateClass() {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, 0);
    this.cal.set(Calendar.DAY_OF_MONTH, 0);
    this.cal.set(Calendar.YEAR, 1970);
  }
  
  // Month, day, and year provided as integers
  public DateClass(int m, int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, m - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
  // Month provided as String, day and year provided as integers
  public DateClass(String m, int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, this.strToMonth(m));
    this.cal.set(Calendar.DAY_OF_MONTH, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
  // day of year and year provided as integers
  public DateClass(int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.DAY_OF_YEAR, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
  
  // Setters and getters for month/day/year
  public int getMonth() {
    return this.cal.get(Calendar.MONTH);
  }
  
  public void setMonth(int m){
    this.cal.set(Calendar.MONTH, m);
  }
  
  public int getDay() {
    return this.cal.get(Calendar.DAY_OF_MONTH);
  }
  
  public void setDay(int d){
    this.cal.set(Calendar.DAY_OF_MONTH, d);
  }
  
  public int getYear() {
    return this.cal.get(Calendar.YEAR);
  }
  
  public void setYear(int y){
    this.cal.set(Calendar.YEAR, y);
  }

  // default tostring is MM/DD/YYYY
  public String toString() {
    return String.format("%d/%d/%d%n", this.cal.get(Calendar.MONTH)+1, this.cal.get(Calendar.DAY_OF_MONTH), this.cal.get(Calendar.YEAR));
  }

  // Month name plus day of month plus year
  public String toMonthNameDateString() {
    return String.format("%s %d, %d%n", this.cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()), this.cal.get(Calendar.DAY_OF_MONTH), this.cal.get(Calendar.YEAR));
  }
  
  // Day of Year plus Year
  public String toDayDateString() {
    return String.format("%d %d%n", this.cal.get(Calendar.DAY_OF_YEAR), this.cal.get(Calendar.YEAR));
  }
  
  // Converts lowercase strings into a Month index that we can pass to our Calendar instance
  public int strToMonth(String month) {
    switch(month.toLowerCase()){
      case "january":
        return Calendar.JANUARY;
        
      case "february":
        return Calendar.FEBRUARY;
      
      case "march":
        return Calendar.MARCH;
        
      case "april":
        return Calendar.APRIL;
        
      case "may":
        return Calendar.MAY;
        
      case "june":
        return Calendar.JUNE;
        
      case "july":
        return Calendar.JULY;
        
      case "august":
        return Calendar.AUGUST;
        
      case "september":
        return Calendar.SEPTEMBER;
        
      case "october":
        return Calendar.OCTOBER;
        
      case "november":
        return Calendar.NOVEMBER;
        
      case "december":
        return Calendar.DECEMBER;
      
      default:
        return Calendar.JANUARY;
    }
  }
}
