package com.pulmuone.webservice.post;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


/**
 *
 * How to Test
 *
 * 1. http://localhost:8080/
 *
 *
 * 2. H2 database test
 *  http://localhost:8080/h2-console/
 *  JDBC URL : jdbc:h2:mem:testdb
 *
 * [포트 강제 종료]
 * sudo lsof -t -i tcp:포트번호 | xargs kill -9
 */
@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {

//    public static final String APPLICATION_LOCATIONS = "spring.config.location="
//            + "classpath:application.yml"
//            + ",/app/config/springboot-webservice/real-application.yml"
//            ;

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    public static void main(String[] args) {
//        new SpringApplicationBuilder(Application.class)
//                .properties(APPLICATION_LOCATIONS)
//                .run(args);
//    }

}
