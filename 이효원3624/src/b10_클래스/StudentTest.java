package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		Student kim = new Student(); //메소드입력할떄랑 같은 배열 //생성자 -> 클래스명과 같다.
		
		kim.name = "김재성";

		kim.showInfo();
		
		Student lee = new Student();; //lee 메모리주소
		
		lee.name = "이효원";
		
		lee.showInfo();
		
		System.out.println(kim); //결과값 메모리 주소
		System.out.println(lee);
		
		
			
		
	}

}

//캡슐화할거임
//생성자가뭔지 정확하게잉갸ㅣ할거임
//studentText class
//캡슐화
//생성자는 메소드랑 똑같음 오버로더