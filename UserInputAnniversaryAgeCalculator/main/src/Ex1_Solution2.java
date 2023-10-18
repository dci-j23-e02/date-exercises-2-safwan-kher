import java.text.SimpleDateFormat;
import java.time.LocalDate;


import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1_Solution2 {

  public static void main(String[] args)  {
      String pattern = "yyyy.MM.dd"; // could be read from the CLI
     // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); // We can still pass in the "yyyy-MM-dd" here

    // Using simpleDateFormat to format a given date

    // Date currentDate = new Date();
 //   String date = simpleDateFormat.format(currentDate);
  //  String date =  SimpleDateFormat.getInstance().format(currentDate); here we didn't give any pattern , so it would use the default one
    // System.out.println(date);

// Using DateTimeFormatter to format a LocalDate object

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);


    Scanner scanner = new Scanner(System.in);
    System.out.println("Please insert here your birthdate: ");
    System.out.println("Please insert here the year as a number of 4 digits: ");
    String yearString = scanner.nextLine();
    System.out.println("Please insert here the Month name: ");
    String monthString = scanner.nextLine().toUpperCase();
    System.out.println("Please insert here the day of  the month as a number of 2 digits: ");
    String dayString = scanner.nextLine();

    // Build a LocalDate object , of the above strings :
    int year = Integer.parseInt(yearString); // converting the string to int to be used in LocalDate.of method
    int day = Integer.parseInt(dayString);
    Month month = Month.valueOf(monthString);

    LocalDate birthdate = LocalDate.of(year, month, day);
    String formatedBirthdate = birthdate.format(formatter);

    System.out.println(year);
    System.out.println(day);
    System.out.println(month);

    System.out.println(birthdate);
    System.out.println(formatedBirthdate);

  }
}
