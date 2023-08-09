package net.daum.dao;

import org.springframework.data.repository.CrudRepository;

import net.daum.vo.BoardVO;

public interface BoardRepository extends CrudRepository<BoardVO, Integer> {
	// <엔티티 빈 클래스명, 엔티티  빈 클래스의 유일 식별키 @Id로 변수명 자료형의 참조타입>
	
	
	
}
