package b10_클래스;

public class Student {

	private String name;//기본값이 아닌이상 없어야한다 //studentTest에서 안뜸 .. private붙여서
	private String schoolName;
	private int year; //학년 

	public Student() { // <- 아무것도 없는 이게 기본생성자   
// public 공용
//	private 클래스만
// 접근지정자 거의다 private(동일 클래스 내)
// private & public 
				}

	
	
	
//	오버로딩할떄 기본생성자 있어야함.
//	오버로딩없을때 비어이씅면 생략가능!!	
//	/는 원래 생략되어있다. 하지만 오버로드했을떄 기본생성자 지우면 생성할수없게됨(studentTest)에서!!
	
	
	public Student(String n, int y) { //ctrl+space c코드붙어있는 student 생성자가 뜸ㅋㅋ 
		name = n;
		year = y;
	}
	
	public Student(String name, String schoolName, int year) {//매개변수들
		super(); //상속 관계
		
		this.name = name + " 학생" ;  
		this.schoolName = schoolName;//this - 나 자신 내가 있는 위치 this + ctrl + space ~!~!~!
		this.year = year;
		this.showInfo();
//		변수명은 색깔로 구분하기 (지역별)
//		this나 자신(클래스)의 네임을 가져오고 = 메소드 자신(매개변수에 있는)
//		인스턴스 변수의 이름과 지역 변수의 이름이 같을 경우 인스턴스 변수 앞에 this 키워드를 사용하여 구분할 수 있었습니다.
	}
	
	public void setName(String name) {//~학생의 의름을 부텨주세여 하면
//		매개변수 string이죠?????? 
//		setter = set+변수명(첫글자대문자) 
		
		this.name = name + " 학생";		
		System.out.println(this.name);
		
	}
	
	
	public String getName() {//매개변수는없음 지금 이 클래스에서 자료를 ㅏ가져오니까
		return name; //굳이 this 안 붙여도 됨 메소드 내에 또 다른 name이 없으니까
		
	}
	
//	source - generate getters and setters 으로 !! 
//	기본을 private으로 만들기... 데이터 보호를 위해서
//	데이터 보호를 위해서.. 1.생성자  2.getters and setters
	
	
	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(year, schoolName);
		
		
		if(regular.setYearCheck()) {
			System.out.println("사은품 대상자");
		}else {
			System.out.println("대상자 제외");
		}
	}
	
	

	public void showInfo () {//
		System.out.println("학생 정보 : ");
		System.out.println("이름 : " + name);
		System.out.println("학교 : " + schoolName);
		System.out.println("학년 : " + year);
	}
}

//이거슨 틀이다 이걸로 새생성을하겟다




