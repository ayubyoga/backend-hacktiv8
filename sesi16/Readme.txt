Spring Web + Thymeleaf

-> Spring Web adalah salah satu projek yang membantu kita untuk membuat sebuah aplikasi web (yang bisa berjalan menggunakan browser) dan Spring Web ini pasti menggunakan 
   annotasi @Controller pada level Controller nya. Sedangkan Thymeleaf adalah sebuah template engine khusus Java tempat kita menuliskan file-file HTML nya sama seperti 
   JSP tapi Thyemeleaf adalah template engine yang paling baru didunia Java. 

-> @GetMapping annotation maps HTTP GET requests onto specific handler methods. It is a composed annotation that acts as a shortcut for @RequestMapping(method = 
   RequestMethod.GET).
-> @RestController is used for creating restful controllers, which do not use a view technology. The methods typically return XML, JSON, or plain text.

Function Depedency:
> Spring Boot DevTools -> Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
> Lombok -> Java annotation library which helps to reduce boilerplate code.
> Spring Web -> Build web, including RESTful, applications using Spring MVC. Use Apache Tomcat as the default embedded container
> Thymeleaf -> A modern-side java template engine for both web and standalone environments. Allow HTML to be correctly displayed in browser and static prototypes.
> Spring Data JPA -> Persist data in SQL stores with java persistence API using Spring Data and Hibernate

Cara jalanin BelajarSpringBoot 
- Dashboard boot
- restart
- open web browser
- http://localhost:8080/
- http://localhost:8080/hello?name=Indirwan

Tambahkan depedency dibawah ini di pom.xml
		<dependency>
			<groupId>org.webjars</groupId>
			<artifactId>bootstrap</artifactId>
			<version>4.2.1</version>
		</dependency>
