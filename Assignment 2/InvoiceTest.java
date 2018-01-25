public class InvoiceTest {

  public static void main(String[] args) {
  
    // Create an instance of the Invoice class
    Invoice invoice = new Invoice("00042", "Guide", 100, 10000);
    
    printInvoiceInformation(invoice);
    
    // Demonstrate setter methods by updating various fields within our Invoice instance
    invoice.setPartNumber("00043");
    invoice.setPartDescription("Guide Mark II");
    invoice.setUnitPrice(5000000);
    invoice.setQuantity(1);

    printInvoiceInformation(invoice);
    
  }

  // Helper method that, when called, prints all properties of the passed Invoice instance
  // this is useful to demonstrate Invoice's getter methods, while keeping our main method concise
  private static void printInvoiceInformation(Invoice invoice) {
    System.out.printf("%nPart #%s is a(n) %s. It costs $%.2f per unit, and the number of units is %d.%n",
      invoice.getPartNumber(), invoice.getPartDescription(), invoice.getUnitPrice(), invoice.getQuantity());
      
    System.out.printf("The total cost recorded on the invoice for this order is $%.2f%n", invoice.getInvoiceAmount());
  }

}
