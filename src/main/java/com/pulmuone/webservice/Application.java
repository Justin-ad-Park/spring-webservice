package com.pulmuone.webservice;

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
 */
@EnableJpaAuditing // JPA Auditing 활성화
@SpringBootApplication
public class Application {

    public static final String APPLICATION_LOCATIONS = "spring.config.location="
            + "classpath:application.yml,"
            + "/app/config/springboot-webservice/real-application.yml";

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .properties(APPLICATION_LOCATIONS)
                .run(args);
    }

}
