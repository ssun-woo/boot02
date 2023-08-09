package net.daum;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import net.daum.dao.BoardRepository;
import net.daum.vo.BoardVO;

@RunWith(SpringRunner.class)	// 자동 import가 안되기 때문에 마우스를 올려서 라이브러리 추가를 눌러야함
@SpringBootTest
public class BoardRepositoryTests {
	
	@Autowired	// 자동의존성 주입 (@Inject는 boot에서는 사용 불가능)
	private BoardRepository boardRepo;
	
	@Test
	public void testInsertBoard() {
		BoardVO vo = new BoardVO();
		
		vo.setWriter("홍길동");
		vo.setTitle("게시판 제목입니다");
		vo.setContent("게시판 내용입니다");
		
		// boardRepo.save(vo);	// 게시판 저장
		// junit 테스트를 실행시키고 이후에 sqldeveloper에서 select문을 사용해서 확인 
		
	}// 게시판에 자료저장(tbl_boards2 테이블)
	
	
	@Test
	public void testReadBoard() {
		/*
		Optional<BoardVO> b = boardRepo.findById(2);	// 2번 레코드 검색
		System.out.println(b);	// .toString()메서드 생략가능함
		*/
	}// 게시판 읽기
	
	
	@Test
	public void testUpdateBoard() {
		/*Optional<BoardVO> eb = boardRepo.findById(2);	// 2번 레코드를 검색해서
		
		eb.ifPresent(ebBoard -> {
			ebBoard.setWriter("수정홍길동");
			ebBoard.setTitle("수정 제목");
			ebBoard.setContent("수정 내용");
		
			System.out.println("2번 레코드의 작성자, 제목, 내용을 수정 =>");
			boardRepo.save(ebBoard);	// 게시판을 수정하고 수정된 레코드값을 다시 검색
		});
		*/
	} // 게시판 수정
	
	
	@Test
	public void testDeleteBoard() {
		System.out.println("JPA Entitiy 레코드 삭제");
		boardRepo.deleteById(1);
	}
	
}


























