package com.shengsiyuan.tmall_manager.service;

import com.shengsiyuan.tmall_manager.bean.Object_attr;

import java.util.List;

public interface AttrService {
    void addAttr(Integer flbh2, Object_attr list_attr);
    public List<Object_attr> selectAttr(Integer flbh2);
}
