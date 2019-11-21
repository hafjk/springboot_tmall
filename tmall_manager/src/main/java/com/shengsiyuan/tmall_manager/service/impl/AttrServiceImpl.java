package com.shengsiyuan.tmall_manager.service.impl;

import com.shengsiyuan.tmall_manager.bean.Object_attr;
import com.shengsiyuan.tmall_manager.bean.Tmall_attr;
import com.shengsiyuan.tmall_manager.bean.Tmall_value;
import com.shengsiyuan.tmall_manager.mapper.AttrMapper;
import com.shengsiyuan.tmall_manager.service.AttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    AttrMapper attrMapper;


    public List<Object_attr>  selectAttr(Integer flbh2){
        List<Object_attr> list_attrs = attrMapper.selectAttr(flbh2);
        return list_attrs;
    }


    @Override
    public void addAttr(Integer flbh2, Object_attr list_attr) {
        list_attr.setId(flbh2);
        attrMapper.addAttr(list_attr);
        Map<String,Object>map = new HashMap<>();
        map.put("attr_id",list_attr.getId());
        map.put("value",list_attr.getList_value());

        attrMapper.addvalue(map);
    }
}
