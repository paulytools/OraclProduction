public class Main {

  public static void main(String args[]) {

    ProcessFiles pf = new ProcessFiles();
    try {
      pf.WriteFile("Test");
    } catch (Exception ex) {

      System.out.println("Could not write");

    }



    Screen s1 = new Screen("600x400", 40, 22);
    System.out.println(s1);

    Widget w1 = new Widget("Widget 1");
    System.out.println(w1.toString());
    Widget w2 = new Widget("Widget 2");
    System.out.println(w2.toString());

    MoviePlayerDriver.testMoviePlayer();
    PlayerDriver.testPlayer();

    for (ItemType it : ItemType.values()) {
      System.out.println(it + " " + it.code);
    }

  }

}

class Widget extends Product {

  public Widget(String name) {
    super(name);
  }

}