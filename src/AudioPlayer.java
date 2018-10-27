public class AudioPlayer extends Product implements MultimediaControl {

  String audioSpecification;
  ItemType mediaType;

  AudioPlayer(String name, String audioSpecification) {

    super(name);

    this.audioSpecification = audioSpecification;


  }


}
