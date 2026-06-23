package com.example.myproject.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long commentId;
    private String writer;
    private String content;
    @CreationTimestamp
    private LocalDateTime createdAt;
    // boardId는 외래키
    // 하지만 JPA에서 따로 정의하지 않았기 때문에 테이블에 외래키로 제약 조건이 생성되지 않음
    private Long boardId;
}
