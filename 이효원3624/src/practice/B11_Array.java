package practice;

public class B11_Array {

	public static void main(String[] args) {

		String[][][] quiz = new String [10][5][5];
		// quiz��� �����ȿ� ���ο� 3���� �迭�� ���鲨�� 5�ȿ� 3�ȿ� 4...
		
		for (int i = 0 ; i < quiz.length ; i++) { //int(����)������ i��� �������� 0���� ����... ; i(0)���� �������(5)�� �ɋ����� ; i(0)���� ����(1) 
			for(int j = 0; j < quiz[i].length ; j++) { // i�ϴ� ���� (j�� 0; j(0)���� �������(i��);j(0)�� ����(1)
				for (int k = 0; k < quiz[i][j].length; k++) { //i���� j�� �ϴ� ���� (k�� ���(4)�� �ɶ����� ; k(0)�� ����1) - > �������Ѽ� ��� ������ j -> ��i�� �Ѿ.. 
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "@" : "#" ; //��... quiz i,j,k���� i+j+k % 2 == 0�϶� a, b�� ��� ���� �����°��� i j k �� ���� ������ ���ؽ� 
//					for ���� ���ǵ�� �� �迭�� i,j,k�� ���� ����
					
				}
			}
		}
		
		for (int i = 0 ; i < quiz.length ; i++) { 
			for(int j = 0; j < quiz[i].length ; j++) {
				for (int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]);
				}
				System.out.print(quiz[i].length - 1 == j ? "\n" : ","); //i���� ���� - 1 == j���̶� ������ �ٹٲ� �ƴϸ� �޸�
				
			}
		}
		
		System.out.println("��\n��\n");
	}

}
