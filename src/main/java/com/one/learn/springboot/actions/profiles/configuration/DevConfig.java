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
@Profile("dev")
public class DevConfig {
    @Bean
    public City city() {
        return new City("beijing", "100000");
    }
}
