package b18_�÷���;

import java.util.HashSet;
import java.util.Set;



public class StudentSet {

	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<Student>();
		
		sSet.add(new Student("������", 202101));
		sSet.add(new Student("������1", 202102));
		sSet.add(new Student("������2", 202103));
		
		Iterator ir = sSet.iterator();
//		iterator��� �ݺ���!
//		������ִ� �����̵� ������� 
		
		while(ir.hasNext()){
			System.out.println(ir.next());
		}
		
	}

}
