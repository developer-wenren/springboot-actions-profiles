package com.one.learn.springboot.actions.profiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author One
 */
@SpringBootApplication
@ImportResource("classpath:META-INF/spring/spring-*.xml")
public class SpringbootActionsProfilesApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringbootActionsProfilesApplication.class, args);

        //  方式一：SpringApplication.setAdditionalProfiles(…)
        SpringApplication springApplication = new SpringApplication(SpringbootActionsProfilesApplication.class);
        springApplication.setAdditionalProfiles("prod");
        springApplication.run(args);

        //  方式二：SpringApplicationBuilder.profiles(...)
//        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootActionsProfilesApplication.class);
//        builder.profiles("dev").run(args);
    }

}
