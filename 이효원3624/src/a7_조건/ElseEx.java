package a7_����;

public class ElseEx {

	public static void main(String[] args) {
		
		if('a' == 'A') {
			System.out.println("�� ���ڰ� �����ϴ�.");}
		   else { if('A' == 'A') 
		           {System.out.println("�� ���ڰ� �����ϴ�.");}
		   else {System.out.println("�� ���ڰ� �ٸ��ϴ�.");}
		}

}}



// 'a'�� 'A'�� ������(if) "�� ���ڰ� �����ϴ�."
// �ƴϸ�(else)... Ȥ�� 'A'�� 'A'�� �����Ÿ� "�� ���ڰ� �����ϴ�"��
// �̰� ���� �ƴϸ� "�� ���ڰ� �ٸ��ϴ�." ����ϼ���!!! 