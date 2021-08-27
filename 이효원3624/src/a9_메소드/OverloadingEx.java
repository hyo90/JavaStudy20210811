package a9_메소드;

public class OverloadingEx {//이걸 메인문이라고 생각하고 만듦 이거시 오버로딩
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add(String num1, int num2) {
		int result = Integer.parseInt(num1) + num2;
		return result;
	}
	
	public int add(int num1) {
		int result = num1 + num1;
		return result;
	}
	
	
	public int mu1(int num1, int num2) {
		int result = num1 * num2 ;
		return result;
		
	}
	
	public double add(int num1, double num2) { //num 1 int num2  doubl
		double result = num1 + num2; //double -> int 명시해서 
		return result;
	}

	
	
	
	
	
	
	
	
	
	
	
//	 이렇게 배우면 c언어랑 다를게엄다
//	객체지향언어를 배우자a_a_a_a_A_a_a_a_A_A_A_A-a-a-a-a-a--a-a_A-a_a_Aa-a_A_A-a(*A_
//	 string -> double -> int -> char

	public void mainMethod() {
		int numberSum = add(20);
		double numbermu1 = mu1(2, 10.5); //변환을 double로 받아야하는데 
		System.out.println("두 수의 합은? " + numberSum);
		System.out.println("곱셈 : " + numbermu1);
		
//		 값이 문자면 밑에껄로 int면 위에걸로 결과값 출력됨
//		이름은 같고 매개변수의 자료형이 다를떄는 다시 정의할떄 가능
//		public void는 결과값?
//		public int 외 변수입력?
	}

//	주고받고하는 자료형이 같으면 메인변수를 바꾸고
//	자료형이 다르면 넘버달라도 ㅇㅋㅇㅋ
	public int add2(int num1, int num2) { //메서드는 같은 변수로 정의하면 안됨 //메인?변수명을 수정해주면 괜찮아짐
		int result = num1 + num2;
		return result;
	}
	
	
	
//	overloading이란 같은 사람인데 한 사람이 다른동작을 하는 것
	
// static 유무 차이	
//	이거 없다고 생각하고 위에 클래스에서 메인문 만듦!! (static void)
	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx(); //메소드 하는동안 잠ㅅ ㅣ씀
		main.mainMethod();
		
		
		
		
		
	}

}
