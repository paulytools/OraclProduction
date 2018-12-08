/**
 * @author Paul Nicowski
 *
 * */
public class MoviePlayerDriver extends MoviePlayer {

  MoviePlayerDriver(String name, Screen s, MonitorType mt) {
    super(name, s, mt);
  }

  public static void testMoviePlayer() {

    String name1 = "DBPOWER MK101";
    Screen screen1 = new Screen("720x480", 40, 22);
    MonitorType monitor1 = MonitorType.LCD;

    String name2 = "Pyle PDV156BK";
    Screen screen2 = new Screen("1366x768", 40, 22);
    MonitorType monitor2 = MonitorType.LED;

    // PlayerDriver pd = new PlayerDriver(name2, screen2);

    AudioPlayer ap = new AudioPlayer();

    MoviePlayer mp1 = new MoviePlayer(name1, screen1, monitor1);
    MoviePlayer mp2 = new MoviePlayer(name2, screen2, monitor2);

    MultimediaControl mc = new MultimediaControl() {
      @Override
      public void play() {
        mp1.play();
      }

      @Override
      public void stop() {
        mp1.stop();
      }

      @Override
      public void previous() {
        mp1.previous();
      }

      @Override
      public void next() {
        mp1.next();
      }
    };

    System.out.println(mp1.toString() + "\n" + "Monitor Type : " + MonitorType.LCD);

    System.out.println(mp2.toString() + "\n" + "Monitor Type : " + MonitorType.LED);

  }

}
