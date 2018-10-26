package oraclproduction;

import java.util.Date;

public class Product implements Item {

  int serialNumber;
  String manufacturer = Item.manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber = 0;

  Product(String name) {

  this.name = name;

  this.serialNumber = this.currentProductionNumber++;

  this.manufacturedOn = new Date();

  }

  public void setProductionNumber(int currentProductionNumber) {

    this.currentProductionNumber = currentProductionNumber;

  }

  public void setName(String name) {

    this.name = name;

  }

  public String getName() {

    return manufacturer;

  }

  public Date getManufactureDate() {

    return manufacturedOn;

  }

  public int getSerialNumber() {

    return serialNumber;

  }

  public String toString(String manufacturer, int serialNumber,
      Date manufacturedOn, String name) {

    return "Manufacturer\t: " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date\t\t\t\t\t: " + manufacturedOn + "\n"
        + "Name\t\t\t\t\t: " + name;

  }

}
