package b10_클래스;

public class Car {
	
	private String company; //제조사
	
	private String model; //모델명
	
	private String color; // 차량색상
	
	private int year ; //연식
	

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	
	public void carInfo() {
		System.out.println(model + "차량의 정보");
		System.out.println("제조사 : " + company);
		System.out.println("연식 : " + year);
		System.out.println("색상 : " + color );
		
	}
	
	
	
	

}
