package b11_�迭;

public class OXCount {

	public static void main(String[] args) {
//		3���� �迭
		String[][][] quiz = new String [3][2][3];
// (((ooo)(ooo))((ooo)(ooo))((ooo)(ooo))) �̷��� 3���� �迭
//		�˾Ƽ� 0,1,2,3���� �ؼ� �ڸ����� ������� �ε��� �ڸ���ȣ??0.1/ 0.2 �̷�������
		
		
		
		//quiz��� �ϴ� �迭�� ������ ���� �ݺ�Ƚ���߿��� k�� 2�� �A���� "o" : "x"  
		//quiz[i][j][k] = I+J+k%2 == 0 -> "0";
		
//	�� �迭 ��ġ�� .. �ݺ�������...
//		i j k�� ��� 1�� �����ϸ� ���� �����ڳ� �װ� ¦���� o �ƴϸ� x
//		18���� �����ȿ� ���� �������� �ְ�ʹپ� �� ��������(i+j+k/2)
//		�� �迭�� ���� �־��...
//		����Ҷ� / �����Ҷ� �ΰ������
		
		// ��°��...................��θ�..�̷��Գ��;��Ѵ��̷�������
		// OXO, OOO
		// OOX, OXO
		// OXO, OOX
		
		// O�� ����: 00��...
		// X�� ���� : 00��... 
		
		//
		//quiz[i][j][k] = I+J+k%2 == 0 -> "0"; �̰Ž�����			
		for (int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "O" : "X";
				}
			}
		}
		
		// ��°��...................��θ�..�̷��Գ��;��Ѵ��̷�������
				// OXO, OOO
				// OOX, OXO
				// OXO, OOX
		for (int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]); //�̷����ϸ� �� ��Գ��� 
				}
				System.out.println(quiz[i].length-1 == j ? "\n" : ","); // "/n" ������ �ٹٲ��϶�
				
//				if(quiz[i].length-1 == j) {
//					System.out.println("");
//				}else {
//				System.out.print(", ");//j��������,�ش޶�
//			}
		}
	}}}


