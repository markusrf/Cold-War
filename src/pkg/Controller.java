package pkg;
import java.util.ArrayList;

import pkg.Sensor;
public class Controller {

	private Sensor sensor;
	private ArrayList<Sensor> sensorList = new ArrayList();
	
	public Controller(String type){
		this.sensor = new Sensor(type);
	}
	
	private void addSensor(Sensor sensor){
		
		this.sensorList.add(sensor);
	}

}
