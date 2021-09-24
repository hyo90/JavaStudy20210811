package b19_스테틱;

public class SingleTon {
	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance();  
		KIA factory2 = KIA.getInstance();  
		KIA factory3 = KIA.getInstance();  
		KIA factory4 = KIA.getInstance(); 
		KIA factory5 = KIA.getInstance();  
		KIA factory6 = KIA.getInstance();  
		
		Car k3 = factory1.createCar("k3");
		Car k5 = factory2.createCar("k5");
		Car k7 = factory3.createCar("k7");
		Car k8 = factory4.createCar("k8");
		Car ev6 = factory5.createCar("ev6");
		
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k8.carInfo();
		ev6.carInfo();
		
		
		
//		여러개의 공장은 있지만 하나의 회사당
		
		
	}
	

}


// singleton
// 하나의 클래스?를 만들때
// ex)현대자동차에만 통해서 각각의 자동차들이 이름이 찍혀야함
// 회사안에서는 공장 여러개가 있을꺼임
// 자동차 일련번호를 생각해봅시다 / 일련번호 겹치면 안된다 만들때
// 일련번호는 해사에서 관리염
// 데이터베이스랑 연결해서도 쓸꺼임