package b19_스테틱;

public class StaticTest {

	public static void main(String[] args) {
		Connector.connect();
		Integer.parseInt(null); //이렇게 써야 static으로 호출햇구나를 알 수 있음
		
		Student s1 = new Student("김준일");
		Student s2 = new Student("정상우");
		Student s3 = new Student("김현아");
		Student s4 = new Student("김윤하");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
		
		
//		Integer i = new integer(10);
//		i.parseInt(null); 이렇게 쓰지않음
		
//		connector.하면 호출 메서드가 뜸
//		s표시는 static 이라는 뜻
//		Integer. 하면 많은 호출 메서드가 뜸.. 그 이유는 기본 클라스라서어
		
//		매번 똑같은 로직이 있으면 static 씀
//		다른 결과값이라믄 쓰지마러라 
		
		

	}

}
