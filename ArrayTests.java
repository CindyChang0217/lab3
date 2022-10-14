import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testreverseinplace2(){
    int [] input={50,40,30,20,10};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[] {10,20,30,40,50}, input);
  }

  @Test
  public void testreversed2(){
    int [] input={50,40,20,10};
    assertArrayEquals(new int[] {10,20,40,50}, ArrayExamples.reversed(input));
  }
}

