package _01_Gotta_Catchem_All;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;
import org.junit.jupiter.api.Test;

class GottaCatchemAll {

    /**
     * In this program you will attack code weaknesses so they can be caught by
     * a try/catch block. Each test will present perfectly functional code that
     * throws no exceptions. Your job is to break the code inside the try block
     * in the way that causes all JUnit tests to pass by throwing the correct
     * Exception.
     */

    /**
     * A NullPointerException occurs when code tries to use a reference type
     * variable that is uninitialized or otherwise has a value of null.
     */

    Robot rob;

    @Test
    public void testNullPointerException() {
        try {
            String cool = null;
            cool.contains("h");
        } catch (NullPointerException e) {
            nullPointerExceptionCaught = true;
        } finally {
            assertTrue(nullPointerExceptionCaught);
        }
    }

    /**
     * An ArrayIndexOutOfBoundsException occurs when code tries to access an
     * index within an array or other indexed data structure that does not
     * exist.
     */

    @Test
    public void testArrayIndexOOBException() {
        int[] intArray = { 0, 1, 2, 3 };

        try {

            for (int i = 0; i < intArray.length + 1000000; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            arrayIndexOOBExceptionCaught = true;
        } finally {
            assertTrue(arrayIndexOOBExceptionCaught);
        }
    }

    /**
     * An NumberFormatException occurs when trying to parse a String into a
     * format type that doesn't match.
     */

    @Test
    public void testNumberFormatException() {

        try {
            int answer = Integer.parseInt("this is definitely a number");

            System.out.println(
                    "The answer to life, the universe and everything is... "
                            + answer);

        } catch (NumberFormatException e) {
            numberFormatExceptionCaught = true;
        } finally {
            assertTrue(numberFormatExceptionCaught);
        }

    }

    /**
     * An ArithmeticException occurs when code tries to perform arithmetic that
     * leads to an undefined result.
     */

    @Test
    public void testArithmeticException() {

        try {

            Random rand = new Random();
            double dividend = rand.nextInt(9900) + 100;
            double divisor = 0;
            double quotient = dividend/divisor;

            System.out.println("The result of " + dividend + " divided by "
                    + divisor + " is " + quotient);

        } catch (ArithmeticException e) {

            arithmeticExceptionCaught = true;

        } finally {
            assertTrue(arithmeticExceptionCaught);
        }
    }

    boolean nullPointerExceptionCaught = false;
    boolean arrayIndexOOBExceptionCaught = false;
    boolean numberFormatExceptionCaught = false;
    boolean arithmeticExceptionCaught = false;

}
