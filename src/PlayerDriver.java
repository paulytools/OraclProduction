public class PlayerDriver extends AudioPlayer {

  PlayerDriver(String name, String audioSpecification) {
    super(name, audioSpecification);
  }

  public static void testPlayer() {

    String name = "Pyle PDV156BK";
    Screen screen = new Screen();
    MonitorType monitor = MonitorType.LED;

    AudioPlayer ap = new AudioPlayer();
    MultimediaControl mc = new MultimediaControl() {
      @Override
      public void play() {
        ap.play();
      }

      @Override
      public void stop() {
        ap.stop();

      }

      @Override
      public void previous() {
        ap.previous();

      }

      @Override
      public void next() {
        ap.next();

      }
    };

    MoviePlayerDriver mpd = new MoviePlayerDriver(name, screen, monitor);

    ap.next();
    ap.play();
    ap.previous();
    ap.stop();

    mpd.next();
    mpd.play();
    mpd.previous();
    mpd.stop();


  }
}
