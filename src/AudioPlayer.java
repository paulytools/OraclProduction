import java.sql.SQLOutput;

public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  AudioPlayer(String name, String audioSpecification) {

    super(name);

    this.audioSpecification = audioSpecification;


  }

  public void play() {

    System.out.println("Play");

  }

  public void stop() {

    System.out.println("Stopped");

  }

  public void previous() {

    System.out.println("Previous");
  }

  public void next() {

    System.out.println("Next");
  }




}

