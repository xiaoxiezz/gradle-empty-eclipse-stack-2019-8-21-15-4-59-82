
public class modifyCar {

	private String engine;
	private String wheels;
	
	public modifyCar() {
		
	}
	
	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getWheels() {
		return wheels;
	}


	public void setWheels(String wheels) {
		this.wheels = wheels;
	}


	public void start() {
		System.out.println(String.format("%s is on and %s are running!", this.getEngine(), this.getWheels()));
	}

}
