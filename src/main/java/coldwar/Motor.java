package coldwar;

public class Motor {
	
	private Integer freq;
	private Integer counter;
	private String status;
	
	public Motor(Integer freq, Integer counter, String status){
		this.freq = freq;
		this.counter = counter;
		this.status = status;
	}

	public Integer getFreq() {
		return freq;
	}

	public void setFreq(Integer freq) {
		this.freq = freq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
