package a5_연산자;

public class Operation1 {

	public static void main(String[] args) {
//		증감 연산자 (증가, 감소 연산자)
//		++score 지금 증가
//		score++다음연산자에적용해죠
//		이거 많이 쓸꺼임 ㅠㅠ
		
		int score = 85;
		
		score = score - 1;
		score -= 1;
		
		System.out.println(score);
//		선증가 연산자
		System.out.println(++score);
//		후증가 연산자
		System.out.println(score++);
		System.out.println(score);
		System.out.println(++score);
		
//		선감소 연산자
		System.out.println(--score);
//		후감소 연산자
		System.out.println(score--);
		System.out.println(score);
		
	}

}

