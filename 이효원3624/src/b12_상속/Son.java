package b12_���;

public class Son extends Father{ // extends Father ��ӹ������� extends Father = new Fatehr(); 

	private int Bitcoin;
	
	public Son() {
		super("��", 10000, "����Ÿ��"); //new Father(); -> �ƺ��������� �����Ǿ��ִ�.
		System.out.println(super.toString());
		System.out.println("�Ƶ� ����");
	
//		super.setLastName("��");
//		super.setMoney(10000);
//		super.setBuilding("����Ÿ��");
	}
	
	@Override //������̼��̶�� ��
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}
	
	@Override
	public void setMoney(int money){//set�̶��ϸ� ��ȯ�ɰԾ���void
		super.setMoney((int)(money*1.1)); //�����ӴϿ� �Ӵ� 10% ������ �ƺ����ǸӴϿ��� ������
	}
	public int getBitcoin() {
		return Bitcoin;
	}
	public void setBitcoin(int bitcoin) {
		Bitcoin = bitcoin;
	}
	}
