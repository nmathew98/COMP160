public class LeapYearApp {
  public static void main(String[] args) {
    // initialize a new integer array with position 0 being the counter for our loop
    int[] year = new int[] { 2014, 2016, 1900, 2000, 1565, 1582, 1600 };
    // loop through and test our years
    for (int i = 0; i <= (year.length - 1); ++i)
      leapYear(year[i]);
  }

  // Determine whether a year is a leap year
  public static void leapYear(int year) {
    // [0] Determines if year predates the Gregorian calendar
    // [1] Evaluates the boolean expression to determine if its a leap year
    // if the year is divisble by 4 AND not divisible by 100 then TRUE OR
    // year is divisible by 4 AND divisible by 100 AND divisible by 400 then TRUE
    // else FALSE
    boolean leap = year % 4 == 0 && year % 100 != 0 || year % 4 == 0 && year % 100 == 0 && year % 400 == 0 ? true : false;
    if (year >= 1582 ? true : false)
      if (leap)
        System.out.println(year + ": is a leap year");
      else
        System.out.println(year + ": is not a leap year");
    else 
      System.out.println(year + ": predates the Gregorian calendar");
  }
}