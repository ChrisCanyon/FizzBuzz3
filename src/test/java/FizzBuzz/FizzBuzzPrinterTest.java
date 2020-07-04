package FizzBuzz;
import FizzBuzz.FizzBuzzPrinter;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzPrinterTest
{
    FizzBuzzPrinter FBP = new FizzBuzzPrinter();

    @Test
    public void isFizzShouldReturnTrueForMultiplesOfThree()
    {
        for(int i = -100; i < 100; i++){
            assertTrue(FBP.isFizz(i * 3));
        }
    }

    @Test
    public void isFizzShouldReturnFalseForNonMultiplesOfThree()
    {
        for(int i = -100; i < 100; i++){
            assertFalse(FBP.isFizz((i * 3) + 1));
            assertFalse(FBP.isFizz((i * 3) + 2));
        }
    }

    @Test
    public void isBuzzShouldReturnTrueForMultiplesOfFive()
    {
        for(int i = -100; i < 100; i++){
            assertTrue(FBP.isBuzz(i * 5));
        }
    }

    @Test
    public void isBuzzShouldReturnFalseForNonMultiplesOfFive()
    {
        for(int i = -100; i < 100; i++){
            for(int j = 1; j < 5; j++){
                assertFalse(FBP.isBuzz((i * 5) + j));
            }
        }
    }

    @Test
    public void isFizzBuzzShouldReturnTrueForMultiplesOfFifteen()
    {
        for(int i = -100; i < 100; i++){
            assertTrue(FBP.isFizzBuzz(i * 15));
        }
    }

    @Test
    public void isFizzBuzzShouldReturnFalseForNonMultiplesOfFifteen()
    {
        for(int i = -100; i < 100; i++){
            for(int j = 1; j < 15; j++){
                assertFalse(FBP.isFizzBuzz((i * 15) + j));
            }
        }
    }

    @Test
    public void getFizzBuzzOutputShouldReturnLucky() {
        assertEquals("lucky", FBP.getFizzBuzzResult(3));
        assertEquals("lucky", FBP.getFizzBuzzResult(769234));
        assertEquals("lucky", FBP.getFizzBuzzResult(827123));
    }

    @Test
    public void getFizzBuzzOutputShouldReturnFizzBuzz() {
        assertEquals("fizzbuzz", FBP.getFizzBuzzResult(15));
        assertEquals("fizzbuzz", FBP.getFizzBuzzResult(45));
        assertEquals("fizzbuzz", FBP.getFizzBuzzResult(60));
    }

    @Test
    public void getFizzBuzzOutputShouldReturnFizz() {
        assertEquals("fizz", FBP.getFizzBuzzResult(6));
        assertEquals("fizz", FBP.getFizzBuzzResult(9));
        assertEquals("fizz", FBP.getFizzBuzzResult(12));
    }

    @Test
    public void getFizzBuzzOutputShouldReturnBuzz() {
        assertEquals("buzz", FBP.getFizzBuzzResult(5));
        assertEquals("buzz", FBP.getFizzBuzzResult(10));
        assertEquals("buzz", FBP.getFizzBuzzResult(20));
    }

    @Test
    public void getFizzBuzzOutputShouldReturnX() {
        assertEquals("7919", FBP.getFizzBuzzResult(7919));
        assertEquals("7907", FBP.getFizzBuzzResult(7907));
        assertEquals("7901", FBP.getFizzBuzzResult(7901));
    }
}
