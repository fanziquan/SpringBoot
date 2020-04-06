package com.example.demo.service;

import com.example.demo.bean.UsercoreUserRegister;

import java.util.List;

/**
 * @author fanzq22858
 * @version $Id: UserRegisterService.java, v 0.1 2018/7/9 17:10 Exp $
 */
public interface UserRegisterService {

    List<UsercoreUserRegister> selectList(Integer page, Integer pageSize) throws Exception;
}
