public class Screen implements ScreenSpec {

  String resolution;
  int refreshrate;
  int responsetime;

  Screen() {

  }

  Screen(String resolution, int refreshrate,
      int responsetime) {

    this.resolution = resolution;
    this.refreshrate = refreshrate;
    this.responsetime = responsetime;

  }

  public String getResolution() {

    return this.resolution;

  }

  public int getRefreshRate() {

    return this.refreshrate;

  }

  public int getResponseTime() {

    return this.responsetime;

  }

  @Override
  public String toString() {

    return ("Resolution : " + this.resolution + "\n"
        + "Refresh rate : " + this.refreshrate + "\n"
        + "Response time : " + this.responsetime + "\n");

  }

}
