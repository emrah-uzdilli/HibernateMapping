package com.emrah.HibernateMapping;

import com.emrah.HibernateMapping.entity.Comment;
import com.emrah.HibernateMapping.entity.Post;
import com.emrah.HibernateMapping.entity.Post1;
import com.emrah.HibernateMapping.entity.Tag;
import com.emrah.HibernateMapping.repository.Post1Repository;
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
	@Autowired
	private Post1Repository post1Repository;
	@Override
	public void run(String... args) throws Exception {

		//ONETOMANY MAPPING EXMPLE
		Post post = new Post("one to mapping using JPA and Hibernate","one to mapping using JPA and Hibernate");
		Comment comment1 = new Comment("It was nice");
		Comment comment2 = new Comment("It is hard for me ");
		Comment comment3 = new Comment("Great POST ");

		post.getComments().add(comment1);
		post.getComments().add(comment2);
		post.getComments().add(comment3);

		this.postRepository.save(post);

		//MANYTOMANY MAPPING EXAMPLE
		Post1 post1 = new Post1(" example Many to Many Mapping with Spring boot"," example Many to Many Mapping with Spring boot"," example Many to Many Mapping with Spring boot");

		Tag springBoot = new Tag("SpringBOOT");
		Tag hibernate = new Tag("Hibernate");

		post1.getTags().add(springBoot);
		post1.getTags().add(hibernate);

		this.post1Repository.save(post1);



	}
}
