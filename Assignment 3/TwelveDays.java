public class TwelveDays {
  
  public static void main(String[] args) {
    
    // The outer loop, which loops over the 12 days
    for(int i = 1; i < 13; i++) {
      
      // Starting point for the day's lyric, which we will build upon
      String lyric = "On the %s day of Christmas my true love sent to me %n";
      
      // The inner loop, which iterates over each gift accumulated for each
      // day, over the course of all 12 days.
      for(int j = 1; j < i + 1; j++) {
          // For any day after day one, add the corresponding gifts from
          // the Gift table to our output (by calling getGift for the appropriate day)
          lyric += (j != 1) ? getGift(j) + "%n" : "";
          // The last lyric should have "And " prepended ONLY if
          // there are lyrics before it.
          lyric += (j == i && i > 1) ? "\tAnd " : "\t";
          // The last lyric will ALWAYS be "a Partridge in a Pear Tree"
          lyric += (j == i) ? getGift(1) + "%n" : "";
      }
      
      // Print out the current day's lyric, substituting in the pronoun for the
      // current day with a call to numeralToPronoun
      System.out.printf(lyric + "%n", numeralToPronoun(i));
    }
  }

  // Given an integer corresponding to the current day,
  // getGift will return a string corresponding to that day's gifts
  private static String getGift(int num) {
    // "switches are data structures, too!"
    switch(num) {
      case 1:
        return "a Partridge in a Pear Tree";

      case 2:
        return "Two Turtle Doves";

      case 3:
        return "Three French Hens";

      case 4:
        return "Four Calling Birds";

      case 5:
        return "Five Golden Rings";

      case 6:
        return "Six Geese a-Laying";

      case 7:
        return "Seven Swans a-Swimming";

      case 8:
        return "Eight Maids a-Milking";

      case 9:
        return "Nine Ladies Dancing";

      case 10:
        return "Ten Lords a-Leaping";

      case 11:
        return "Eleven Pipers Piping";

      case 12:
        return "Twelve Drummers Drumming";
        
      default: // Default case required for method return type (unused)
        return "n Defaults Defaulting";
    }
  }
  
  // Given an integer corresponding to the current day,
  // numeralToPronoun will return a string corresponding to that integer's
  // English pronoun.
  private static String numeralToPronoun(int num) {
    switch(num) {
      case 1:
        return "First";

      case 2:
        return "Second";

      case 3:
        return "Third";

      case 4:
        return "Fourth";

      case 5:
        return "Fifth";

      case 6:
        return "Sixth";

      case 7:
        return "Seventh";

      case 8:
        return "Eighth";

      case 9:
        return "Ninth";

      case 10:
        return "Tenth";

      case 11:
        return "Eleventh";

      case 12:
        return "Twelfth";
        
      default:
        return "N'th";
    }
  }
}
