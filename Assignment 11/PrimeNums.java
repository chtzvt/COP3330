import java.util.*;

public class PrimeNums {

  public static void main(String[] args) {
    
    System.out.printf("Welcome to PrimeNums!%nPlease enter a number:%n");
    
    Scanner scanner = new Scanner(System.in);
    long number = scanner.nextLong();
    
    if(isPrime(number)){
      System.out.printf("%nLooks like %d is prime!%n", number);
    } else {
      System.out.printf("%nLooks like %d isn't so prime after all.%n%nHowever, here are its factors:%n\t%s%n", number, getFactors(number).toString());
    }
  
  }

  private static Set<Long> getFactors(long prime) {
      Set<Long> facts = new HashSet<Long>();
      long tmp = prime;
      for(long i = 2; i <= prime; i++){
          if(tmp % i == 0){
            facts.add(i);
            tmp /= i;
            i--;
          }
      }
      return facts;
  }

  private static boolean isPrime(long num){
      if(num % 2 == 0 && num != 2) // even
          return false;
      
      if(num == 3 || num == 2) // very small primes we won't bother to loop over
          return true;

      for(int i = 3; i < ((int) Math.sqrt(num)+1); i += 2){
          if (num % i == 0)
              return false;
      }
      
      return true;
  }
}
