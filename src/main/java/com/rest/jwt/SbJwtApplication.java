package com.rest.jwt;

import com.rest.jwt.entity.BookEntity;
import com.rest.jwt.repo.BookRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbJwtApplication implements CommandLineRunner {

	private BookRepo bookRepo;
	public static void main(String[] args) {
		SpringApplication.run(SbJwtApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		BookEntity book = new BookEntity(1234L,"MahaBharatha","VedaVyasa","5000BC",9876.0);
		BookEntity book1 = new BookEntity(7575L,"SriBhavadgitha","SriKrishna","5000BC",9876.0);
				   bookRepo.save(book);
				   bookRepo.save(book1);
	}
}
