package b18_컬렉션;

import java.util.List;
import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		List<Student> sList = new ArrayList<Student>(); //Student를 담을 수 있는 List
		
		for(int i = 0 ; i < 10 ; i++) {
			sList.add(new Student("김준일" + i, 202100 + i)); // 데이터베이스에서 가져와야함 !!! 
		}

		for(Student s : sList) {
			System.out.println(s);
		}
		
//		System.out.println(sList);
	
		Student s = sList.remove(3);
		System.out.println(s);
	
	}
	
}

// 상당히 많이 쓸꺼임
// 데이터베이스할떄

	
	
