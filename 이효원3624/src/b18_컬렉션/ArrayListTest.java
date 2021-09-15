package b18_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.LinkedList;


public class ArrayListTest {

	public static void main(String[] args) {
//		 + ctrl + space import 해주기 List<String> import 1 ArrayList<String> import 2
		List<String> arrayList = new ArrayList<String>(); //업캐스팅
//		List<Studen>라고 넣으면 학새이라는 리스트를 만드는 ..
//		arrayList = new LinkedList<String>();
//		arrayList = new Vector()<String>();
//		arrayList = new Stack() <String>();
		
		arrayList.add("java"); //0
		arrayList.add("c"); //1
		arrayList.add("python"); //2
		
//		두번째 값을 뺴고싶드아
		System.out.println(arrayList.get(1));
		
//		 length는 배열이고  size를 써줘야함!!!!!!!!!!!!
		for( int i = 0 ; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));
		}
		
//		순서대로 들어감		
		for(String str : arrayList )
		System.out.println(str);

//		삭제하는 값을 반환해줌
		System.out.println(arrayList.remove(0)); 
		
//		값을 삭제해볼까요
		arrayList.remove(0);
		System.out.println(arrayList);

	}

}
