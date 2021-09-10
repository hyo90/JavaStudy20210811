package b13_다형성;

import b12_상속.Animal; // Animal 클라스를 상속받음!!! 임포임포트


// 상속받은 상태(import)에서 새로운 클래스 만들어보기
//class Test1 { <-아무튼 안됨
//	Animal ani = new Animal();
//	public void test() {
//		ani. //ctrl + space 하면 move없음 (protected)
//	}
//}

class Human extends Animal{
	public void readBook() { //상속된 상태에서 책읽기(새로운 선언) 생성
		System.out.println("사람이 책을 읽습니다.");
	}
	
	@Override
	public void move() { //Animal 클라스의 move()명을 재정의함 오버라이드됨
		System.out.println("사람이 두발로 걷습니다.");
	}
}

class Tiger extends Animal{
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
	
	@Override
	public void move() {
		System.out.println("호랑이가 네발로 뜁니다.");
	}
	
}

class Eagle extends Animal {
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
	
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
}

public class AnimalTest {

	Animal[] list = new Animal[3];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle(); 
//		마냐게 얘네들 내요을 모르면 인스턴스 오브를 사용함
//		누군가 표시를 했는데 모르겠을떄... 
//		어떻게든 표시를 했을거임.. 뭐 어디선가....
//		list[0][1][2]잘에 뭐가잇는지 찾을떄 인스턴스오브
	}
	
	public void animalMove() {
		for(Animal ani : list) {
			ani.move(); //애니가 가지고 잇는 무브로 실행되는거 아님꽈?
//			왜각각의 무브가 실행되느냐?????
//			오버라이드는 부모가 가지고잇는걸재정의한다.
//			각ㄱ각의 재정의 내용이 실행됨
		}
	}
	
	public void casting() {
//		System.out.println(list[0] instanceof Human);
//		업캐팅 되어서 들어간 값이 human이냐 /휴먼으로 생성했냐? / 그녀석이 동일하냐 찍어냇냐 해서 boolean값나옴
		for(Animal ani : list) {
			if(ani == null) {
				continue;
			}
			if(ani instanceof Human) { //이 값이 flase 이면(else if)
				Human h = (Human)ani; //명시적형변환 타입적는거처럼 
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger h = (Tiger)ani;
				h.hunting();
			}else if(ani instanceof Eagle) {
				Eagle h = (Eagle)ani;
				h.flying();
			}else {
				System.out.println("지원하지 않는 자료형입니다.");
			}
		}
	}
	
	
	public static void main(String[] args) {

		AnimalTest aniTest = new AnimalTest();
		
//		업캐스팅 Animal <- Human, Tiger, Eagle
		aniTest.addAnimal();
		aniTest.animalMove();

		System.out.println("----------------------------");
		
//		다운캐스팅
		aniTest.casting(); //결과값 boolean
		
		
		
		
		
		
		
		
		
		
		
	}
}
