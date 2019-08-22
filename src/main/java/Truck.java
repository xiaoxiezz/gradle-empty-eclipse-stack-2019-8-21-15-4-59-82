
public class Truck extends Car{

	public Truck() {
		// TODO Auto-generated constructor stub
	}
	protected Truck(String engine, String wheels){
		super(engine,wheels);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		payload();

	}
	public static void payload(){
		System.out.println("tips, {engine} is on and {wheels} are running!");
	}

}
