package b10_클래스;

/*
 * 
 * 자료형의 종류
 * 1. 일반자료형(int, double, char, boolean)
 * 2. 참조자료형(클래스, 배열) -> String, Phone, Student, Car, 배열[] 
 * 
 */

// class 적어서 하거나 파일 만들거나 같은 방법이란다
class Phone {
	private String company; 
	private String model;
	private String color;
	private String newAgency;
	private int d_ram;
	private String phoneCase;

	public Phone() {
		System.out.println("새로운 phone을 생성하였습니다.");
	}
	
	public Phone(String company) {
		System.out.println("두번째 생성자로 만든 Phone");
		this.company = company;
	} // System.out.println(new Phone("Apple"));으로 입력하면 두번쨰어쩌구 뜸
// 오버로딩 오버로드
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
//	new phone의 결과값이 나와야 출력이 나오는데 얘가 결과값이 나오려면 
//	생성을 해야함.. new phone이라는 생성자	
//	생성자가 호출됨
}
public class ClassEx {
	public static void main(String[] args) {
//		같은클라스명으로 가능 //		상속받을거고 인터페이스 구현
		System.out.println(new Phone("Apple"));//new하고생성//메모리주소 16진수로 나옴//주소를참조~!~!~!
		Phone p = new Phone(); //
		Phone p2 = new Phone();
		
//		p.model = "iphone"; // 이렇게 바로 넣을 수 없음 //다른 클래스라서//그리고 값이 private이라서
//		p2.model = "galaxy";
		
		
//		get set 차이점
		p.setModel("iphone"); //값을 셋팅(대입)하는 것이기 떄문에 리턴값이 없다.
		
		p.getModel();//단순히 클래스 내부의 변수 값을 가져오기 위한 것이기 때문에 리턴은 있지만 매개변수가 없다. //이주소에있는변수의값을가져다줘어
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
