package b19_����ƽ;

public class KIA {

	private static KIA instance = new KIA();
	private int serialNum = 20210000;
	
	private KIA() {
		
	}
//	�����ڰ� private�̸� �ٸ� Ŭ�������� ������ �� ��������
//	�� Ŭ�� ��پ�
	
	
	
	
	public static KIA getInstance () {
		if(instance == null) {
			instance = new KIA();
		}
		 return instance;
	}
	
	
	public Car createCar(String model) { //�Ű������� �𵨸��� �޴´�
		//�ڵ����� ������������� �ø���ѹ� ���� ����
		return new Car(serialNum++, model);
	}
	
	
//	public static ����鼭 private CarFactory() ��밡���ϰԵǴ°�!! 
//	ī���丮�� �������ִ� static�� ���ؼ� �ܺο� ���ᰡ���ϵ���! �ܺη� �����ѵ�پ�~!~!
	
}

// �̱��� �⺻ ����