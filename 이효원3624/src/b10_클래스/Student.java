package b10_Ŭ����;

public class Student {

	private String name;//�⺻���� �ƴ��̻� ������Ѵ� //studentTest���� �ȶ� .. private�ٿ���
	private String schoolName;
	private int year; //�г� 

	public Student() { // <- �ƹ��͵� ���� �̰� �⺻������   
// public ����
//	private Ŭ������
// ���������� ���Ǵ� private(���� Ŭ���� ��)
// private & public 
				}

	
	
	
//	�����ε��ҋ� �⺻������ �־����.
//	�����ε������� ����̝��� ��������!!	
//	/�� ���� �����Ǿ��ִ�. ������ �����ε������� �⺻������ ����� �����Ҽ����Ե�(studentTest)����!!
	
	
	public Student(String n, int y) { //ctrl+space c�ڵ�پ��ִ� student �����ڰ� �䤻�� 
		name = n;
		year = y;
	}
	
	public Student(String name, String schoolName, int year) {//�Ű�������
		super(); //��� ����
		
		this.name = name + " �л�" ;  
		this.schoolName = schoolName;//this - �� �ڽ� ���� �ִ� ��ġ this + ctrl + space ~!~!~!
		this.year = year;
		this.showInfo();
//		�������� ����� �����ϱ� (������)
//		this�� �ڽ�(Ŭ����)�� ������ �������� = �޼ҵ� �ڽ�(�Ű������� �ִ�)
//		�ν��Ͻ� ������ �̸��� ���� ������ �̸��� ���� ��� �ν��Ͻ� ���� �տ� this Ű���带 ����Ͽ� ������ �� �־����ϴ�.
	}
	
	public void setName(String name) {//~�л��� �Ǹ��� �����ּ��� �ϸ�
//		�Ű����� string����?????? 
//		setter = set+������(ù���ڴ빮��) 
		
		this.name = name + " �л�";		
		System.out.println(this.name);
		
	}
	
	
	public String getName() {//�Ű������¾��� ���� �� Ŭ�������� �ڷḦ ���������ϱ�
		return name; //���� this �� �ٿ��� �� �޼ҵ� ���� �� �ٸ� name�� �����ϱ�
		
	}
	
//	source - generate getters and setters ���� !! 
//	�⺻�� private���� �����... ������ ��ȣ�� ���ؼ�
//	������ ��ȣ�� ���ؼ�.. 1.������  2.getters and setters
	
	
	
	public String getSchoolName() {
		return schoolName;
	}


	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}

	public void getFreebies() {
		Regular regular = new Regular();
		
		regular.setYearCheck(year, schoolName);
		
		
		if(regular.setYearCheck()) {
			System.out.println("����ǰ �����");
		}else {
			System.out.println("����� ����");
		}
	}
	
	

	public void showInfo () {//
		System.out.println("�л� ���� : ");
		System.out.println("�̸� : " + name);
		System.out.println("�б� : " + schoolName);
		System.out.println("�г� : " + year);
	}
}

//�̰Ž� Ʋ�̴� �̰ɷ� ���������ϰٴ�




