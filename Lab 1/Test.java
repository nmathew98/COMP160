/**
 * PP1.1
 */

// a. When changing Test to test: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:6: class test is public, should be declared in a file named test.java

// b. No errors are produced because the input is still a valid string

// c. Error message:
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 9]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:9: ')' expected
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 9]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:9: not a statement
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 9]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:9: unclosed string literal

// d: String is not terminated. Error message: 
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 16]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:16: unclosed string literal
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 16]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:16: ';' expected
// File: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 18]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:18: reached end of file while parsing

// e: Changing main to man does not produce a compile time error as man is a valid method. However, a runtime error does occur as there is no main method to run

// f: There is no method bogus in System.out. Error message: 
// /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java  [line: 17]
// Error: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:17: cannot find symbol
// symbol  : method bogus(java.lang.String)
// location: class java.io.PrintStream

// g: Error message: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:17: ';' expected

// h: Error message: /home/cshome/n/nmathew/Desktop/coursefiles160/Lab01/Test.java:33: reached end of file while parsing

public class Test {
    public static void main(String[] args) {
    System.out.println("An emergency Broadcast");
                     
      }
}