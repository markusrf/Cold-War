package coldwar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vestein on 01.03.2016.
 */
public class MotorTest {

  private Motor motor1;
  private Motor motor2;

  @Before
  public void setUp() {
    motor1 = new Motor(10, 15, "on");
    motor2 = new Motor(11, 16, "off");
  }

  @After
  public void tearDown() {
    motor1 = null;
    motor2 = null;
  }

  @Test
  public void testGetFreq() throws Exception {
    assertEquals(10, motor1.getFreq());
    assertEquals(11, motor2.getFreq());
  }

  @Test
  public void testSetFreq() throws Exception {
    motor1.setFreq(1);
    assertEquals(1, motor1.getFreq());
    motor2.setFreq(2);
    assertEquals(2, motor2.getFreq());
    motor2.setFreq(-1);
    assertEquals(-1, motor2.getFreq());
  }

  @Test
  public void testGetStatus() throws Exception {
    assertEquals("on", motor1.getStatus());
    assertEquals("off", motor2.getStatus());
  }

  @Test
  public void testSetStatus() throws Exception {
    motor1.setStatus("off");
    assertNotEquals("on", motor1.getStatus());
    assertEquals("off", motor1.getStatus());

    motor2.setStatus("on");
    assertNotEquals("off", motor2.getStatus());
    assertEquals("on", motor2.getStatus());
  }

}