import java.util.Scanner;
import java.util.HashMap;

public class Strings {
    private static class StringTools {
      private static String[] normalizeString(String in, String regex, String delim){
        return in.replaceAll(regex, "").toLowerCase().split(delim);
      }
      
      // Violating DRY (for fun and deadlines)
      private static HashMap<String,Integer> getLetterFrequency(String in){
        String[] letters = normalizeString(in, "[^A-Za-z]", "");
        HashMap<String,Integer> letterFreqMap = new HashMap<String,Integer>();
        
        for(int i = 0; i < letters.length; i++){
          if(letterFreqMap.get(letters[i]) == null)
            letterFreqMap.put(letters[i], 0);
            
          if(letterFreqMap.get(letters[i]) != null)
            letterFreqMap.put(letters[i], letterFreqMap.get(letters[i]) + 1);
        }
        
        return letterFreqMap;
        
      }
    
      private static HashMap<Integer,Integer> getWordLengthBreakdown(String in){
        String[] sentence = normalizeString(in, "[^A-Za-z ]", " ");
        int[] lengths = new int[ sentence.length ];
        
        for(int i = 0; i < sentence.length; i++)
          lengths[i] = sentence[i].length();

        HashMap<Integer,Integer> wordLenMap = new HashMap<Integer,Integer>();
        
        for(int i = 0; i < lengths.length; i++){
          if(wordLenMap.get(lengths[i]) == null)
            wordLenMap.put(lengths[i], 0);
            
          if(wordLenMap.get(lengths[i]) != null)
            wordLenMap.put(lengths[i], wordLenMap.get(lengths[i]) + 1);
        }
        
        return wordLenMap;
        
      }

      private static HashMap<String,Integer> getWordFrequencyBreakdown(String in){
        String[] sentence = normalizeString(in, "[^A-Za-z ]", " ");

        HashMap<String,Integer> wordOccMap = new HashMap<String,Integer>();
        
        for(int i = 0; i < sentence.length; i++){
          if(wordOccMap.get(sentence[i]) == null)
            wordOccMap.put(sentence[i], 0);
            
          if(wordOccMap.get(sentence[i]) != null)
            wordOccMap.put(sentence[i], wordOccMap.get(sentence[i]) + 1);
        }
        
        return wordOccMap;
        
      }

    }
  
    public static void main(String[] args) {
      
      System.out.printf("Welcome to Strings!%nPlease enter a text string below:%n");
      
      Scanner scanner = new Scanner(System.in);
      String userString = scanner.nextLine();

      System.out.printf("%nLetter Frequency Breakdown:%n");
      System.out.format("%n\t%10s%20s%n", "[Letter]", "[# Of Occurrences]");
      
      HashMap<String,Integer> letterFreqMap = StringTools.getLetterFrequency(userString);
      
      for (HashMap.Entry<String, Integer> e : letterFreqMap.entrySet()) {
        String letter = e.getKey();
        int occurrences = e.getValue();
        System.out.format("\t%10s%10d%n", letter, occurrences);
      }
      
      System.out.printf("%nWord Length Breakdown:%n");
      System.out.format("%n\t%10s%20s%n", "[Word Length]", "[# Of Occurrences]");
      
      HashMap<Integer,Integer> wordLenMap = StringTools.getWordLengthBreakdown(userString);

      for (HashMap.Entry<Integer, Integer> e : wordLenMap.entrySet()) {
        int wordLength = e.getKey();
        int occurrences = e.getValue();
        System.out.format("\t%10d%12d%n", wordLength, occurrences);
      }

      System.out.printf("%nWord Frequency Breakdown:%n");
      System.out.format("%n\t%10s%20s%n", "[Word]", "[# Of Occurrences]");
      
      HashMap<String,Integer> wordFreqMap = StringTools.getWordFrequencyBreakdown(userString);
            
      for (HashMap.Entry<String, Integer> e : wordFreqMap.entrySet()) {
        String word = e.getKey();
        int occurrences = e.getValue();
        System.out.format("\t%10s%10d%n", word, occurrences);
      }

      
    }

}
