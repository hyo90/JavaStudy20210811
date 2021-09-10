package b12_상속;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human(); //생성자만들기
		Tiger t = new Tiger();
		Eagle e = new Eagle();

		h.move();
		t.move();
		e.move();
		
//		배열을 만들어줄꺼임
//		업캐스팅 / 부모높 자식낮
		Animal[] a = new Animal[3]; //동물이라는 배열 a변수 = 새 동물 인덱스 3객만들꺼임
		a[0] = new Human();//업캐스팅임 animal이 부모클래스라서  업캐스팅되는고임
		a[1] = new Tiger();
		a[2] = new Eagle();
		
//		for each :처음부터 끝가지 사용ㅎ ㅏ는, 중간부터 시작할 수 없음 
//		for(시작 조건 처리법으로 함)
//		for each는 ":"(콜론) 기준으로쓸꺼임 
		
		for(Animal ani : a) { //animal이라고 하는 class 변수한테 a이라는 배열 첫번쨰 인덱스부터 끝까지 반복을할거에여 첫번쨰부터 차례대로 대입쓰
			ani.move(); //첫번쨰는 사람 타이거 이글 // 인덱스가 정해져있어야함.
		}
		
//		for each(:) 풀어서 쓰면 이렇게, 숫자만 바꾸면 중간부터 시작할 수 있음
//		for(int i = 0; i < a.length; i++) {
//		Animal ani = a[i]; = //ani.move();
//			ani.move();
//		}
		
		
//		다형성의 포인트는 업캐스팅 & 다운캐스팅
//		담시간에할게염
//		대충이해돼요...
//		설명 너무 잘해주시는데 ....이해만 돼요....
//		활용어케해요
		
		
		
		
		
//		int i = 10;
//		double d = i; // 업캐스팅 int ->double //묵시적형변환
			
		
//		father f = new son(); <-이건안됨 변수명이 달라서 안됨....
//		하지만 위에 경우는 다형성으로 가능한거임 업캐스팅 다운캐스팅
//		
		
		
		
		
	}
}
class Human extends Animal{//클래스 휴먼이 animal이ㅏㄹ는 클래스를 상속받음
	@Override
	public void move() { //move 의 재정의
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리는 날개를 펴고 납니다.");
	}
	
}

// 재정의하는거 아부지내용 다버리기
