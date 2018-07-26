package JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnit {

	//no main method in JUnit
	//It's for testing only
	 
	//Test multiplication method of the SimpleCalc class
	   @Test
	   public void test_multiplication() {
	      System.out.println("Multiplication Test") ;
	      SimpleCalc newMultiply = new SimpleCalc(100,3) ;
	      assertTrue(newMultiply.multiplication() == 300) ;
	   }
	   //Test addition method of the SimpleCalc class
	   @Test
	   public void test_addition() {
	      System.out.println("Testing addition...") ;
	      SimpleCalc newAddition = new SimpleCalc(100,3) ;
	      assertTrue(newAddition.addition() == 103) ;
	   }
	   //Test subtraction method of the SimpleCalc class
	   @Test
	   public void test_subtraction() {
	      System.out.println("Testing subtraction...") ;
	      SimpleCalc newSubtraction = new SimpleCalc(100,3) ;
	      assertTrue(newSubtraction.subtraction() == 97) ;
	   }
	   
}
