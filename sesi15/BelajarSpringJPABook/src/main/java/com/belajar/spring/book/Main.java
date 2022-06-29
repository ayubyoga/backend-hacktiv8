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
		book1.setTitle("Meteorologi Satelit");
		book1.setWriter("Hadley dkk");
		book1.setIsbn("ISBN-200203044");

		Book book2 = new Book();
		book2.setTitle("Fundamental Meteorologi");
		book2.setWriter("Tri Harsoni");
		book2.setIsbn("ISBN-200203045");

		Book book3 = new Book();
		book3.setTitle("Instrumen Komponen Meteo");
		book3.setWriter("Plato MS");
		book3.setIsbn("ISBN-200203046");

		bookRepository.save(book1);
		bookRepository.save(book2);
		bookRepository.save(book3);

		final String title = "Meteorologi Satelit";
		List<Book> byTitle = bookRepository.findByTitle(title);
		logger.log(Level.INFO, "Title : " + byTitle);

		List<Book> books = bookRepository.findAll();
		logger.log(Level.INFO, "Books : " + books);

		final String writer = "Hadley dkk";
		List<Book> byWriter = bookRepository.findAllByWriter(writer);
		logger.log(Level.INFO, "Writer : " + byWriter);

		final String isbn = "ISBN-200203044";
		List<Book> byIsbn = bookRepository.findByIsbn(isbn);
		logger.log(Level.INFO, "ISBN : " + byIsbn);

		List<Book> nativeBooksQuery = bookRepository.findAllQueryNative();
		logger.log(Level.INFO, "Book by native query : " + nativeBooksQuery);

		final String nativeWriter = "Tri Harsoni";
		List<Book> byNativeWriter = bookRepository.findAllByWriterQueryNative(nativeWriter);
		logger.log(Level.INFO, "Writer by native query : " + byNativeWriter);

		BookCategory bookCategory = bookCategoryRepository.save(
				new BookCategory("Instrumen Komponen Meteo",
						new Book("Meteo Model 1", "Plato MS", "ISBN-200203049"),
						new Book("Analisa Data Meteo 3", "Plato MS", "ISBN-200203051")));
		logger.log(Level.INFO, "bookCategory : " + bookCategory);
	}

}
