package b10_Ŭ����;

public class Regular {
	private boolean yearCheck;

	public boolean isYearCheck() { // boolean ���� get�Ⱦ��� is�� �� �̳� �ƴϳ�~
		return yearCheck;
	}

	public void setYearCheck(int year, String schoolName) {
		this.yearCheck = year > 2 && schoolName.equals("�ڸ��ƾ���Ƽ");
	}
	
	
	
	
	

}