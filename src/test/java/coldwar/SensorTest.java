package coldwar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Vestein on 01.03.2016.
 */
public class SensorTest {

  private Sensor sensor1;
  private Sensor sensor2;
  List<String> priority1 = new ArrayList<>();

  @Before
  public void setUp() {
    sensor1 = new Sensor("temp");
    sensor2 = new Sensor("tempSensor");
    priority1.addAll(Arrays.asList("1", "2", "test", "4"));
    sensor1.setPriority(priority1);
  }

  @After
  public void tearDown() {
    sensor1 = null;
    sensor2 = null;
    priority1.clear();
  }

  @Test
  public void testGetValue() throws Exception {
    assertEquals(0, sensor1.getValue(), 0);
    sensor1.setValue(17.0);
    assertEquals(17.0, sensor1.getValue(), 0);
    sensor1.setValue(21.0);
    assertNotEquals(17.0, sensor1.getValue(), 0);
  }

  @Test
  public void testSetValue() throws Exception {
    sensor1.setValue(14.0);
    assertEquals(14.0, sensor1.getValue(), 0);
    sensor1.setValue(100.123);
    assertNotEquals(14.0, sensor1.getValue(), 0);
  }

  @Test
  public void testSetPriority() throws Exception {
    Field f = sensor1.getClass().getDeclaredField("priority");
    f.setAccessible(true);
    List<String> sensor1Prio = (List<String>) f.get(sensor1);

    assertTrue(priority1.equals(sensor1Prio));
    priority1.clear();
    assertFalse(priority1.equals(sensor1Prio));
    priority1.addAll(Arrays.asList("1", "4", "test", "lol"));
    assertFalse(priority1.equals(sensor1Prio));

    List<String> sensor2Prio = (List<String>) f.get(sensor2);
    assertFalse(priority1.equals(sensor2Prio));
  }

  @Test
  public void testAdjustFreq() throws Exception {
    assertEquals(0, sensor1.adjustFreq());
    assertNotEquals(1, sensor1.adjustFreq());

    assertEquals(1, sensor2.adjustFreq());
    assertNotEquals(0, sensor2.adjustFreq());
  }

  @Test
  public void testToString() throws Exception {
    String expected = "Sensor value: temp";
    assertEquals(expected, sensor1.toString());

    Field f = sensor2.getClass().getDeclaredField("type");
    f.setAccessible(true);
    String actualToString = "Sensor value: " + (String) f.get(sensor2);
    assertNotEquals(expected, actualToString);
    assertEquals("Sensor value: tempSensor", actualToString);
  }

}