public class TestCar {
	public static void main(String[] args) {
		Car car = new Car("普通引擎", "普通轮子");
		car.start();
		
		SportsCar sportsCar = new SportsCar("超跑引擎", "超跑轮子", "超跑灯");
		sportsCar.start();
		sportsCar.speedOn();
		
		Truck truck = new Truck("卡车引擎", "卡车轮子");
		truck.start();	
		
	}
}