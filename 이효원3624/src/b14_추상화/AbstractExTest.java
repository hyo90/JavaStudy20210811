package b14_추상화;

public class AbstractExTest {

	public static void main(String[] args) {
//		AbstractEx absEx = new AbstractEx(); 
//		이렇게 생성 할 수 없음 ... 왜 없을까 클라스라는게 어떤걸을 생성하기위한 틀이자나요
//		이틀이 다 부서져잇는거에여 그걸 무서을 찍어낼수잇스라굥 못찍어낸다 
//		틀제작노
		
//		썜 추상클래스는 생성은 불가능하지만 업캐스팅하여 사용 가능하다.
//		쌤 AbstractEx absEx = new AbstractEx(); 생성 불가능!! xxxx
		
		AbstractExExten absEx = new AbstractExExten();
		AbstractEx2Exten absEx2 = new AbstractEx2Exten();
		
		
		
	}

}
