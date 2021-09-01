package practice;

public class B10_class_computerTest {
	
	public static void main(String[] args) {
		
		Resit Dios = new Flo();
		Flo Bespoke = new Flo();
		Flo Rucoms = new Flo();
		

		
		Dios.setMaker("LG");
		Dios.setModel("디오스");
		Dios.setColor("회색");
		Dios.setDoor("양문형");
		Dios.setYear(2021);
		
		Bespoke.setMaker("SAMSUNG");
		Bespoke.setModel("BESPOKE_RQ32A7602AP");
		Bespoke.setColor("검은색");
		Bespoke.setDoor("1도어");
		Bespoke.setYear(2021);
		
		Rucoms.setMaker("대우");
		Rucoms.setModel("루컴즈_R161m1");
		Rucoms.setColor("흰색");
		Rucoms.setDoor("4도어");
		Rucoms.setYear(2019);
		
		Dios.FloInfo();
		Bespoke.FloInfo();
		Rucoms.FloInfo();
		
		
	}

}
