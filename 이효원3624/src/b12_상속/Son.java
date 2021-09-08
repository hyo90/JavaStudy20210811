package b12_상속;

public class Son extends Father{ // extends Father 상속받은고임 extends Father = new Fatehr(); 

	private int Bitcoin;
	
	public Son() {
		super("김", 10000, "삼정타워"); //new Father(); -> 아부지생성자 생략되어있다.
		System.out.println(super.toString());
		System.out.println("아들 생성");
	
//		super.setLastName("김");
//		super.setMoney(10000);
//		super.setBuilding("삼정타워");
	}
	
	@Override //어노테이션이라고 함
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}
	
	@Override
	public void setMoney(int money){//set이라하면 반환될게없음void
		super.setMoney((int)(money*1.1)); //기존머니와 머니 10% 더해줌 아부지의머니에서 가져옴
	}
	public int getBitcoin() {
		return Bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}
	}
