import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class DateClass {
  private Calendar cal;
  private SimpleDateFormat formatter;
  private String monthName;

  public DateClass() {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, 0);
    this.cal.set(Calendar.DAY_OF_MONTH, 0);
    this.cal.set(Calendar.YEAR, 1970);
  }
  
  public DateClass(int m, int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, m - 1);
    this.cal.set(Calendar.DAY_OF_MONTH, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
  public DateClass(String m, int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.MONTH, this.strToMonth(m));
    this.cal.set(Calendar.DAY_OF_MONTH, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
  public DateClass(int d, int y) {
    this.cal = new GregorianCalendar();
    this.cal.set(Calendar.DAY_OF_YEAR, d);
    this.cal.set(Calendar.YEAR, y);
  }
  
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

  public String toString() {
    return String.format("%d/%d/%d%n", this.cal.get(Calendar.MONTH)+1, this.cal.get(Calendar.DAY_OF_MONTH), this.cal.get(Calendar.YEAR));
  }

  public String toMonthNameDateString() {
    return String.format("%s %d, %d%n", this.cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault()), this.cal.get(Calendar.DAY_OF_MONTH), this.cal.get(Calendar.YEAR));
  }
  
  public String toDayDateString() {
    return String.format("%d %d%n", this.cal.get(Calendar.DAY_OF_YEAR), this.cal.get(Calendar.YEAR));
  }
  
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
