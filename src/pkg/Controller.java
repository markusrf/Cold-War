package pkg;
import java.util.ArrayList;

import pkg.Sensor;
public class Controller {

	private Sensor sensor;
	private ArrayList<Sensor> sensorList = new ArrayList();
	
	public Controller(){
	
	}
	
	private void addSensor(String type){
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


