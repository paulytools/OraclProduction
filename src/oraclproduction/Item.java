package oraclproduction;

import java.util.Date;

public interface Item {

  String CONST_MANUFACTURER = "OracleProduction";

  void setProductionNumber(int n1);

  void setName(String s1);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

  public enum ItemType {

    Audio         ("AU"),
    Visual        ("VI"),
    AudioMobile   ("AM"),
    VisualMobile  ("VM");

    private final String code;

    ItemType(String code) {

      this.code = code;

    }

    private String code() { return code; }

  }

}
