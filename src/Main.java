/**
 * Searches linearly
 * 
 * @author Asher Mangel
 * @version 1.0
 * @since 1.0
 */

import java.util.*;
class Main {
  public static void main(String[] args) {
    SpellChecker checker = new SpellChecker();

    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    while (!word.equals("q")) {
      System.out.println("Linear Search!");
      if (checker.linearSpellCheck(word))
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");
        
      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
      scan.close();
  }
}