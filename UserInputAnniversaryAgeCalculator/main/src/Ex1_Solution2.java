import java.text.SimpleDateFormat;
import java.time.LocalDate;


import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex1_Solution2 {

  public static void main(String[] args)  {
    String pattern1 = "dd/MM/yyyy"; // could be read from the CLI
    String pattern2 = "d/MM/yy"; // could be read from the CLI
    String pattern3 = "MMM dd"; // could be read from the CLI

    // SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); // We can still pass in the "yyyy-MM-dd" here

    // Using simpleDateFormat to format a given date

    // Date currentDate = new Date();
 //   String date = simpleDateFormat.format(currentDate);
  //  String date =  SimpleDateFormat.getInstance().format(currentDate); here we didn't give any pattern , so it would use the default one
    // System.out.println(date);

// Using DateTimeFormatter to format a LocalDate object

    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern(pattern1);
    DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern(pattern2);
    DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern(pattern3);



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

    LocalDate birthdate = LocalDate.of(year, month, day); // default format
    String formatedBirthdate1 = birthdate.format(formatter1); // custom format
    String formatedBirthdate2 = birthdate.format(formatter2);// custom format
    String formatedBirthdate3 = birthdate.format(formatter3);// custom format


   /* System.out.println(year);
    System.out.println(day);
    System.out.println(month);*/

    System.out.println(birthdate);
    System.out.println(formatedBirthdate1);
    System.out.println(formatedBirthdate2);
    System.out.println(formatedBirthdate3);


  }
}
