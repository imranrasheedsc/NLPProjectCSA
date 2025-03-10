import java.util.ArrayList;
import java.util.Scanner;

public class MyNLP {
  /*
   * Instaniates randomWords instance variable
   */
  private ArrayList<String> randomWords; 
  
  public MyNLP() {
    randomWords = new ArrayList<String>();
  }

  TextProcessor processor = new TextProcessor("words.txt");

  /**
   * Method that handles user input prompts
   */
  
  public void prompt() {
    Scanner input = new Scanner(System.in);

    String choice = "";
    
    while (!choice.equals("exit")) {
      System.out.println("How many words would you like to type?");
      int wordCount = input.nextInt();
  
      randomWords = processor.addRandomWords(wordCount);
  
      String generatedSentence = processor.createSentence(randomWords);
      System.out.println(generatedSentence);
      
      long startTime = System.currentTimeMillis();
      
      input.useDelimiter("\n");
      
      String wordsTyped = input.next();
      int numWords = wordsTyped.split("\\s+").length;
      
      double accuracy = processor.checkAccuracy(generatedSentence, wordsTyped);
      
      long endTime = System.currentTimeMillis();
      
      double timeElapsedSeconds = (endTime - startTime) / 1000.0;
      double timeTakenInMinutes = timeElapsedSeconds / 60.0;
        
      double WPM = numWords/timeTakenInMinutes;
      
      System.out.println("WPM: " + WPM);
      System.out.println("Accuracy: " + accuracy + "%"); 

      System.out.println("Continue or exit?");
      choice = input.next();
    }
    
    input.close();
  }
}