package com.emrah.HibernateMapping.repository;

import com.emrah.HibernateMapping.entity.Post;
import com.emrah.HibernateMapping.entity.Post1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Post1Repository extends JpaRepository<Post1,Long> {
}
