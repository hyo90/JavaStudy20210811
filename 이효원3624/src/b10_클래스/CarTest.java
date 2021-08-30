package b10_클래스;

public class CarTest {
	
	public static void main(String[] args) {
//		sonata 변수명
//		제조사 : 현대자동사
//		모델 : 소나타
//		색상 : 블랙
//		연식 : 2019
		
//		k7
//		제조사 : KIA
//		모델 : K7
//		색상 : 화이트
//		연식 : 2020
		
//		tesla_model3
//		제조사 : tesla
//		모델 : model3
//		색상 : 화이트
//		연식 : 2021

		Car Sonata = new Car();
		Car KIA = new Car();
		Car tesla_model3 = new Car();
		
		Sonata.setCompany("현대자동차");
		Sonata.setModel("소나타");
		Sonata.setColor("블랙");
		Sonata.setYear(2019);
		
		KIA.setCompany("KIA");
		KIA.setModel("K7");
		KIA.setColor("화이트");
		KIA.setYear(2020);
		
		tesla_model3.setCompany("tesla");
		tesla_model3.setModel("model3");
		tesla_model3.setColor("화이트");
		tesla_model3.setYear(2021);
		
// company / model / color / year별로 정리하는게 조을듯
//		집에보이는걸로 객체만드러보셈
//		ex 냉장고 열엇을떄 불뜬다 안뜬다 light on off 하나씪 만들어보기
//		사실뭔말씀이진지.........
//	첫번쨰 전주 두번째전구... 걔네 이름만 따로주지않냐 스마트홈..!
//		똑같은기능을함니다
//		객체화되어잇슴
//		눈에보이는거 객체화하는연습
//		다음시간에배 열! 생성을 알았기떄무네 - > 상속의초반부
		
		
		Sonata.carInfo();
		
		System.out.println();
		
		KIA.carInfo();
		
		System.out.println();
		
		tesla_model3.carInfo();
		
		
	}

	

}
