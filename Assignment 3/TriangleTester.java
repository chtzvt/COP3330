import java.util.Scanner;

public class TriangleTester {
  
    // Embedded static class (Triangle)
    // This provides a rudimentary representation of a triangle
    public static class Triangle {
      private double sidea, sideb, sidec;
      
      public Triangle(double a, double b, double c) {
        this.sidea = a;
        this.sideb = b;
        this.sidec = c;
      }
      
      // Getter and setter methods for each side of the triangle.
      public double getLegA() {
        return this.sidea;
      }
      
      public void setLegA(double a) {
        this.sidea = a;
      }
      
      public double getLegB() {
        return this.sideb;
      }
      
      public void setLegB(double b) {
        this.sideb = b;
      }

      public double getLegC() {
        return this.sidec;
      }

      public void setLegC(double c) {
        this.sidec = c;
      }

      /* The following method determines whether the given side lengths create
         a triangle. A triangle is considered valid if the following inequalities
         are all true:
          a + b > c
          a + c > b
          b + c > a
      */
      public boolean isTriangle() {
        return (this.sidea + this.sideb > this.sidec &&
            this.sidea + this.sidec > this.sideb &&
            this.sideb + this.sidec > this.sidea);
      }
    }

    public static void main(String[] args) {
      
      System.out.printf("Welcome to TriangleTester!%nPlease enter your side lengths, from smallest to largest:%n");
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Side A = ? ");
      double side1 = scanner.nextFloat();
      
      System.out.print("Side B = ? ");
      double side2 = scanner.nextFloat();
      
      System.out.print("Side C = ? ");
      double side3 = scanner.nextFloat();
      
      Triangle triangle = new Triangle(side1, side2, side3);
      
      if(triangle.isTriangle())
        System.out.printf("%nCongratulations, that's a triangle!!%n");
      else
        System.out.printf("%nThat's no triangle... Bummer!%n");
    }

}
