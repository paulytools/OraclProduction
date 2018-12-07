

public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;


  /**
   * AudioPlayer
   * @param name, audioSpecification
   *
   * */
  public AudioPlayer(String name, String audioSpecification) {

    super(name);

    this.audioSpecification = audioSpecification;

  }

  public AudioPlayer() {

  }

  public AudioPlayer(String name, String audioSpecification, ItemType mediaType) {
    super(name);
    this.audioSpecification = audioSpecification;
    this.mediaType = mediaType;
  }

  public void play() {

    System.out.println("Playing");

  }

  public void stop() {

    System.out.println("Stopping");

  }

  public void previous() {

    System.out.println("Previous");
  }

  public void next() {

    System.out.println("Next");
  }


  public String toString() {

    return (super.toString() + "\n" +
        "Audio Spec : " + audioSpecification +
        "\nType : " + mediaType.AUDIO
        );


  }

  // For the Comparable Interface.
  @Override
  public int compareTo(Product compareProduct) {

    int compareSerialNumber = ((Product)compareProduct).getSerialNumber();
    // Ascending order
    return (compareSerialNumber - this.serialNumber);

  }


}

