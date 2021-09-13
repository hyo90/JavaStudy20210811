package b15_인터페이스;


public class SwitchImpl2 implements Switch {
	@Override
	public void on() {
		System.out.println("전원을 켭니다.");
	}

	@Override
	public void off() {
		System.out.println("전원을 끕니다.");
	}
	

}
