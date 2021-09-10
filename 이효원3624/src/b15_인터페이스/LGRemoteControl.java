package b15_인터페이스;

public class LGRemoteControl {
	private Switch powerSwitch = new SwitchImpl();
	private Switch volumeSwitch = new SwitchImpl();
	
	public LGRemoteControl() {
		
	}
	
	
	public void powerSwitchController(int flag) {
		
		if(flag == 1){
			powerSwitch.on();
		}else if (flag == 0) {
			powerSwitch.off();
		}else {
			System.out.println("잘못된 값을 전달받았습니다.");
		}
			
		}
	
	
	public void volumeSwitchController(int flag) {
		
		if(flag == 1){
			volumeSwitch.on();
		}else if (flag == 0) {
			volumeSwitch.off();
		}else {
			System.out.println("잘못된 값을 전달받았습니다.");
		}
			
		}

}
	
	
