
public class Car {
 private String engine;
 private String wheels;
 
 protected Car(String engine,String wheels) {
	  this.engine = engine;
}

	 public static void main(String [] args) {
	  start();
	  speedOn();
	 }
	 public static void start(){
		 System.out.println("{engine} is on and {wheels} are running!");
	 }
	 public static void speedOn(){
		 System.out.println("{engine} is overload and {wheels} are super running!");
	 }
	 
}