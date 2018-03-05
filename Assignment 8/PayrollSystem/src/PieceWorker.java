public class PieceWorker extends Employee {
  private double wage;
  private int pieces;
  
  public PieceWorker(String firstName, String lastName, String socialSecurityNumber,
    double perPieceWage, int piecesProduced){
      super(firstName, lastName, socialSecurityNumber);
      this.wage = perPieceWage;
      this.pieces = piecesProduced;
  }
  
  public void setWage(double newWage){
    if(newWage < 0)
      throw new IllegalArgumentException("Per-piece wage must be >= 0.0");
    else
      this.wage = newWage;
  }
  
  public double getWage(){
    return this.wage;
  }
  
  public void setPieces(int newPieces){
    if(newPieces < 0)
      throw new IllegalArgumentException("Per-piece wage must be >= 0.0");
    else
      this.wage = newPieces;
  }
  
  public double getPieces(){
    return this.pieces;
  }
  
  @Override
  public double earnings() {
    return this.wage * this.pieces;
  }
           
  @Override
  public String toString() {
     return String.format("Pieceworker employee: %s%n%s: $%,.2f; %s: %,.2f",
        super.toString(), "per-piece wage", getWage(),
        "pieces produced", getPieces());
  }
  
}
