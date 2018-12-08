import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Paul Nicowski
 *
 * */
@SuppressWarnings("all")
public class EmployeeInfo {

  private StringBuilder name;
  private String code;
  private String deptId;
  private Pattern p;
  private Scanner in;

  public EmployeeInfo() {

    this.in = new Scanner(System.in);
    this.p = Pattern.compile("[A-Z][a-z][a-z][a-z][0-9][0-9]");
    setName();
    setDeptId();
    this.name = getName();
    this.deptId = reverseString(getDeptId());

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    String nameString = inputName();
    name = new StringBuilder(nameString);
    createEmployeeCode(name);
  }

  private void createEmployeeCode(StringBuilder name) {
    if (checkName(name)) {

      code = name.charAt(0) + name.substring((name.indexOf(" ") + 1));

    } else { // no space

      code = "guest";

    }

  }

  private String inputName() {

    System.out.print("Please enter your first and last name: ");

    String nameString = in.nextLine();

    return nameString;
  }

  private String inputId() {

    System.out.print("Please enter the department ID: ");

    String nameString = in.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name) {
    return (name.indexOf(" ") > 0);

  }

  public String getDeptId() {

    return this.deptId;

  }

  private void setDeptId() {

    String id = inputId();

    if (validId(id)) {
      this.deptId = id;
    } else {
      this.deptId = "None01";
    }

  }

  private boolean validId(String id) {

    Matcher matcher = this.p.matcher(id);

    return (matcher.find());

  }

  int recursiveCounter = 0;
  String originalId = "";
  char[] chars = {0};
/**
 * @param id    String
 *
 *
 * */
  public String reverseString(String id) {

    if (recursiveCounter == 0) {
      originalId = id;
      chars = new char[id.length() + 1];        // needs to be +1 or it is out of bounds
    } else if (recursiveCounter == originalId.length()) {
      chars[recursiveCounter] = id.charAt(0);   // assignment to chars because it will not
      return new String(chars);                 // do a recursive call again
    } else if (recursiveCounter <= originalId.length()) {
      chars[recursiveCounter] = id.charAt(0);
    }
    recursiveCounter++;

    return reverseString(originalId.substring(originalId.length() - recursiveCounter));
  }

  @Override
  public String toString() {

    return ("Employee Code : " + this.code +
        "\nDepartment Number : " + this.deptId);

  }

}
