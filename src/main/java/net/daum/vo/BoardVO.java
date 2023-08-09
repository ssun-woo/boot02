package net.daum.vo;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter		// getter() 메서드 자동생성
@Setter		// setter() 메서드 자동생성
@ToString	// toString() 메서드 자동 생성
@Entity		// JPA(Java Persistence API)를 다루는 엔티티 빈 클래스
@SequenceGenerator(	// @SequenceGenerator는 시퀀스 생성기를 설정하는 어노테이션
		name = "bno_seq2_gename",	// 시퀀스 제너레이터 이름
		sequenceName = "bno_seq2", // 시퀀스 이름
		initialValue = 1,		// 시퀀스 시작
		allocationSize = 1		// 증가 값(기본값이 50, 1씩증가하도록 설정)
		)
@Table(name="tbl_boards2")	//tbl_boards2라는 테이블 생성
public class BoardVO {	// 데이터 저장빈 엔티티 빈 클래스 -> SQL문을 생성하고 테이블 만들고, 시퀀스를 생성
	
	@Id	// 기본키 컬럼 => 유일 식별키
	@GeneratedValue(
		strategy = GenerationType.SEQUENCE, 	// 사용할 전략을 시퀀스로 선택
		generator = "bno_seq2_gename"
	)
	private int bno;	// 게시판 번호
	private String writer;	// 작성자
	private String title;	// 제목
	private String content; // 내용
	
	@CreationTimestamp	// 하이버네이트의 특별한 기능으로, 게시물 등록시점 날짜값을 기록
	private Timestamp regdate;	// 등록날짜(sql 관련으로 import해줘야함)
	
	@UpdateTimestamp	// 하이버네이트의 특별한 기능으로, 게시물 수정시점 날짜값을 기록
	private Timestamp udatedate;
	
	
}
































