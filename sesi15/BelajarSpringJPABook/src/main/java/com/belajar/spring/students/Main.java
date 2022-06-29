package com.belajar.spring.students;

import java.util.Arrays;
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
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = new Student("Ayub Yoga Pratama", 25);
		studentRepository.save(student);

		Course course1 = new Course("Komputasi Meteorologi", 12, 1500);
		Course course2 = new Course("Instrumentasi Meteorologi", 8, 800);
		Course course3 = new Course("Pemodelan Meteorologi", 9, 100);

		courseRepository.saveAll(Arrays.asList(course1, course2, course3));

		student.getCourses().addAll(Arrays.asList(course1, course2, course3));

		studentRepository.save(student);

		logger.log(Level.INFO, "Courses : " + student.getCourses());

	}

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
