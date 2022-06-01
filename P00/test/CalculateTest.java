import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class CalculateTest {
private int a , b , c;  
Calculate cal; 


@AfterClass
public static void tearDownAfterClass() throws Exception {
}


@Test
public void testAdd() { 
 int a = 4321; 
 int b = 1234; 
 Calculate cal = new Calculate(); 

 int actual = cal.add(a , b); 
 
 
 int expected = 5555; 
 assertEquals(expected , actual); 
 
}


@Test
public final void testSubtract() {
  int a = 9876;
  int b = 4321;
  
  Calculate cal = new Calculate();
  int actual = cal.subtract(a, b);
  
  int expected = 5555;
  assertEquals(actual , expected);
}

public final void testMultiply() {
	int a = 8;
	int b = 2;
	
	Calculate cal = new Calculate();
	int actual = cal.multiply(a, b);

	int expected = 16;
	assertEquals(actual , expected);
}
  
  
@Test
public final void testDivide() {
  int a = 20;
  int b = 2;
  
  Calculate cal = new Calculate();
  int actual = cal.divide(a, b);
  
  int expected = 10;
  assertEquals(actual, expected);
  }
}