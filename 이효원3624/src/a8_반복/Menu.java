package a8_�ݺ�;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		boolean mainFlag = true;
//		Ŭ�����ȿ� main�̶�� �Լ� ���巯���ջ뤷 �رװŽ��Լ�(�޼ҵ�)�ڹٿ����¸޼ҵ���Ҹ����
					
//		while ���ѹݺ�~~~
		while(mainFlag) {
			System.out.println("[���α׷� �޴�]");
			System.out.println("1. ������ ���� ����");
			System.out.println("q. ���α׷� ����");
			System.out.print("����� �Է��ϼ���: ");
			String selecter = in.nextLine(); //���ڿ� �Է�!!!!
			
			
			if(selecter.equals("1")) { //���ڴ� equls ����� ==�ε�ȣ�ȵ�
				while(true) { //while�ȿ� �����������ؾ� ���ϴ´�� ����?�̰�����........���л���������.......^-^...^-^-^-^-_-^-^_^-^_^
					System.out.println("[������ ���� ����]");
					System.out.println("1. javaStudy ����");
					System.out.println("b. �ڷΰ���");
					System.out.println("q. ���α׷� ����");
					System.out.print("����� �Է��ϼ��� : ");
					selecter = in.nextLine();
					
					if(selecter.equals("1")) {
						System.out.println("[javaStudy ����]");
					}else if(selecter.equals("b")) {
						break;
					}else if(selecter.contentEquals("q")) {
						System.out.println("���α׷� ������....");//�ٸ��޴�������̴��� �����ų���̽����...
						mainFlag = false; //������
						break;//�ڿ��ŷ��ּ���
					}else {
						System.out.println("�߸��� �Է��Դϴ�.");
					}
				}
				
				
			
			} else if(selecter.equals("q")) { //���ѹݺ��Ǳ⋪�� q�Է��ص� �ȵ����� �׷��� ����������
				System.out.println("���α׷� ���� �� ...");
				break; //�ھ�־��־��� �տ������� q�ش��ϴ� ���� �ȶ�
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
			
		}	
		
		
		System.out.println("���α׷� ����!"); // while�ۿ�!! while ������ �ߵ���
		
		
		
	}

}
