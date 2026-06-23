package com.example.myproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myproject.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    // SELECT * FROM COMMENT WHERE BOARD_ID = ?
    List<Comment> findByBoardId(Long boardId);

    void deleteByBoardId(Long boardId);
    // JPA에서 제공하는 기본 메소드 외에 사용자가 메소드 이름을 원하는 형태로 작성하면 JPA에서 그에 맞는 쿼리를 수행
}
