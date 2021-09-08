package b12_상속;

public class Father {
	private String lastName; //상속을 받으면 아부지의 성을따르겟죠?????
	private int money;//아빠돈
	private String building;
	
//	몰해조야하죠????????????????????????
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



	
	

