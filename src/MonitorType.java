public enum MonitorType {

  LCD("LCD"),
  LED("LED");

  public final String code;

  MonitorType(String code) {

    this.code = code;

  }

  private String code() {
    return code;
  }

}
