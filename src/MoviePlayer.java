public class MoviePlayer extends Product implements MultimediaControl {

  private MonitorType monitor;
  private Screen scr;

  public MoviePlayer(String name, Screen screen, MonitorType monitorType) {

    super(name);
    this.monitor = monitorType;
    this.scr = screen;

  }

  public void play() {

    System.out.println("Playing movie");
  }

  public void stop() {

    System.out.println("Stopping movie");
  }

  public void previous() {

    System.out.println("Previous movie");

  }

  public void next() {

    System.out.println("Next movie");


  }


  public String toString() {

    return (super.toString() +
         "\n"
        + "Screen : " + this.scr.toString() + "\n"
    + "Monitor Type : " + this.monitor);


  }

  // For the Comparable Interface.
  @Override
  public int compareTo(Product compareProduct) {

    int compareSerialNumber = ((Product)compareProduct).getSerialNumber();
    // Ascending order
    return (this.serialNumber - compareSerialNumber);

  }


}
