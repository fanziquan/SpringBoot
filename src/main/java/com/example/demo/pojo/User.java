package com.example.demo.pojo;

import lombok.Data;

import java.util.Date;
/**
 * @author fanzq22858
 * @version User.java, v 0.1 2019/1/31 16:20 Exp $
 */

@Data
public class User {

    private String name;

    private int age;

    private String address;

    private Date birth;

}
