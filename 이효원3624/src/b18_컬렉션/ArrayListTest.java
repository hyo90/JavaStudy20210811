package b18_�÷���;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import java.util.LinkedList;


public class ArrayListTest {

	public static void main(String[] args) {
//		 + ctrl + space import ���ֱ� List<String> import 1 ArrayList<String> import 2
		List<String> arrayList = new ArrayList<String>(); //��ĳ����
//		List<Studen>��� ������ �л��̶�� ����Ʈ�� ����� ..
//		arrayList = new LinkedList<String>();
//		arrayList = new Vector()<String>();
//		arrayList = new Stack() <String>();
		
		arrayList.add("java"); //0
		arrayList.add("c"); //1
		arrayList.add("python"); //2
		
//		�ι�° ���� ����͵��
		System.out.println(arrayList.get(1));
		
//		 length�� �迭�̰�  size�� �������!!!!!!!!!!!!
		for( int i = 0 ; i < arrayList.size() ; i++) {
			System.out.println(arrayList.get(i));
		}
		
//		������� ��		
		for(String str : arrayList )
		System.out.println(str);

//		�����ϴ� ���� ��ȯ����
		System.out.println(arrayList.remove(0)); 
		
//		���� �����غ����
		arrayList.remove(0);
		System.out.println(arrayList);

	}

}
