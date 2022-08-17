package com.graphql.learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;

@SpringBootApplication
public class GraphProjectApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;
	public static void main(String[] args) {
		SpringApplication.run(GraphProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Book b1 = new Book();
		b1.setTitle("Complete Reference");
		b1.setDesc("For Learning Java");
		b1.setPages(2000);
		b1.setPrice(5000);
		b1.setAuthor("James Gosling");
		
		Book b2 = new Book();
		b2.setTitle("Advance Java");
		b2.setDesc("JDBC Learning Java");
		b2.setPages(40000);
		b2.setPrice(60000);
		b2.setAuthor("Rod Johnson");
		
		Book b3 = new Book();
		b3.setTitle("Complete Hibernate Reference");
		b3.setDesc("For Hibernate Learing");
		b3.setPages(1000);
		b3.setPrice(3000);
		b3.setAuthor("Gavin King");
		
		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
		
	}

}
