public class TestCar {
	public static void main(String[] args) {
		Car car = new Car("��ͨ����", "��ͨ����");
		car.start();
		
		SportsCar sportsCar = new SportsCar("��������", "��������", "���ܵ�");
		sportsCar.start();
		sportsCar.speedOn();
		
		Truck truck = new Truck("��������", "��������");
		truck.start();	
		
	}
}