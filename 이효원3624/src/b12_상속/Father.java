package b12_���;

public class Father {
	private String lastName; //����� ������ �ƺ����� ������������?????
	private int money;//�ƺ���
	private String building;
	
//	������������????????????????????????
//	shift + alt + s =construct using fields
	public Father(String lastName, int money, String building) {
		super();
		this.lastName = lastName;
		this.money = money;
		this.building = building;
	}	
	
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}


//		shilft + alt + s = toString
	@Override
	public String toString() {
		return "Father [lastName=" + lastName + ", money=" + money + ", building=" + building + "]";
	}

	
	
}



	
	

