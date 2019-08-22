
public class SportsCar extends Car {
	protected String lights;
	
	protected SportsCar(String engine, String wheels, String lights){
		super(engine,wheels);
		this.lights=lights;
	}
	public static void main(String [] args){
		System.out.println("{lights} are shining, {engine} is on and {wheels} are running!");
	}
}
