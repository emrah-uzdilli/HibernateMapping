package com.emrah.HibernateMapping.repository;

import com.emrah.HibernateMapping.entity.Post;
import com.emrah.HibernateMapping.entity.Post1;
import com.emrah.HibernateMapping.entity.Tag;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TagRepository extends JpaRepository<Tag,Long> {
}
