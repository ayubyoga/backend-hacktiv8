package com.belajar.spring.book;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

	Logger logger = Logger.getLogger(Main.class.getName());

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Book book1 = new Book();
		book1.setTitle("Belajar Spring Boot 1");
		book1.setWriter("Wilson aja");
		book1.setIsbn("IS-909190");

		Book book2 = new Book();
		book2.setTitle("Belajar Spring Boot 2");
		book2.setWriter("Kevin");
		book2.setIsbn("IS-909089");

		Book book3 = new Book();
		book3.setTitle("Belajar Spring Boot 3");
		book3.setWriter("Jackson");
		book3.setIsbn("IS-351089");

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);

		
		final String title = "Belajar Spring Boot 1";
		List<Book> byTitle = bookRepository.findByTitle(title);
		logger.log(Level.INFO, "Title : " + byTitle);


		List<Book> books = bookRepository.findAll();
		logger.log(Level.INFO, "Books : " + books);


		final String writer = "Wilson aja";
		List<Book> byWriter = bookRepository.findAllByWriter(writer);
		logger.log(Level.INFO, "Writer : " + byWriter);


		final String isbn = "IS-909089";
		List<Book> byIsbn = bookRepository.findByIsbn(isbn);
		logger.log(Level.INFO, "ISBN : " + byIsbn);


		List<Book> nativeBooksQuery = bookRepository.findAllQueryNative();
		logger.log(Level.INFO, "Book by native query : " + nativeBooksQuery);


		final String nativeWriter = "Kevin";
		List<Book> byNativeWriter = bookRepository.findAllByWriterQueryNative(nativeWriter);
		logger.log(Level.INFO, "Writer by native query : " + byNativeWriter);


		BookCategory bookCategory = bookCategoryRepository.save(
				new BookCategory("Programming",
				new Book("Java 1", "Teten N.", "SEI92002"), 
				new Book("Java 2", "Teten N.", "UEOEI829"))
		);
		logger.log(Level.INFO, "bookCategory : " + bookCategory);
	}

}
