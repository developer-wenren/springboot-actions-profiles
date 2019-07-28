package com.one.learn.springboot.actions.profiles.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 城市
 *
 * @author One
 * @date 2019/07/27
 */
@Data
@AllArgsConstructor
public class City {
    private String name;
    private String postCode;
}
