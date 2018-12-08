/*
import java.util.ArrayList;
import java.util.Collections;

class Main {
  public static void main(String[] args) {
    System.out.println("Test Print Type");
    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");

    MoviePlayer m1 = new MoviePlayer("Test", new Screen("1080p",
        144, 1),
        MonitorType.LED);

    ArrayList<Product> products = new ArrayList<>();
    products.add(a1);
    products.add(a2);
    products.add(m1);
    // Enter the line of code to call printType in Product
    Product.printType(a1, products);
  }
}*/

/*
public class Main {

  public static void main(String args[]) {

    System.out.println("Test Employee Department ID");
    EmployeeInfo employee = new EmployeeInfo();
    System.out.println(employee.toString());
  }

}
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String args[]) {
    Main myMain = new Main();
    System.out.println(myMain.reverseString("Abcd12"));
  }

  int recursiveCounter = 0;
  String originalId = "";
  char[] chars = {0};

  public String reverseString(String id) {

    if (recursiveCounter == 0) {
      originalId = id;
      chars = new char[id.length()+1];    // needs to be +1 or it is out of bounds
    } else if (recursiveCounter == originalId.length()) {
      chars[recursiveCounter] = id.charAt(0);   // assignment to chars because it will not
      return new String(chars);                 // do a recursive call again
    } else if (recursiveCounter < originalId.length()) {
      chars[recursiveCounter] = id.charAt(0);
    }
    recursiveCounter++;

    return reverseString(originalId.substring(originalId.length() - recursiveCounter));
  }
}



