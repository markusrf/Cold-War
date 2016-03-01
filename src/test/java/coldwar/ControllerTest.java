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
public class ControllerTest {

  private Controller controller1;
  private List<Sensor> sensorList1;

  @Before
  public void setUp() {
    controller1 = new Controller();
    controller1.addSensor("sensor123");
    controller1.addSensor("tempSensor");
    
    sensorList1 = new ArrayList<>(
            Arrays.asList(new Sensor("sensor123"), new Sensor("tempSensor")));
  }

  @After
  public void tearDown() {
    controller1 = null;
    sensorList1.clear();
  }

  @Test
  public void testAddSensor() throws Exception {

    Field f = controller1.getClass().getDeclaredField("sensorList");
    f.setAccessible(true);
    List<Sensor> controller1SensorList = (List<Sensor>) f.get(controller1);

    assertFalse(sensorList1.equals(controller1SensorList));
    sensorList1.add(new Sensor("tempSensor2"));
    assertFalse(sensorList1.equals(controller1SensorList));
  }

}