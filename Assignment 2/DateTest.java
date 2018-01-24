public class DateTest {
  public static void main(String args[]) {
    Date date = new Date(4, 2, 2018);
    
    date.displayDate();
    
    date.setMonth(1);
    date.setDay(1);
    date.setYear(1970);
    
    System.out.printf("Date should be: %d/%d/%d.%n", date.getMonth(), date.getDay(), date.getYear());
    date.displayDate();
    
  }

}
