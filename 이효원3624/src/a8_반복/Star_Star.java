package a8_반복;

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
		
		for(int i = 0; i < 5; i++) { //중첩시 for(for(for 변수명 다르게 다른 지역이면 노상관
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
			
			
			
			
			
			
			
//			트리모양 / 1,3,5,7,9를 찍어낼수있는 공식을 만들엉야함

//			int num = 0;
//			int result = num+1; 
			
			
			
			
			for(int i = 0; i < 5; i++) { //규칙성
				for(int j = 0; j < 5 - i + 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0; j < (i*2)+1; j++) { //공식생각하기
					System.out.print("*");
				}
				System.out.println();
			}
	}
}

	
		
		
		
		
		
		//기준이 되는 값을 ...!
		
		
		






//Scanner in = new Scanner(System.in); 
//
//System.out.println("별의 개수 : "); 
//int star = in.nextInt(); //여기서 갯수를 넣으면
//
//for(int i = 0; i < star; i++) { //i가 현재 0인데 현재 j도 0 
//	for(int j = 0; j < i + 1; j++) { //i의 값을 가져와서 i +1만큼 더하고 조건 반복
//		System.out.print("*"); //옆으로 쭉 붙음			
//	}
//	System.out.println();
//}
//
