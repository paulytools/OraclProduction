public class MoviePlayer extends Product implements MultimediaControl {

String screen;
String monitor;

  public void play() {

    System.out.println("Play");
  }

  public void stop() {

    System.out.println();
  }

  public void previous() {



  }

  public void next() {



  }


  public String toString() {

return super.toString() +
    "Monitor : " + monitor + "\n"
    + "Screen : " + screen + "\n";


  }

}
