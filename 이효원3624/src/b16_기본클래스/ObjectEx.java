package b16_�⺻Ŭ����;


// object ��ü
// �ֻ��� ��ü

public class ObjectEx { //extends Object(���) �� ������ �Ǿ�����.. �ֻ��� ��ü�⶧����!
//	Object obj = new Object(); // ������Ʈ Ŭ���� ����
	
	private String className = "ObjectEx";
	
	
	@Override
	public String toString() {
		return className;
	}
	
	@Override
//	�������̵��ϸ鼭 native�����!!!
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
//		obj. <- ġ�� �ƹ��͵� �ȳ��� �׷��ٰ� ������Ʈ�� �ƹ��͵� �������� ? ctrl + object Ŭ���ϸ� ��� �����Ǿ��ִ��� ��!
		Object obj = new Object();
//		ObjectEx oex = new ObjectEx();
	
		
		System.out.println(obj.toString()); //hashCode : �ּҰ� //����� : ���� �����ϰ� �ִ� 
//		System.out.println(oex.); //����� : ���� Ŭ���� �ּ�
//		object �ּҰ� ��ȯ�Ҷ�... toString �ȳ��Ӿ��� �׳� ���� �ּҰ�
		
		 
		ObjectEx oex = new ObjectEx();
		ObjectEx oex2 = new ObjectEx();
		System.out.println(oex);
		
		String str1 = "������"; //�������ͷ���...����
		String str2 = "������";
		String str3 = new String("������");		
		
		
		
		/* toString() �޼ҵ�
		 * 
		 *  String[] toStringArray = new String[10];
		
		for(int i = 0; i < toStringArray.length; i++) {
			Student s1 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1, 20210001, "�λ� ������", "010-9988-1916");
			toStringArray[i] = s1.toString();
		}
		*/
		/* for each�� �� �� ����
		for(String s : toStringArray) {
			Student s1 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1, 20210001, "�λ� ������", "010-9988-1916");
			s = s1.toString();
		*/
		/*		
		for(String s : toStringArray) {
			System.out.println(s);
		}
		*/
		
		
		System.out.println(oex.equals(oex2));
		
		System.out.println(str1 + str2 + str3);
		
		System.out.println(str1.equals(str2)); //obj�� oex ���� ���ڿ���~~!!!~!~!~!~
		System.out.println(str1 == str2); //str1 == str2 ���� ???????????
		
		System.out.println(str1.equals(str3)); //���ڿ��� ���
		System.out.println(str1 == str3); //�ּҰ��� ���ͷ��� �� //���� ������ �ּ� �� !! //�������ּ�
		
//		���� �ּ� or �̴� : ����Ʈ�������� � ������ �̷�����ִ� / ��ȣ���� ����
//		������ : �ϵ���� �ּ� �����..
//		equlas�� ��ü == ��ü ������ �ּ� �� 
		
		Student s1 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1, 20210001, "�λ� ������", "010-9988-1916");
		Student s2 = new Student("������", "�ڸ��ƾ���Ƽ��ī����", 1, 1, 1, 20210001, "�λ� ������", "010-9988-1916");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1 == s2);
	
	}
	


}
