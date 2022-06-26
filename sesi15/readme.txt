Dynamic web module 5
Target runtuime ->new -> apache v10-> centang create->next -> download & install/ browse apache-> pilih jre jdk 17


================================================

Start Project
Klik kanan
New Project -> Other -> SpringBoot -> Spring Starter Project
Name: BelajarSpringJPABook
Group: com.belajar.spring
Package: com.belajar.spring
Next

=Depedency=
Frequently Used:
- MySQL Driver
- Spring Boot DevTools
- Spring Data JPA
- Spring Web
Next, Finish


<dependency> put in application.properties
#MySQL Connection
spring.datasource.url=jdbc:mysql://localhost:3306/h8_book?useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

#HikariCP
spring.datasource.hikari.connection-timeout=20000
spring.datasource.hikari.minimum-idle=5
spring.datasource.hikari.maximum-pool-size=12
spring.datasource.hikari.idle-timeout=300000
spring.datasource.hikari.max-lifetime=12000
spring.datasource.hikari.auto-commit=true
	
#JPA Properties
spring.jpa.database-platform=org.hibernate.dialect.MySQL5Dialect
spring.jpa.hibernate.ddl-auto=update


=Meaning=

@SpringBootApplication is a convenience annotation that adds all of the following:

-> @Configuration: Tags the class as a source of bean definitions for the application context.

-> @EnableAutoConfiguration: Tells Spring Boot to start adding beans based on classpath settings, other beans, and various property settings.

-> @EnableWebMvc: Flags the application as a web application and activates key behaviors, such as setting up a DispatcherServlet. Spring Boot adds it automatically
   when it sees spring-webmvc on the classpath.

-> @ComponentScan: Tells Spring to look for other components, configurations, and services in the the com.example.testingweb package, letting it find the
   HelloController class.

==============================
Penjelasan dari class Book di file Book,java

-> @Entity		: merepresentasikan bahwa class tersebut adalah sebuah entitas, yang nantinya akan ada sebuah Tabel di database dengan nama Book
-> @Id 		: menunjukan bahwa variable itu adalah sebuah ID atau Primary Key dari suatu table. Penggunaan @Id di Spring Data JPA sangat lah mandatory /wajib. 			  Setiap class yang diberi annotasi @Entity harus mempunyai @Id.
-> @GeneratedValue: sebuah mekanisme dalam memberikan nilai. Karena disini menggunakan strategy = GenerationType.IDENTITY yang artinya nilai akan diberikan secara 			  increment atau fungsi nya sama dengan AUTO_INCREMENT pada sebuah table. 
-> @Column(nullable = false) : Memberikan info bahwa variable tersebut yang akan menjadi kolom di table Book, tidak boleh null atau not null.

