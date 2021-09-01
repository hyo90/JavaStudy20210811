package practice;

public class B10_class_computer {

	private String maker;
	
	private String model;
	
	private String color;
	
	private String door;
	
	private int year;
	
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
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
	public String getDoor() {
		return door;
	}
	public void setDoor(String door) {
		this.door = door;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void FloInfo() {
		System.out.println("제조사 : " + maker);
		System.out.println("모델명 : " + model);
		System.out.println("도어 종류 : " + door);
		System.out.println("색깔 : " + color);
		System.out.println("연식 : " + year);
	} {
		
				
	}
	
	
	

	
	
	
}
