package b11_배열;

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
		System.out.println("책상 일련번호 : " + serialNumber );
		System.out.println("책상 제조사 : " + company );
	}
	
	
	
	
	
	
}
