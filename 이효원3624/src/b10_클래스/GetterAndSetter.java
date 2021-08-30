package b10_클래스;

public class GetterAndSetter {
	
	public static void main(String[] args) {
		
		Student Kim = new Student();
				
//		kim.name = "김준일";
//		Setter()

		Kim.setName("김준일"); //student라는 클래스를 만들어서 name이
		Kim.setSchoolName("코리아아이티아카데미");
		Kim.setYear(5);
		
		
//		System.out.println(Kim.getName()); //studen에서 getname 클래스르 만들어서 리턴값입력후
//		System.out.println(kim.get);

		Kim.showInfo();
	}
	

	

}
