package b17_제네릭;

/**
 * class에 매개변수가있다 = generic
 * 
 * Generic(제네릭)
 * 클래스 내부의 자료형을 원하는 형태로 지정할 수 있다.
 * 굳이 형변환을 하지않아도 됨 
 *
 */

public class GenericEx<T> { //<T>자료형입력!
	T generic; 
	public T getGeneric(T t) { //"public stduent getstudent()라고했을떄 자료형은 Student! .. 대신 다른 자료형이 들어올 수 있도록 어딘가에서 생성할때 자료형 정의하도록.
		T t2 = t;
		return t2;
		
	}
	
	public static void main(String[] args) {
		GenericEx<String> gex = new GenericEx<String>();
		String str = gex.getGeneric("김준일");
		
		GenericEx<Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
		System.out.println(num1);
		
		
		
	}
	

	


}


//다음시간에 컬렉션 리스트셋넥?이잇서염
//컴터공학에서 자료형구조에 대해말하는거당
//네엥
//