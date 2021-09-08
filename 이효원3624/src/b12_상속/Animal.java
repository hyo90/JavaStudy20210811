package b12_상속;

public class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
		
	}
	

}


	// Animal이라는 클래스안에 move라는 재정의

//예를들어서 factory라는아빠클라스에 공정별클라스가잇으면 상속이 안될거임 이것이 인터페이스??????????????????????????




//extends는 다중상속이 안됨 animal= animal 표유류=표유류
///서로간의 상관관계가 깊어야함

//인터페이스는 다중구현이 가능함
//factory 같은경우 on off 넣고 / 케이블연결하니마니 각각 인터페이스 만들어서 조립쓰
//독립적으로 가지고잇는게 ㄱ인터페이스
//보통 추상클래스는 ㅇ니터페이스를 많이함
