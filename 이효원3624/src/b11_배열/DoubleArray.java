package b11_�迭;

public class DoubleArray {
//	������ �迭
//	������ �迭�� ���� -> �ڷ���[][];
	
	public static void main(String[] args) {
		
		int [][] d_arr = new int [3][5]; //�̷����ϸ� 15���� ���� ��ɤ�?[3]��(�ο�) [5]��(�÷�)�� ������!!
		
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[2][4]);
		
		System.out.println("[1, 4]");
		
		System.out.println(d_arr.length);
		System.out.println(d_arr[0].length);//[]�ȿ� ����θ�ȵ� 0�̶���ϸ�� ������ �÷��� ������ �����ϱ�
		
				
//		100�̶�� ���ڸ� ã���� �ε����� ã��..
//		for���� �̿��ؼ� ... �ᵵ���� �Ӽ������� �𸣰Ե�...
//		�׷��ϱ� 100�� ã���� �ε������� ������ �϶��
//		�Фп���������
		
		
//		�迭�� �ִµ� 
//		[a][b]�����������٤Ѹ�
//		d_arr[0~2 / 3��][0~4 / 5��]
//		length����..!!����...����!���ǹ���
			
		
		for(int i = 0; i < d_arr.length; i++) { //��� ��....0���ͽ��� d_arrl.lenght���̸� �ݺ��Ҳ��� //��� 3���� 
			for(int j = 0; j < d_arr[i].length; j++) {
				if(d_arr[i][j] != 100) {
					continue; // 100�� �ƴϸ� �ؿ� �ֵ� �ȳ��� ���ù���
				}
				System.out.println
				(d_arr[i][j] == 100 ? "[" + i + ", " + j + "]" : "");
					break;
			}
		}
				
				
				//��� ��
//		.length ��  // ������[i].length��
//		3�׿����� �����ϤĤ���
		
				
		
		
		
		

	}

}
