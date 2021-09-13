package b16_기본클래스;


// object 객체
// 최상위 객체

public class ObjectEx { //extends Object(상속) 가 생략이 되어있음.. 최상위 객체기때무네!
//	Object obj = new Object(); // 오브젝트 클래스 생성
	
	private String className = "ObjectEx";
	
	
	@Override
	public String toString() {
		return className;
	}
	
	@Override
//	오버라이드하면서 native사라짐!!!
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100; 
	}
	
//	@Override
//		public boolean equals(Object obj) {
//			// TODO Auto-generated method stub
//			return super.equals(obj);
//		}
	
	
	public static void main(String[] args) {
//		obj. <- 치면 아무것도 안나옴 그렇다고 오브젝트에 아무것도 엄슬가요 ? ctrl + object 클릭하면 어떻게 구성되어있는지 뜸!
		Object obj = new Object();
//		ObjectEx oex = new ObjectEx();
	
		
		System.out.println(obj.toString()); //hashCode : 주소값 //결과값 : 내가 존재하고 있는 
//		System.out.println(oex.); //결과값 : 현재 클래스 주소
//		object 주소값 반환할때... toString 안나왓엇음 그냥 리얼 주소값
		
		 
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex);
		
		String str1 = "김준일"; //같은리터럴값...ㅎㅎ
		String str2 = "김준일";
		String str3 = new String("김준일");		
		
		
		
		/* toString() 메소드
		 * 
		 *  String[] toStringArray = new String[10];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1, 20210001, "부산 동래구", "010-9988-1916");
			toStringArray[i] = s1.toString();
		}
		*/
		/* for each는 쓸 수 없음
		for(String s : toStringArray) {
			Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1, 20210001, "부산 동래구", "010-9988-1916");
			s = s1.toString();
		*/
		/*		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		
		System.out.println(oex.equals(oex2));
		
		System.out.println(str1 + str2 + str3);
		
		System.out.println(str1.equals(str2)); //obj와 oex 같냐 문자열비교~~!!!~!~!~!~
		System.out.println(str1 == str2); //str1 == str2 같니 ???????????
		
		System.out.println(str1.equals(str3)); //문자열을 비겨
		System.out.println(str1 == str3); //주소값비교 리터럴값 비교 //논리적 물리적 주소 비교 !! //물리적주소
		
//		논리적 주소 or 이다 : 소프트웨어적인 어떤 값으로 이루어져있는 / 신호값에 대한
//		물리적 : 하드웨어 주소 기계적..
//		equlas는 객체 == 객체 물리적 주소 비교 
		
		Student s1 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1, 20210001, "부산 동래구", "010-9988-1916");
		Student s2 = new Student("김준일", "코리아아이티아카데미", 1, 1, 1, 20210001, "부산 동래구", "010-9988-1916");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	
	}
	


}
