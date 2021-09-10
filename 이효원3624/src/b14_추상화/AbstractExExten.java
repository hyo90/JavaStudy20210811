package b14_추상화;

abstract class AbstractEx3Exten extends AbstractEx {
//	클라스 보류 가능
//	앞에 abstract만 붙여놔도 구현하지않아도 클래스명을 만들 수 있음
//	이럴때는 임시로...쓰는 것.....
//	당장 오버라이드 구성 노노 하니께 설꼐되지않앗을떄
	
}



class AbstractEx2Exten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("이 효 원");
	}
	
}

public class AbstractExExten extends AbstractEx {
	@Override
	public void printName() {
		System.out.println("이 효원");//
	}
	
// public class AbstractExExten extends AbstractEx { 이렇게 상속하자마자 오류가 남 !!!
// 부모클라스가 완전하지않아서 ctrl + space override 해줘야함  
	

}
