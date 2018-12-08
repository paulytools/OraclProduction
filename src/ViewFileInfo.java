import java.io.FileReader;
/**
 * @author Paul Nicowski
 *
 * Source: Done in class with Prof. Vanselow.
 * */
public class ViewFileInfo {

  public static void main(String[] args) {
    try {
      // pass the path to the file as a parameter
      FileReader fr =
          new FileReader("C:/LineTests/TestResults.txt");

      int i;
      while ((i = fr.read()) != -1) {

        System.out.println((char) i);

      }

    } catch (Exception ex) {

      System.out.printf("Unable to read file");

    }


  }

}
