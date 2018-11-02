import java.util.Scanner;

public class EmployeeInfo {

  private StringBuilder name;
  private String code;

  public EmployeeInfo() {

  setName();

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

      code = name.charAt(0) + name.subString((name.indexOf(" ") + 1));

    } else { // no space

      code = "guest";

    }

  }

  private String inputName() {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Please enter your first and last name: ");

    String nameString = scanner.nextLine();

    return nameString;
  }

  private boolean checkName(StringBuilder name) {}
    return (name.indexOf(" ") > 0) {
  }



}
