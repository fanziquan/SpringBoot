package com.example.demo.service.impl;

import com.example.demo.bean.UsercoreUserRegister;
import com.example.demo.bean.UsercoreUserRegisterExample;
import com.example.demo.dao.UsercoreUserRegisterMapper;
import com.example.demo.service.UserRegisterService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author fanzq22858
 * @version $Id: UserRegisterServiceImpl.java, v 0.1 2018/7/9 17:10 Exp $
 */
@Service
public class UserRegisterServiceImpl implements UserRegisterService {

    @Resource
    UsercoreUserRegisterMapper usercoreUserRegisterMapper;

    @Override
    @Transactional
    public List<UsercoreUserRegister> selectList(Integer page, Integer pageSize) throws Exception{
        UsercoreUserRegisterExample example = new UsercoreUserRegisterExample();
        UsercoreUserRegisterExample.Criteria criteria = example.createCriteria();
        criteria.andTenantIdEqualTo("XIS");
        example.setOrderByClause(" CREATE_TIME desc");
        List<UsercoreUserRegister> list = usercoreUserRegisterMapper.selectByExample(example);
        return list;
    }
}
