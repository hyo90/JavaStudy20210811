package practice;

public class B11_Array {

	public static void main(String[] args) {

		String[][][] quiz = new String [10][5][5];
		// quiz라는 변수안에 새로운 3차원 배열을 만들꺼임 5안에 3안에 4...
		
		for (int i = 0 ; i < quiz.length ; i++) { //int(정수)변수에 i라는 변수명을 0으로 지정... ; i(0)값이 퀴즈길이(5)가 될떄까지 ; i(0)값을 증감(1) 
			for(int j = 0; j < quiz[i].length ; j++) { // i하는 동안 (j값 0; j(0)값이 퀴즈길이(i안);j(0)값 증감(1)
				for (int k = 0; k < quiz[i][j].length; k++) { //i안의 j값 하는 동안 (k값 퀴즈값(4)가 될때까지 ; k(0)값 증감1) - > 증감시켜서 결과 산출후 j -> ㅑi로 넘어감.. 
					quiz[i][j][k] = (i+j+k) % 2 == 0 ? "@" : "#" ; //아... quiz i,j,k값은 i+j+k % 2 == 0일때 a, b로 결과 값이 나오는거임 i j k 각 값을 도출을 위해스 
//					for 안의 조건들로 각 배열의 i,j,k의 값을 도출
					
				}
			}
		}
		
		for (int i = 0 ; i < quiz.length ; i++) { 
			for(int j = 0; j < quiz[i].length ; j++) {
				for (int k = 0; k < quiz[i][j].length; k++) {
					System.out.print(quiz[i][j][k]);
				}
				System.out.print(quiz[i].length - 1 == j ? "\n" : ","); //i값의 길이 - 1 == j값이랑 같으면 줄바꿈 아니면 콤마
				
			}
		}
		
		System.out.println("안\n농\n");
	}

}
