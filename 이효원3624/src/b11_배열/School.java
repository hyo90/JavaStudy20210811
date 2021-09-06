package b11_배열;

public class School {//school이라는 공공의 클래스 

	public static void main(String[] args) {
		// 반을 만들떄... cg를 담을 수있는..
		
		ClassGroup[] cg = new ClassGroup[3];
			
		
		cg[0] = new ClassGroup(10);//첫번째 반 = 10명
		cg[1] = new ClassGroup(15);
		cg[2] = new ClassGroup(30);

		cg[0].addStudent("김준일");//첫번쨰방에 애들 추가
		cg[0].addStudent("이효원");
		cg[0].addStudent("김재성");
		cg[0].addStudent("서보경");
		cg[0].addStudent("박호훈");
		
		cg[0].classInfo(20210003);
		
		
		
		
		
		
		
		
	}
}
