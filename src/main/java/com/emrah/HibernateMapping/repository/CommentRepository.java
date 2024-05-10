package com.emrah.HibernateMapping.repository;

import com.emrah.HibernateMapping.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment,Long> {
}
