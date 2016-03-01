package coldwar;

public class Motor {
	
	private int freq;
	private int counter;
	private String status;
	
	public Motor(int freq, int counter, String status){
		this.freq = freq;
		this.counter = counter;
		this.status = status;
	}

	public int getFreq() {
		return freq;
	}

	public void setFreq(int freq) {
		this.freq = freq;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
