package oraclproduction;

/**
 * Main interface that defines how other classes behave which define these methods.
 *
 * @author Paul Nicowski
 * @version 1.0
 * @date 10/1/18
 */

public interface Item {

  String CONST_MANUFACTURER = "OracleProduction";

  // core functions for classes to implement

  void setProductionNumber(int n1);

  void setName(String s1);

  String getName();

  String getManufactureDate();

  int getSerialNumber();

  enum ItemType {AU, VI, AM, VM}


}
