package b16_기본클래스;

public class CarTest {
	
	
	public static void main(String[] arg) {
		Car car1 = new Car(20210001, "k5");
		Car car2 = new Car(20210001, "k7");
		Car car3 = new Car(20210002, "k5");
		Car car4 = car1;
		
		
		
		System.out.println(car1 == car2);
		System.out.println(car2 == car3);		
		System.out.println(car1 == car4);
		System.out.println(car1.equals(car2));
		System.out.println(car1.equals(car3));
		System.out.println(car1.equals(car4));
	}
}


