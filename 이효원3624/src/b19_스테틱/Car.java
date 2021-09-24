package b19_스테틱;

public class Car {
	private int serialNum; //static이 아닌데도 kia라고 하는 클래스는 하나밖에 없기떄문에 그 공간에서 그 값만 증가할거라서 !! 그거신 싱글톤이당 
	private String model;
	
	
	
	public Car(int serialNum, String model) {
		this.serialNum = serialNum;
		this.model = model;
		
	}
	
	public void carInfo() {
		System.out.println("차량 시리얼 번호 : " + serialNum );
		System.out.println("차량 모델 : " + model);
		
	}
	

}
