package b19_����ƽ;

public class SingleTon {
	public static void main(String[] args) {
		KIA factory1 = KIA.getInstance();  
		KIA factory2 = KIA.getInstance();  
		KIA factory3 = KIA.getInstance();  
		KIA factory4 = KIA.getInstance(); 
		KIA factory5 = KIA.getInstance();  
		KIA factory6 = KIA.getInstance();  
		
		Car k3 = factory1.createCar("k3");
		Car k5 = factory2.createCar("k5");
		Car k7 = factory3.createCar("k7");
		Car k8 = factory4.createCar("k8");
		Car ev6 = factory5.createCar("ev6");
		
		
		k3.carInfo();
		k5.carInfo();
		k7.carInfo();
		k8.carInfo();
		ev6.carInfo();
		
		
		
//		�������� ������ ������ �ϳ��� ȸ���
		
		
	}
	

}


// singleton
// �ϳ��� Ŭ����?�� ���鶧
// ex)�����ڵ������� ���ؼ� ������ �ڵ������� �̸��� ��������
// ȸ��ȿ����� ���� �������� ��������
// �ڵ��� �Ϸù�ȣ�� �����غ��ô� / �Ϸù�ȣ ��ġ�� �ȵȴ� ���鶧
// �Ϸù�ȣ�� �ػ翡�� ������
// �����ͺ��̽��� �����ؼ��� ������