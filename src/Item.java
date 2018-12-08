import java.util.Date;
/**
 * @author Paul Nicowski
 *
 * */
public interface Item {

  String manufacturer = "OracleProduction";

  void setProductionNumber(int n1);

  void setName(String s1);

  String getName();

  Date getManufactureDate();

  int getSerialNumber();

}
