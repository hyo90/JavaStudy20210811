package a8_�ݺ�;

public class Star_Star {

	public static void main(String[] args) {

		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
						
			System.out.println();
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < 5; i++) { //��ø�� for(for(for ������ �ٸ��� �ٸ� �����̸� ����
			for(int j = 0; j < 5-i-1; j++)
				System.out.print(" ");
		
		    for(int j = 0; j < i + 1; j++) {
			    System.out.print("*");
		  }
		}
		System.out.println();		
	
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("");
			}
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
		}
			
			System.out.println();
			
			
			
			
			
			
			
//			Ʈ����� / 1,3,5,7,9�� �����ִ� ������ ���������

//			int num = 0;
//			int result = num+1; 
			
			
			
			
			for(int i = 0; i < 5; i++) { //��Ģ��
				for(int j = 0; j < 5 - i + 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (i*2)+1; j++) { //���Ļ����ϱ�
					System.out.print("*");
				}
				System.out.println();
			}
	}
}

	
		
		
		
		
		
		//������ �Ǵ� ���� ...!
		
		
		






//Scanner in = new Scanner(System.in); 
//
//System.out.println("���� ���� : "); 
//int star = in.nextInt(); //���⼭ ������ ������
//
//for(int i = 0; i < star; i++) { //i�� ���� 0�ε� ���� j�� 0 
//	for(int j = 0; j < i + 1; j++) { //i�� ���� �����ͼ� i +1��ŭ ���ϰ� ���� �ݺ�
//		System.out.print("*"); //������ �� ����			
//	}
//	System.out.println();
//}
//
