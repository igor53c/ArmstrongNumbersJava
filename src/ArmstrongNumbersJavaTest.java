import org.junit.Test;
import static org.junit.Assert.*;

public class ArmstrongNumbersJavaTest {

    @Test
    public void testSingleDigitNumbers() {
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(0));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(1));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(2));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(3));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(4));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(5));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(6));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(7));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(8));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(9));
    }

    @Test
    public void testDoubleDigitNumbers() {
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(10));
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(11));
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(99));
    }

    @Test
    public void testKnownArmstrongNumbers() {
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(153));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(370));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(371));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(407));
        assertTrue(ArmstrongNumbersJava.isArmstrongNumber(9474));
    }

    @Test
    public void testKnownNonArmstrongNumbers() {
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(9475));
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(100));
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(123));
        assertFalse(ArmstrongNumbersJava.isArmstrongNumber(400));
    }
}
