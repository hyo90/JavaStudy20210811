package b10_클래스;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() { // boolean 값은 get안쓰고 is를 씀 이냐 아니냐~
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolName) {
		this.yearCheck = year > 2 && schoolName.equals("코리아아이티");
	}
	
	
	
	
	

}