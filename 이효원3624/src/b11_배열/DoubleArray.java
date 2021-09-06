package b11_배열;

public class DoubleArray {
//	이차원 배열
//	이차원 배열의 형태 -> 자료형[][];
	
	public static void main(String[] args) {
		
		int [][] d_arr = new int [3][5]; //이렇게하면 15개의 공간 어떠케ㅔ?[3]행(로우) [5]열(컬럼)의 갯수로!!
		
		d_arr[0][0] = 10;
		d_arr[1][4] = 100;
		
		System.out.println(d_arr[0][0]);
		System.out.println(d_arr[2][4]);
		
		System.out.println("[1, 4]");
		
		System.out.println(d_arr.length);
		System.out.println(d_arr[0].length);//[]안에 비워두면안됨 0이라고하면됨 어차피 컬럼의 갯수는 같으니까
		
				
//		100이라는 숫자를 찾으면 인덱스르 찾는..
//		for문을 이용해서 ... 잠도오고 머선말인지 모르게따...
//		그러니까 100을 찾으면 인덱스값이 나오게 하라고
//		ㅠㅠ오지마세여
		
		
//		배열이 있는뎀 
//		[a][b]증가범위가다ㅡ름
//		d_arr[0~2 / 3개][0~4 / 5개]
//		length범위..!!길이...갯수!를의미함
			
		
		for(int i = 0; i < d_arr.length; i++) { //얘는 행....0부터시작 d_arrl.lenght길이를 반복할꺼임 //운동장 3바퀴 
			for(int j = 0; j < d_arr[i].length; j++) {
				if(d_arr[i][j] != 100) {
					continue; // 100이 아니면 밑에 애들 안나옴 무시무시
				}
				System.out.println
				(d_arr[i][j] == 100 ? "[" + i + ", " + j + "]" : "");
					break;
			}
		}
				
				
				//얘는 열
//		.length 행  // 변수명[i].length열
//		3항연산자 연습하ㅔㅅ요
		
				
		
		
		
		

	}

}
