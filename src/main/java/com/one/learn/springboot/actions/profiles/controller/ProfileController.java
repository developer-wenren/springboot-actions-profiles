package com.one.learn.springboot.actions.profiles.controller;

import com.one.learn.springboot.actions.profiles.domain.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试 Controller
 *
 * @author One
 * @date 2019/07/27
 */
@RestController()
public class ProfileController {
    @Value("${app.enviroment}")
    private String enviroment;

    @Autowired
    private City city;

    @Autowired
    private City xmlCity;

    @GetMapping("/enviroment")
    public String enviroment() {
        return "current app enviroment is " + enviroment;
    }

    @GetMapping("/xmlCity")
    public String xmlCity() {
        return xmlCity.toString();
    }

    @GetMapping("/annotationCity")
    public String annotationCity() {
        return city.toString();
    }
}
