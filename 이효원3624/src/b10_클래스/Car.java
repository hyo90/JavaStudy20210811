package b10_Ŭ����;

public class Car {
	
	private String company; //������
	
	private String model; //�𵨸�
	
	private String color; // ��������
	
	private int year ; //����
	

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
		System.out.println(model + "������ ����");
		System.out.println("������ : " + company);
		System.out.println("���� : " + year);
		System.out.println("���� : " + color );
		
	}
	
	
	
	

}
