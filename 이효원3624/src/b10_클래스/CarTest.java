package b10_Ŭ����;

public class CarTest {
	
	public static void main(String[] args) {
//		sonata ������
//		������ : �����ڵ���
//		�� : �ҳ�Ÿ
//		���� : ��
//		���� : 2019
		
//		k7
//		������ : KIA
//		�� : K7
//		���� : ȭ��Ʈ
//		���� : 2020
		
//		tesla_model3
//		������ : tesla
//		�� : model3
//		���� : ȭ��Ʈ
//		���� : 2021

		Car Sonata = new Car();
		Car KIA = new Car();
		Car tesla_model3 = new Car();
		
		Sonata.setCompany("�����ڵ���");
		Sonata.setModel("�ҳ�Ÿ");
		Sonata.setColor("��");
		Sonata.setYear(2019);
		
		KIA.setCompany("KIA");
		KIA.setModel("K7");
		KIA.setColor("ȭ��Ʈ");
		KIA.setYear(2020);
		
		tesla_model3.setCompany("tesla");
		tesla_model3.setModel("model3");
		tesla_model3.setColor("ȭ��Ʈ");
		tesla_model3.setYear(2021);
		
// company / model / color / year���� �����ϴ°� ������
//		�������̴°ɷ� ��ü���巯����
//		ex ����� �������� �Ҷ�� �ȶ�� light on off �ϳ��� ������
//		��ǹ�����������.........
//	ù���� ���� �ι�°����... �³� �̸��� ���������ʳ� ����ƮȨ..!
//		�Ȱ���������Դϴ�
//		��üȭ�Ǿ��ս�
//		�������̴°� ��üȭ�ϴ¿���
//		�����ð����� ��! ������ �˾ұ⋚���� - > ������ʹݺ�
		
		
		Sonata.carInfo();
		
		System.out.println();
		
		KIA.carInfo();
		
		System.out.println();
		
		tesla_model3.carInfo();
		
		
	}

	

}
