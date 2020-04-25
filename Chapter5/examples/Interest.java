package Chapter5.examples;
// Fig. 5.6: Interest.java
// Compound-interest calculations with for.
// Java How to Program, 10th Ed. (Deitel) Page 159

import java.util.Scanner;

public class Interest 
{
   public static void main( String[] args )
   {
      Scanner input = new Scanner(System.in);

      double amount;
      double principal; // initial amount before interest
      double rate = 0;

      System.out.println("Enter the princical value");
      principal = input.nextDouble();


      System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );

      for ( int year = 1; year <= 10; year++ )
      {
         amount = principal * Math.pow( 1.0 + rate, year );

         System.out.printf( "%4d%,20.2f\n", year, amount );
      }
   }
}

/* Code execution

Year   Amount on deposit
   1            1,050.00
   2            1,102.50
   3            1,157.63
   4            1,215.51
   5            1,276.28
   6            1,340.10
   7            1,407.10
   8            1,477.46
   9            1,551.33
  10            1,628.89

*/
