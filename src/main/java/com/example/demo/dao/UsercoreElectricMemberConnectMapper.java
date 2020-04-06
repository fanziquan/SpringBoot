package com.example.demo.dao;

import com.example.demo.bean.UsercoreElectricMemberConnect;
import com.example.demo.bean.UsercoreElectricMemberConnectExample;
import com.example.demo.bean.UsercoreElectricMemberConnectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UsercoreElectricMemberConnectMapper {
    int countByExample(UsercoreElectricMemberConnectExample example);

    int deleteByExample(UsercoreElectricMemberConnectExample example);

    int deleteByPrimaryKey(UsercoreElectricMemberConnectKey key);

    int insert(UsercoreElectricMemberConnect record);

    int insertSelective(UsercoreElectricMemberConnect record);

    List<UsercoreElectricMemberConnect> selectByExample(UsercoreElectricMemberConnectExample example);

    UsercoreElectricMemberConnect selectByPrimaryKey(UsercoreElectricMemberConnectKey key);

    int updateByExampleSelective(@Param("record") UsercoreElectricMemberConnect record, @Param("example") UsercoreElectricMemberConnectExample example);

    int updateByExample(@Param("record") UsercoreElectricMemberConnect record, @Param("example") UsercoreElectricMemberConnectExample example);

    int updateByPrimaryKeySelective(UsercoreElectricMemberConnect record);

    int updateByPrimaryKey(UsercoreElectricMemberConnect record);
}