import java.util.ArrayList;
import java.util.Random;

public class TextProcessor {                                 
  
  private Random randomGenerator;
  private ArrayList<String> wordsArray;

  /**
   * Constructor that creates a TextProcessor object with the words text file
   */
  public TextProcessor(String filename) {
    wordsArray = FileReader.toStringList(filename);
    randomGenerator = new Random();
  }

  /**
   * Loops through the wordsArray ArrayList and choses random words from it based
   * @param the amount of words to generate
   * @return ArrayList with the new, randomly generated words
   */
  public ArrayList<String> addRandomWords(int wordCount) {
    ArrayList<String> newWordList = new ArrayList<String>();
    for (int index = 0; index < wordCount; index++) {
       int randomIndex = randomGenerator.nextInt(wordsArray.size());
       String word = wordsArray.get(randomIndex);
       newWordList.add(word);
    }
    return newWordList;
  }
  /* Creates a string from the chosenWords in the arrayList 
   * by looping through the list and adding spaces between the words
   * @param chosenWords ArrayList
   * @return string generated from the createSentence instance method
   */
  public String createSentence(ArrayList<String> chosenWords) {
    String result = "";
    for (int index = 0; index < chosenWords.size(); index++) {
      result += chosenWords.get(index);
      if (index < (chosenWords.size() - 1)) {
         result += " ";
      } 
    }
    return result;
  }

  /* Compares the sentence string and the string of typedWords and checks for accuracy
   * @param sentence generated
   * @param string of inputted words
   * @return amount of letters correct and that match in both strings.
   */

  public double checkAccuracy(String sentence, String typedWords) {
    if (sentence == null || typedWords == null) {
        return 0.0;
    }

    String str1 = sentence.replace("\n","");
    String str2 = typedWords.replace("\n", "");

    int lettersCorrect = 0;
    
    int minLength = Math.min(str1.length(), str2.length());

    for (int i = 0; i < minLength; i++) {
        char char1 = str1.charAt(i);
        char char2 = str2.charAt(i);
        if (char1 == char2) {
            lettersCorrect++;
        } else {
            System.out.println("Incorrect letters: " + i + ": '" + char1 + "' vs '" + char2 + "'");
        }
    }
    
    double accuracy = (double) lettersCorrect / (sentence.length()) * 100;
    return accuracy;
  }
}