package b11_�迭;

public class Desk {

	private int serialNumber;
	private String company;
	
	
	
	public Desk(int serialNumber, String company) {
		super();
		this.serialNumber = serialNumber;
		this.company = company;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public String getCompany() {
		return company;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void showInfo() {
		System.out.println("å�� �Ϸù�ȣ : " + serialNumber );
		System.out.println("å�� ������ : " + company );
	}
	
	
	
	
	
	
}
