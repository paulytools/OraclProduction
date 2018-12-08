/**
 * @author Paul Nicowski
 *
 * */
public class AudioPlayer extends Product implements MultimediaControl {

  private String audioSpecification;
  private ItemType mediaType;


  /**
   * @param   name                name of the the AudioPlayer
   * @param   audioSpecification  string
   */
  public AudioPlayer(String name, String audioSpecification) {

    super(name);

    this.audioSpecification = audioSpecification;

  }

  public AudioPlayer() {

  }
/**
 *
 * @param name                Name of the AudioPlayer
 * @param audioSpecification  string
 * @param mediaType           Specifies value in enum ItemType
 *
 * */
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
  /**
   *
   * Source: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
   *
   * @param compareProduct  Instance of Product class to get
   *                         serial number from.
   *
   * @return Integer
   *
   *
   *
   * */
  @Override
  public int compareTo(Product compareProduct) {

    int compareSerialNumber = ((Product) compareProduct).getSerialNumber();
    // Ascending order
    return (compareSerialNumber - this.serialNumber);

  }


}

