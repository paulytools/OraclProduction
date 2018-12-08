import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
/**
 * @author Paul Nicowski
 *
 * */
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
/**
 * Override method equals for comparator to work properly.
 * @param obj   Class as an object to use with the equals method.
 *
 * */
  @Override
  public boolean equals(Object obj) {

    /**
     * Source: Java Programming Masterclass for Software Developers
     *           Udemy, by Tim Buchalka, Lecture 73.
     * */
    return this.getClass().getSimpleName().equals(obj.getClass().getSimpleName());

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
  /**
   *
   * Source: https://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
   *
   * @param compareProduct  Instance of Product class to get
   *                         serial number from.
   *
   * @return Integer
   *
   *
   *
   * */

  @Override
  public int compareTo(Product compareProduct) {

    int compareSerialNumber = ((Product) compareProduct).getSerialNumber();
    // Ascending order
    return (compareSerialNumber - this.serialNumber);

  }

}
