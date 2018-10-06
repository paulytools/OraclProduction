package oraclproduction;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import oraclproduction.Item;

/**
 * Abstract class that is a container for the basic functions of this project.
 *
 * @author Paul Nicowski
 * @version 1.0
 * @date 10/1/18
 */

abstract public class Product implements Item {


  int serialNumber;
  String manufacturer;

  // Source - https://stackoverflow.com/questions/5175728/how-to-get-the-current-date-time-in-java
  // Instantiates a new SimpleDateFormat object, gets current time,
  // then outputs the string.

  String manufacturedOn = new SimpleDateFormat("yyyyMMdd_HHmmss")
      .format(Calendar.getInstance().getTime());

  String name;
  int currentProductionNumber = 0;


  /**
   * Sets the production number.
   */

  public void setProductionNumber(int n1) {

    currentProductionNumber = n1;

    serialNumber = currentProductionNumber++;


  }

  public void setName(String s1) {

    name = s1;

  }

  public String getName() {

    return manufacturer;
  }

  // I don't know why you would output a date object. It seems more complicated
  // to do it this way. For now it is outputting the string which is
  // what you need to get anyways.

  public String getManufactureDate() {

    return manufacturedOn;
  }

  public int getSerialNumber() {

    return serialNumber;
  }

  public String toString(String manufacturer, int serialNumber,
      String manufacturedOn, String name) {

    String output = "Manufacturer\t: " + manufacturer + "\n"
        + "Serial Number\t: " + serialNumber + "\n"
        + "Date\t: " + manufacturedOn + "\n"
        + "Name\t: " + name;

    return output;

  }


}
