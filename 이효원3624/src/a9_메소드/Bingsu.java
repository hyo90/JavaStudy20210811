package a9_메소드;

public class Bingsu {
	
//	toMAke - 메소드 
//	어떤재료를 가지고 ? 
	String toMake (String material, int materialCount, String material2) { //tomake 친구 ㅠㅠ 친구가할수잇는동작 / 가운데 int
		String bingsu = material + materialCount + "개와" + material2 + "가 들어간 빙수";
		return bingsu;
	}

	void voidTest() {
		System.out.println("보이드 테스트 메소드");
	}
	
	
	public static void main(String[] args) {
//		void main(String[] args) voil 공허하다 반화할게음다 실행하면 끝
//		static 공유하는 영역 
		
		Bingsu b = new Bingsu(); //g현재 나의 클래스
		
		String material = "딸기";
		
		String bingsu1 = b.toMake(material,10,"연유");
//		ctrl + 메서드?누르면
		String bingsu2 = b.toMake("청포도",10,"연유");
		String bingsu3 = b.toMake("망고",10,"연유");
		String bingsu4 = b.toMake("초코",10,"연유");
		
		System.out.println(bingsu1);
		System.out.println(bingsu2);
		System.out.println(bingsu3);
		System.out.println(bingsu4);
		
		
		
		b.voidTest();
		
		
	}

}
