package oraclproduction;

import oraclproduction.Product;

/**
 * In this class, the actual code is executed in main.
 *
 * @author Paul Nicowski
 * @version 1.0
 * @date 10/1/18
 */

public class Main extends Product {

  @Override
  public void setProductionNumber(int n1) {
    super.setProductionNumber(n1);
  }

  @Override
  public void setName(String s1) {
    super.setName(s1);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public String getManufactureDate() {
    return super.getManufactureDate();
  }

  @Override
  public int getSerialNumber() {
    return super.getSerialNumber();
  }

  @Override
  public String toString(String manufacturer, int serialNumber, String manufacturedOn,
      String name) {
    return super.toString(manufacturer, serialNumber, manufacturedOn, name);
  }

  public static void main(String[] args) {




  }

}
