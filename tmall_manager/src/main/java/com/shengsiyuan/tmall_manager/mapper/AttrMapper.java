package com.shengsiyuan.tmall_manager.mapper;

import com.shengsiyuan.tmall_manager.bean.Object_attr;
import com.shengsiyuan.tmall_manager.bean.Tmall_value;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AttrMapper {

    void addAttr(Object_attr list_attr);

    void addvalue(Map map);

    List<Object_attr> selectAttr(Integer flbh2);
}
