package com.one.learn.springboot.actions.profiles.configuration;

import com.one.learn.springboot.actions.profiles.domain.City;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * 生产配置类
 *
 * @author One
 * @date 2019/07/27
 */
@Configuration
@Profile("prod")
public class ProdConfig {
    @Bean
    public City city() {
        return new City("shanghai", "200000");
    }
}
