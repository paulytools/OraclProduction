import java.util.Date;

public interface Item {

  String manufacturer = "OraclProduction";

  void setProductionNumber(int n1);

  void setName(String s1);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
