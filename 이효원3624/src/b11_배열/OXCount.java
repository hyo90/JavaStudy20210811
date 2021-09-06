package b11_배열;

public class OXCount {

	public static void main(String[] args) {
//		3차원 배열
		String[][][] quiz = new String [3][2][3];
// (((ooo)(ooo))((ooo)(ooo))((ooo)(ooo))) 이런게 3차원 배열
//		알아서 0,1,2,3으로 해서 자리수가 만들어짐 인덱스 자리번호??0.1/ 0.2 이러ㅏㄴ궈
		
		
		
		//quiz라고 하는 배열의 만약의 나의 반복횟수중에서 k가 2의 짞수면 "o" : "x"  
		//quiz[i][j][k] = I+J+k%2 == 0 -> "0";
		
//	이 배열 위치에 .. 반복시점에...
//		i j k가 계쏙 1씩 벼놔하면 값이 벼나자나 그게 짝수면 o 아니면 x
//		18개의 공간안에 값을 랜덤으로 넣고싶다아 저 수에따라서(i+j+k/2)
//		이 배열의 값을 넣어라...
//		출력할때 / 대입할때 두가지방법
		
		// 출력결과...................띠로리..이렇게나와야한다이런식으로
		// OXO, OOO
		// OOX, OXO
		// OXO, OOX
		
		// O의 갯수: 00개...
		// X의 개수 : 00개... 
		
		//
		//quiz[i][j][k] = I+J+k%2 == 0 -> "0"; 이거시조건			
		for (int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "O" : "X";
				}
			}
		}
		
		// 출력결과...................띠로리..이렇게나와야한다이런식으로
				// OXO, OOO
				// OOX, OXO
				// OXO, OOX
		for (int i = 0; i < quiz.length; i++) {
			for(int j = 0; j < quiz[i].length; j++) {
				for(int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]); //이렇게하면 걍 길게나옴 
				}
				System.out.println(quiz[i].length-1 == j ? "\n" : ","); // "/n" 라인을 줄바꿈하라
				
//				if(quiz[i].length-1 == j) {
//					System.out.println("");
//				}else {
//				System.out.print(", ");//j가끝나면,해달라
//			}
		}
	}}}


