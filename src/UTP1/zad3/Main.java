/**
 *
 *  @author Politowicz Jakub S26211
 *
 */

package UTP1.zad3;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    String home = System.getProperty("user.home");
    String allWords = home + "/allwords.txt";
    Anagrams an = new Anagrams(allWords);
    for(List<String> wlist : an.getSortedByAnQty()) {
      System.out.println(wlist);
    }
    System.out.println("************************");
    Scanner scan = new Scanner(new File(home, "wordsToFind.txt"));
    while(scan.hasNext()) {
      System.out.println(an.getAnagramsFor(scan.next()));
    }
    scan.close();
  }
}
