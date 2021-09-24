package b19_스테틱;

public class KIA {

	private static KIA instance = new KIA();
	private int serialNum = 20210000;
	
	private KIA() {
		
	}
//	생성자가 private이면 다른 클래스에서 생성을 할 수가없음
//	이 클라스 얻다씀
	
	
	
	
	public static KIA getInstance () {
		if(instance == null) {
			instance = new KIA();
		}
		 return instance;
	}
	
	
	public Car createCar(String model) { //매개변수로 모델명을 받는다
		//자동차가 만들어질떄마다 시리얼넘버 숫자 증감
		return new Car(serialNum++, model);
	}
	
	
//	public static 만들면서 private CarFactory() 사용가능하게되는거!! 
//	카팩토리를 리턴해주는 static을 통해서 외부와 연결가능하도록! 외부로 공유한드다아~!~!
	
}

// 싱글톤 기본 형태