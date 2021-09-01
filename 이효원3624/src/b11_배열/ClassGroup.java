package b11_배열;

public class ClassGroup {
	
	private int student_count = 0;
	private Student[] students;
	private Desk[] desks;
	
//	생성자 생성
//	학생의 정보를 담을 수 있는 구조로
//	공간이 생긴것 ! 배열은 텅빈 공간
	public ClassGroup(int count) { //입력한 숫자만큼 등록 0부터시작~!~!무조건
		students = new Student[count];
		desks = new Desk[count];
	}
	public void addStudent(String student_name) { //학생추가
		desks[student_count] = new Desk(202100 + student_count, "desker");
		students[student_count] = new Student((student_count++) + 20210000, student_name);
	}
	public void classInfo(int student_code) {
		int student_num = 0;
		
	
		for(int i = 0; i < students.length; i++) { //students.length 이 배열의 갯수를 반환함 렝스는 0부터 시작하지않음 1부터 시작 
			if(students[i].getStudent_code() == student_code) {
				student_num = i;
				break;
			
		}

		
			
		}
		
		students[student_num].showInfo();
		desks[student_num].showInfo();
	
		
	}}
	
		
		
	

