Reference : https://projectreactor.io/

  Reactive programming is non blocking in nature, So we can effectively make use of processer cores and available threads, So it helps us to increase performace


  ![Screenshot (12)](https://github.com/PandiSundaram/reactive/assets/20556559/d5609b8b-fd32-435f-97d3-45fcca29e741)


Expected Dependecies
   1. Webreactive dependency

           	<dependency>
			                <groupId>org.springframework.boot</groupId>
			              <artifactId>spring-boot-starter-webflux</artifactId>
		      </dependency>
   2. Reactive r2dbc driver for respective database


             <dependency>
			               <groupId>org.springframework.boot</groupId>
			               <artifactId>spring-boot-starter-data-r2dbc</artifactId>
		        </dependency>




Challenges with respect to existing project (Not recommended) :

    1. We need to main two datasource configuration one for data jpa and another one for r2dbc support

          # JPA datasource configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password

# R2DBC datasource configuration
spring.r2dbc.url=r2dbc:h2:mem:///testdb
spring.r2dbc.username=sa
spring.r2dbc.password=password

    2.  Configuration class

    -----------------
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.example.jpa.repository")
public class JpaConfig {
    // Define EntityManagerFactory, TransactionManager, etc.
}

@Configuration
@EnableTransactionManagement
@EnableR2dbcRepositories(basePackages = "com.example.r2dbc.repository")
public class R2dbcConfig {
    // Define R2dbcConnectionFactory, TransactionManager, etc.
}


3.Service Layer: Build your service layer to interact with both JPA and R2DBC repositories as needed.


RECOMMANDED APPROACH:

  1. Migrate jpa to r2dbc application
  2. Follow CQRS pattern

        
