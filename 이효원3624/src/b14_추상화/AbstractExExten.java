package b14_�߻�ȭ;

abstract class AbstractEx3Exten extends AbstractEx {
//	Ŭ�� ���� ����
//	�տ� abstract�� �ٿ����� ���������ʾƵ� Ŭ�������� ���� �� ����
//	�̷����� �ӽ÷�...���� ��.....
//	���� �������̵� ���� ��� �ϴϲ� ���������ʾ�����
	
}



class AbstractEx2Exten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("�� ȿ ��");
	}
	
}

public class AbstractExExten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("�� ȿ��");//
	}
	
// public class AbstractExExten extends AbstractEx { �̷��� ������ڸ��� ������ �� !!!
// �θ�Ŭ�󽺰� ���������ʾƼ� ctrl + space override �������  
	

}
