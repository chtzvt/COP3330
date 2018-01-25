public class Invoice {
  private String part_number, part_description;
  private int quantity;
  private double price_per_unit;

  public Invoice(String partnum, String partdesc, double unitprice, int quant) {
    this.part_number = partnum;
    this.part_description = partdesc;
    this.price_per_unit = unitprice;
    this.quantity = quant;
  }

  public void setPartNumber(String partnum) {
    this.part_number = partnum;
  }

  public String getPartNumber() {
    return this.part_number;
  }
  
  public void setPartDescription(String desc) {
    this.part_description = desc;
  }

  public String getPartDescription() {
    return this.part_description;
  }
  
  public int getQuantity() {
    return this.quantity;
  }

  public void setQuantity(int quant) {
    this.quantity = (quant >= 0) ? quant : 0;
  }
  
  public double getUnitPrice() {
    return this.price_per_unit;
  }

  public void setUnitPrice(double ppu) {
    this.price_per_unit = (ppu >= 0) ? ppu : 0.0;
  }

  public double getInvoiceAmount() {
    return this.price_per_unit * this.quantity;
  }

}
