package b10_클래스;

public class StudentTest {

	public static void main(String[] args) {
		
//		Student kim; //이렇게 하면 studen 클래스로 생성되어진 객체의 위치를 담을 수 있는 kim!! 학생을 담을 수 있는 변수 객체를 담을 수 있는 주소!! 메모리주소!! 자료형이 없기떄메
		
		Student kim = new Student("김준일", "USA아이티", 4);
		Student lee = new Student("이효원", 2);
		Student park = new Student("박호훈", "코리아아이티", 3);
		
		
			
//		null 주소가 없다라는 뜻 ()안에 주소값 //new하는 순간 생성 ~~ 찍어내면 heap이라는 메모 주소에 찍힘 (간이메모리주소?)
//		태어날ㄸ ㅐ  이름 부여를 하고싶다  new student(이름);넣어씅ㄹ떄 매개변수처럼 전달해줄꺼다
//		이름을 부여한 순간 student clss에 부여됨
		
//		kim.name = "김준일";//	.은 해당 메모리 주소값을 참조한다라고 한다.(쌤)
		
		kim.showInfo(); //저 학생만 사용하겟다 // shoinfo(10,20)을 넣는다할때 int형 매개변수가 필요함 그걸 class에서정리함(틀)
		lee.showInfo();
		park.showInfo();
		
		Integer i = new Integer(100);//주소를찍고잇는..
		
		System.out.println(kim.hashCode()); //kim에 빨간줄.. 아무것도 안가지고 있으니 null // null에  값을 넣고 출력하면 결과값 null //java.lang.NullPointerException <- 이 출력값을 자주보게되러깅ㅁ
		System.out.println(i.hashCode());//hashcode : 주소값 //주소가 중허다 //
		
		
		kim.getFreebies();
		lee.getFreebies();
		
		
		
		
			
		
	}

}

//캡슐화할거임
//생성자가뭔지 정확하게 이야기할꺼임
//studentText class
//캡슐화
//생성자는 메소드랑 똑같음 오버로더