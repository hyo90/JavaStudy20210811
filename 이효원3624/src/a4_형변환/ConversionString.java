package a4_����ȯ;

public class ConversionString {

	public static void main(String[] args) {
//		���ڿ�(string)�� ����ȯ (���� ������.��)
		int num = 10;
		int num2 = 10;
		String sNum = "10";

//		int + int + sting 10 ���� 2010
		System.out.println(num + num2 + sNum);
		System.out.println(sNum + (num + num2));
//		sNum (���ڿ�) + int ���� ���� ����� num2(int)�� ����101010 ������ �߿���~!~! ���� or ��ȣ�� �����ָ� ��
//		Ű���� �Է¹����� �ٽ� string ��
		
//		���ڿ� -> �ٸ� �ڷ���(boolean(), int(����), double(�Ǽ�))
//		int(����) : Integer.parseInt(���ڿ�);
		int i = Integer.parseInt("10");
//		:int = 10�ε� double (10.1)�� �ϸ� ������ �� -> double�� ���� �� Ŀ�� �ȵ� / �������� ������ �ȶߴ°�(�߸��Ȱ��߿�) run time �� ������ �� !! ����Ǿ�����
//		����(������)�ߴ°� ���Ǵµ� �������ֶ�°��� 
		double d = Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
//		�ٸ� �ڷ��� -> ���ڿ�
//		int(����) : integer.toString(����);
		Integer.toString(10);
		Double.toString(10.1);
		Boolean.toString(false);
		
	

	}

}
