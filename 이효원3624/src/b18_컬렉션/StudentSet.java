package b18_컬렉션;

import java.util.HashSet;
import java.util.Set;



public class StudentSet {

	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		sSet.add(new Student("김준일", 202101));
		sSet.add(new Student("김준일1", 202102));
		sSet.add(new Student("김준일2", 202103));
		
		Iterator ir = sSet.iterator();
//		iterator라는 반복자!
//		흩어져있는 준일이들 순서대로 
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
	}

}
