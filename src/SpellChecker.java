import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class SpellChecker
   {
      private ArrayList<String> dictionary;

      public SpellChecker() {
        String[] tmp = null;
        try
        {
            tmp = readLines("./src/dictionary.txt");
        }
        catch(IOException e)
        {
            System.out.println("Unable to access "+e.getMessage());              
        }
        dictionary = new ArrayList<String>(Arrays.asList(tmp));
      }
  
      /** linear search 
      *  TODO: Refactor this method. Makes changes only in this methid.
      *  1. add a count variable to counts the number of times the word entered by the user is compared to a word in the dictionary
      *  2. add one to the count variable every time the user entered word is compared to a dictionary word.
      *  3. Print out the number of comparisons made until thw word is found (or not found if the word is not in the dictionary)
      */
      public boolean linearSpellCheck(String word)
      {
          int count = 0;
          for(int i=0; i < dictionary.size(); i++) 
          {
            if (word.equals(dictionary.get(i))) {
                return true;
            }
          }
         return false;

      }

    public static String[] readLines(String filename) throws IOException 
    {
        FileReader fileReader = new FileReader(filename);
         
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new ArrayList<String>();
        String line = null;
         
        while ((line = bufferedReader.readLine()) != null) 
        {
            lines.add(line);
        }
         
        bufferedReader.close();
         
        return lines.toArray(new String[lines.size()]);
    }   
    
   }