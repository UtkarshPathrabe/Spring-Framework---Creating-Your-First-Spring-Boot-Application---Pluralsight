Spring Framework: Creating Your First Spring Boot Application  
=============================================================  

Q01. What is the command to run a Spring Boot application using a standalone JAR file?  
A. `mvn spring-boot-app.jar`  
B. `./spring-boot-app.jar`  
C. You cannot run the app with a standalone JAR file  
D. `java -jar spring-boot-app.jar`  
Answer: `java -jar spring-boot-app.jar`  

Q02. How do you run or start a Spring Boot application?  
A. Spring Boot only runs in cloud environments  
B. Applications can only be run by deploying to a Tomcat container  
C. Applications run as a plain Java program using a static void main class from a standalone JAR  
D. Applications run in the browser using the JavaScript CLI tools  
Answer: `Applications run as a plain Java program using a static void main class from a standalone JAR`  

Q03. What makes Spring Boot an opinionated framework?  
A. Spring Boot forces the use of ReactJS for UI building  
B. Spring Boot forces architectural paradigms like MVC to be used in your application  
C. Spring Boot prefers Spring Frameworks and auto-wires them up automatically  
D. Spring Boot prefers XML and requires the use of Spring MVC to run  
Answer: `Spring Boot prefers Spring Frameworks and auto-wires them up automatically`  

Q04. When you use a Maven-based Spring Boot generated app, where does the Java source code live?  
A. target  
B. src/main/resources  
C. src/java  
D. src/main/java  
Answer: `src/main/java`  

Q05. What do Spring Boot starters do?  
A. Starters allow Spring Boot to be run as a standalone application, making the framework "containerless"  
B. Starters automatically configure correctly versioned Spring frameworks and integrate them into your application  
C. Starters are a set of detailed tutorials that demo and show you exactly how to start working with Spring Boot  
D. Starters automatically set up environment variable configuration for your production deployments  
Answer: `Starters automatically configure correctly versioned Spring frameworks and integrate them into your application`  

Q06. Where would you override the default JDBC URL connection string to connect to a database?  
A. pom.xml  
B. HomeController.java  
C. application.properties  
D. In the "public static void main" bootstrap class  
Answer: `application.properties`  

Q07. How can you enable JPA and Repositories in Spring Boot?  
A. Add the `spring-boot-starter-web` dependency  
B. Add the `spring-boot-starter-data-jpa` dependency  
C. Add and configure an application.yml file  
D. Create @Entity models and Spring Boot will recognize them  
Answer: ```Add the `spring-boot-starter-data-jpa` dependency```  

Q08. What configuration file type does Spring Boot support other than basic Java property files?  
A. Bash  
B. Groovy  
C. JSON  
D. YAML  
Answer: `YAML`  

Q09. What annotation is needed to create custom Java configurations in Spring Boot?  
A. @SpringBootApplication  
B. @AutoConfiguration  
C. @Configuration  
D. @Bean  
Answer: `@Configuration`  

Q10. What changes need to be made to get Spring Boot to work as a WAR file?  
A. Set package type to WAR and add the `spring-boot-start-war` dependency  
B. Replace the @SpringBootApplication with @SpringBootWarApplication and extend SpringBootServletInitializer  
C. Exclude the embedded container, set package type to WAR and extend SpringBootServletInitializer  
D. Add an @Configuration file and set the package type to WAR  
Answer: `Exclude the embedded container, set package type to WAR and extend SpringBootServletInitializer`  

Q11. How can you switch out the default Tomcat embedded container?  
A. Set the embedded container type property in the application.properties file  
B. Exclude the `tomcat` dependency and add the new embedded container starter in the pom.xml  
C. Switch from a Maven-based project to a Gradle-based project  
D. Add a spring profile called Jetty and enable the profile  
Answer: ```Exclude the `tomcat` dependency and add the new embedded container starter in the pom.xml```  

Q12. What are two ways you can create a Spring Boot application from scratch?  
A. Maven initializer and the gradle initializer  
B. Java generator and Eclipse IDE  
C. Web Initializer and the Spring Boot CLI  
D. Copying Spring Boot source code and using the Spring Boot tutorial helper  
Answer: `Web Initializer and the Spring Boot CLI`  

Q13. What JPA provider does Spring Data JPA use by default when added to a Spring Boot application?  
A. Hibernate  
B. Oracle JPA  
C. Core Java  
D. Open JPA  
Answer: `Hibernate`  

Q14. What are two valid external configuration strategies you can use with Spring Boot?  
A. Servlet parameters and Docker files  
B. Maven and cloud variables  
C. Environment variables and JNDI  
D. YAML files and application.properties  
Answer: `Environment variables and JNDI`  

Q15. What framework does Spring Boot use out of the box to marshal Java code to JSON?  
A. Maven  
B. The Spring JSON Serialization library  
C. The core JDK JSON library with Spring MVC  
D. The Jackson Library with Spring MVC  
Answer: `The Jackson Library with Spring MVC`  