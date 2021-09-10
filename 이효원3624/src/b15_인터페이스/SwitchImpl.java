// 클래스명 끝에 Impl 붙이긔!

package b15_인터페이스;

public class SwitchImpl implements Switch { //상속처럼 implements 적어줘!떠니 SwitchImpl에 빨간줄.. 그래서 ㅇ오버라이드 해주믄됨
//	shift + alt + s 

	@Override
	public void on() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("전원을 끕니다.");
	}
	
	
	

}
