package b11_�迭;

public class Desk {

	private int serialNumber; //å���Ϸù�ȣ
	private String company; //å�� ����ȸ��
	
	
	
	public Desk(int serialNumber, String company) { //���Ŭ���������� ���� �����ϴ�. desk��� �����ȿ� int string
		super();
		this.serialNumber = serialNumber; //�� Ŭ���� ���ο� �ش��ϴ� �ø���ѹ� �� = ����ũ�ȿ� �ش��ϴ� �ø���ѹ���
		this.company = company;
	}
	
	public int getSerialNumber() { //get�ø���ѹ� ������ �ø���ѹ� ���Ϲ�������
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
