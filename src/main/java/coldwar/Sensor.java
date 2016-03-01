package coldwar;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

  private double value;
  private String type;
  private List<String> priority;

  public Sensor(String type){
    this.type = type;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public void setPriority(List<String> priority) {
    this.priority = new ArrayList<>(priority);
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
