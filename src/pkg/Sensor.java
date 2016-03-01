package pkg;

import java.util.ArrayList;

public class Sensor {

private double value;
private String type;
private ArrayList<String> priority;
	
public Sensor(String type){
	this.type = type;
}

public double getValue() {
	return value;
}

public void setValue(double value) {
	this.value = value;
}

public void setPriority(ArrayList<String> priority) {
	this.priority = priority;
}

public Integer adjustFreq(){
	Integer freq = 0;
	if(this.type.equals("tempSensor")){
		if (this.value <= 0){
			freq = 1;// noen beregning
		}else{
			freq = 1;// noen andre beregning
		}
	}
	return freq;
}

public String toString(){
	return String.format("Sensor value: %s", this.type) ;
}
}
