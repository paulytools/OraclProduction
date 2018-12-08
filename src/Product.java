import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {

  int serialNumber;
  String manufacturer = Item.manufacturer;
  Date manufacturedOn;
  String name;
  static int currentProductionNumber;

  Product() {

  }

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

  @Override
  public boolean equals(Object obj) {

    if (this.getClass().getSimpleName().equals(obj.getClass().getSimpleName())) {
      return true;
    } else {
      return false;
    }
  }

  public static void printType(Object Class, ArrayList<Product> products) {

    for (int i = 0; i <= products.size() - 1; i++) {

      Object className = products.get(i);

      if (className.equals(Class)) {

        System.out.println(products.get(i));

      }
    }


  }

  // For the Comparable Interface.
  @Override
  public int compareTo(Product compareProduct) {

    int compareSerialNumber = ((Product) compareProduct).getSerialNumber();
    // Ascending order
    return (compareSerialNumber - this.serialNumber);

  }

}
