package b17_���׸�;

/**
 * class�� �Ű��������ִ� = generic
 * 
 * Generic(���׸�)
 * Ŭ���� ������ �ڷ����� ���ϴ� ���·� ������ �� �ִ�.
 * ���� ����ȯ�� �����ʾƵ� �� 
 *
 */

public class GenericEx<T> { //<T>�ڷ����Է�!
	T generic; 
	public T getGeneric(T t) { //"public stduent getstudent()��������� �ڷ����� Student! .. ��� �ٸ� �ڷ����� ���� �� �ֵ��� ��򰡿��� �����Ҷ� �ڷ��� �����ϵ���.
		T t2 = t;
		return t2;
		
	}
	
	public static void main(String[] args) {
		GenericEx<String> gex = new GenericEx<String>();
		String str = gex.getGeneric("������");
		
		GenericEx<Integer> gex2 = new GenericEx<Integer>();
		Integer num1 = gex2.getGeneric(100);
		
		System.out.println(str);
		System.out.println(num1);
		
		
		
	}
	

	


}


//�����ð��� �÷��� ����Ʈ�³�?���ռ���
//���Ͱ��п��� �ڷ��������� ���ظ��ϴ°Ŵ�
//�׿�
//