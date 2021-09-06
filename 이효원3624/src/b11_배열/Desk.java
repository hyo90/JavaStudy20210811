package b11_배열;

public class Desk {

	private int serialNumber; //책상일련번호
	private String company; //책상 제조회사
	
	
	
	public Desk(int serialNumber, String company) { //어느클래스에서나 접근 가능하다. desk라는 변수안에 int string
		super();
		this.serialNumber = serialNumber; //이 클래스 내부에 해당하는 시리얼넘버 값 = 데스크안에 해당하는 시리얼넘버값
		this.company = company;
	}
	
	public int getSerialNumber() { //get시리얼넘버 보내면 시리얼넘버 리턴받을꺼임
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
