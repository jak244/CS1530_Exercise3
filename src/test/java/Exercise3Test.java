package ex3;
import org.junit.Test;
import static org.junit.Assert.*;

import ex3.Exercise3;

public class Exercise3Test {

  @Test
  public void test1() {
    assertEquals(Exercise3.triNum(0), 0);
  }

  @Test
  public void test2() {
    assertEquals(Exercise3.triNum(5), 15);
  }

  @Test
  public void test3() {
    assertEquals(Exercise3.triNum(15), 120);
  }

  @Test
  public void test4() {
    assertEquals(Exercise3.lcNum(0), 1);
  }

  @Test
  public void test5() {
    assertEquals(Exercise3.lcNum(5), 16);
  }

  @Test
  public void test6() {
    assertEquals(Exercise3.lcNum(15), 121);
  }
}
