package com.shengsiyuan.tmall_manager.mapper;

import com.shengsiyuan.tmall_manager.bean.UserAccount;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    public UserAccount selectUser(UserAccount userAccount);

}
