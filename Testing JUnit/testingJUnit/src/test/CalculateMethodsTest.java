package test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class CalculateMethodsTest {
   private CalculateMethods calculateMethods;
    
   
   @BeforeEach
   public void initTest() {
	   calculateMethods = new CalculateMethods();
   }
   
   @Test
   public void testDivide1() {
	   Assertions.assertEquals(10, calculateMethods.divide(100, 10));
   }
   
   @Test
   public void testDivide2() {
	   Assertions.assertEquals(11, calculateMethods.divide(100, 10));
   }
   
   
   @Test
   public void testDivideByZero() {
	   Assertions.assertThrows(ArithmeticException.class, () -> calculateMethods.divide(100, 0));
   }
}
