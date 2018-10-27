import java.util.Date;

public abstract class Product implements Item {

  int serialNumber;
  String manufacturer = Item.manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber;

  Product(String name) {

  this.name = name;

  this.serialNumber = ++this.currentProductionNumber;

  this.manufacturedOn = new Date();

  }

  public void setProductionNumber(int currentProductionNumber) {

    this.currentProductionNumber = currentProductionNumber;

  }

  public void setName(String name) {

    this.name = name;

  }

  public String getName() {

    return name;

  }

  public Date getManufactureDate() {

    return manufacturedOn;

  }

  public int getSerialNumber() {

    return serialNumber;

  }

  public String toString() {

    return "Manufacturer : " + manufacturer + "\n"
        + "Serial Number : " + serialNumber + "\n"
        + "Date : " + manufacturedOn + "\n"
        + "Name : " + name;

  }

}
