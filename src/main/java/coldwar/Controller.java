package coldwar;

import java.util.ArrayList;
import java.util.List;

public class Controller {

  private Sensor sensor;
	private List<Sensor> sensorList = new ArrayList();
	
	public Controller(){
	
	}
	
	public void addSensor(String type){
		this.sensor = new Sensor(type);
		this.sensorList.add(this.sensor);
	}
	
  public static void main(String[] args) {
    Controller program = new Controller();
    program.addSensor("tempratur");
    program.addSensor("moisture");
    program.addSensor("sensor3");
    for (Sensor sens : program.sensorList) {
      System.out.println(sens.toString());
    }
  }
}


