package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	
	public void quiz1(int starCount) {
		for(int i = 0; i < starCount; i++) { 		
			for(int j = 0; j < i + 1; j++) { 
		}
				System.out.print("*"); 		
			}
		System.out.println();
		
		
		
	}
//	public void �� �ż������ �ۼ� �� ����! 
//	main�� static�� �پ��ֲ� �ٸ��ֵ��� �Ⱥپ�����
	
	
	
	public void procStart(String selector, int starCount) {//�Ű�����
		if(selector.equals("1")) {
			quiz1(starCount);
		} else if (selector.equals("2")) {
			quiz2(starCount);
		} else if (selector.equals("3")) {
			quiz3(starCount);
		} else if (selector.equals("4")) { //1,2,3,4�� �ƴϸ� 5�ϱ� ����
			quiz4(starCount);
		} else {
			quiz5(starCount);
		}
				
	}
	
	public void mainMenuPrint() {
		System.out.println("[����� ���α׷�]");
		System.out.println("1. ���� 1");
		System.out.println("2. ���� 2");
		System.out.println("3. ���� 3");
		System.out.println("4. ���� 4");
		System.out.println("5. ���� 5");
		System.out.println("q.���α׷� ����"); // �̰͵� main���� �ִٰ� void�� �ø�����
	}
		

	public static void main(String[] args) {
		
		Quiz m= new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
		while(loopFlag) {	
		m.mainMenuPrint(); //m.���θ޴� �޼��带 ȣ���� �װ� ���� public void mainMenu�̰� !! // �׻� �����ϴ²����ϴϱ� 
		System.out.print("����� �Է��ϼ��� : ");
		String selector = in.nextLine(); //nextline�� �Է��ϸ� ���ۿ� ����ȵ�
		 
		
		if(selector.equals("1") || selector.equals("2") || selector.equals("3") || selector.equals("4") 
			|| selector.equals("5")) { //1-5���� �Է������� ������ �Է��϶� â�� �߰�!! 
			
			System.out.print("����� ���� ������ �Է��ϼ��� :  ");
			int starCount = in.nextInt(); //string���� int���� next���� ����Ȯ�뤤
			in.hasNextLine();
			
			m.procStart(selector,  starCount);
							
			
		}else if(selector.equals("q")) {
			System.out.println("���α׷� ������...");
			loopFlag = false;
		}else {
			System.out.println("�߸��� �Է��Դϴ�.");
		}
			System.out.println();
		}
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		
//		�Լ� = �޼���
//		����
//		ù��° �Է�:
		
		/*
		 * [����� ���α׷�]
		 * 1. ���� 1
		 * 2. ���� 2
		 * 3. ���� 3
		 * 4. ���� 4
		 * 5. ���� 5
		 * q.���α׷� ����
		 * ����� �Է��ϼ��� : 1 
		 * 
		 * ��� �Է� �� �� ���� �Է� ������
		 * 
		 * ����� ���� ������ �Է��ϼ��� : 10
		 *    : **********
		 * �Լ��� ���弼�� 
		 * �޼ҵ带 �̿��ؼ� ��������
		 * 1�̶�� ���� �����ؼ�
		 * ����� ���� ���� �ѱ�Ŵ�
		 * �Ű����� �ΰ�!! 
		 * ���ΰ����ϴ�
		 * 
		 * ����� ������ ����Ҳ��� 
		 * void procStart(��� ��ȣ, 10){
		 *  if(1���̸�){
		 * 		void quiz1(���� ����){
		 * 			for()
		 * 		}  
		 *  } else if (2���̸�){
		 *  
		 *  }
		 * }
		 * 
		 * �޼��带 5�� ���� 
		 * �� �޼���
		 * 
		 * ����� �� �ø����� �� �� �� 
		 * �׹��פ�����
		 * �ɱݤ��������ϸ鸸����ռ���
		 * �������Ѵٻ��ǰ��ϰ�����׳�
		 * 
		 * 
		 */
		
		
		
		
	}

}
