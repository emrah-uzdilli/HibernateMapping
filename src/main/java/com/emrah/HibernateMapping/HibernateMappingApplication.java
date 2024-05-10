package com.emrah.HibernateMapping;

import com.emrah.HibernateMapping.entity.Comment;
import com.emrah.HibernateMapping.entity.Post;
import com.emrah.HibernateMapping.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HibernateMappingApplication.class, args);
	}

	@Autowired
	private PostRepository postRepository;
	@Override
	public void run(String... args) throws Exception {
		Post post = new Post("one to mapping using JPA and Hibernate","one to mapping using JPA and Hibernate");
		Comment comment1 = new Comment("It was nice");
		Comment comment2 = new Comment("It is hard for me ");
		Comment comment3 = new Comment("Great POST ");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);
	}
}
