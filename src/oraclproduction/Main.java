package oraclproduction;

import java.util.Date;

public class Main extends Product {

  Main(String name) {
    super(name);
  }

  @Override
  public void setProductionNumber(int currentProductionNumber) {
    super.setProductionNumber(currentProductionNumber);
  }

  @Override
  public void setName(String name) {
    super.setName(name);
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public Date getManufactureDate() {
    return super.getManufactureDate();
  }

  @Override
  public int getSerialNumber() {
    return super.getSerialNumber();
  }

  @Override
  public String toString(String manufacturer, int serialNumber, Date manufacturedOn, String name) {
    return super.toString(manufacturer, serialNumber, manufacturedOn, name);
  }

  public static void main(String[] args) {

    String name = "TestProduct";

    Product product = new Product(name);
    Product product2 = new Product(name);

    product.setProductionNumber(0);

    System.out.println(product.toString(product.manufacturer, product.getSerialNumber(),
        product.getManufactureDate(), product.getName()));

    System.out.println();

    System.out.println(product2.toString(product2.manufacturer, product2.getSerialNumber(),
        product2.getManufactureDate(), product2.getName()));
  }

}
