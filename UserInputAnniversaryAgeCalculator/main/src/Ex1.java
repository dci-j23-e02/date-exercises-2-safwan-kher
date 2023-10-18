
import java.util.Calendar;
import java.util.Date;


public class Ex1 {

  public static void main(String[] args) {
    // Step1: store the a-dates in Calendar objects , and Convert them to Date objects:
    // Date maryDate = new Date(1995, 5, 20); The year was with extra 1000 : Y2K Bug, Date constructor is deprecated
    Calendar mary = Calendar.getInstance();
    mary.set(1995, Calendar.JUNE, 10);
    Date maryDate = mary.getTime();

    Calendar paul = Calendar.getInstance();
    paul.set(2000, Calendar.JANUARY, 20);
    Date paulDate = paul.getTime();

    Calendar sarah = Calendar.getInstance();
    sarah.set(1995, Calendar.JUNE, 10);
    Date sarahDate = sarah.getTime();

    // Step2 : Print the dates
    System.out.println("Mary anniversary date is: " + maryDate);
    System.out.println("Paul anniversary date is: " + paulDate);
    System.out.println("Sarah anniversary date is: " + sarahDate);

  }
}
