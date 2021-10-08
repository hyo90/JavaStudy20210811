package b18_컬렉션;

import java.util.List;

/**
 * 
 * 컬렉션(collection)
 * java에서의 데이터 관리를 위한 라이브러리.
 * 
 * [종류]
 * list(목록) / ArrayList, LinkedList, Vector, Stack(쌓이다) / 순서가있다.
 * 		: 배열의 형태와 동일함 ex)[10]-> [0...9] 이렇게 10개의 배열을 만듦.. 중간에 값을 빼면 0이겟조 중간값만
 * 		: 중간에 숫자가 빠지면 자동으로 재정렬 해줌 ! ex)[0,1,2,3,(4),5,6,...] -> [0,1,2,3,5,6,7,8,9..] 이런식으로
 * 		: 값을 찾을떄는 list를 쓰는게 좋겟쥬.... 많을때
 * 		: 빠릿빠릿함 데이터를 찾을때
 * 	
 * set(묶음?) / 순서가 없다.
 * 		: 값이 적을떄는 set을 쓰는게 좋겠어유
 * 		: ex)회원가입할떄 많이 쓰는 .. 
 * 		: 중복이 안됨
 * 
 * map(지도) /
 * ex)key(부산)value(부산광역시,자세한 범위)
 * 전체적으로 맵의 동작방식은 List 형식이고
 * key값을 관리하는 것은 Set 형식!
 * key값이 set 형식으로 되면서 중복이 안됨 (유일해야함)
 * key 값으 관리해주는 value값이 따로있음
 * 
 * 
 * Collection = 인터페이스
 * 
 * 
 * * 
 * http://tcpschool.com/java/java_collectionFramework_concept
 * 여기서 내용 한번 보고오세요
 * 
 * Select(조회)할 때 ! 데이터가 많을때 -> List 적을때 -> Set
 * Insert(추가)할 때 ! set이 빠르다.
 * Update(수정)할 때 ! List 수정하려면 찾아야하는데 찾기가 쉬븜
 * Delete(삭제)할 때 ! List가 빠르다
 * 프로그램 만들때 효율성을 보고 만들긔.
 * 
 * vector<E> 스레드를 쓰면 얘를 씀 / 한놈이 들어오면 작업을끝내버림 하나가 끝나기전까지 문을 잠궈서못함 / 싱크로나이즈드 
 * array list 스레드 안쓰면 얘를 씀 / 문닫고 여는시간이 낭비라네요
 * 문열고닫는거빼고는동작방식같음
 *   
 *
 * % 스레드란 (thread)???
 * 		: 메인문안에서 스레드 두개 돌림
 * 		: 소켓통신에 쓰임
 * 		: cpu가 어쩌고 
 * 
 * 
 * 
 * stack : LIFO리포 /  queue enque드러 엘리베이타~!~!~! / deque 나갈 먼저드러온게먼저낙나다 first in first out fifo피포 식당~!~!~!
 *  * 
 */


public class CollectionEx {
//	Collection<E> c = new Collection<E>() { //무명클래스(익명클래스)라고 하는 방식... 지금은 하지않겠따}
	Collection<String> c; //자료형으로 제네릭 설정
	List<String> 1;
}


