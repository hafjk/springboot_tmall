package com.shengsiyuan.tmall_manager.service.impl;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;
import com.shengsiyuan.tmall_manager.mapper.SpuMapper;
import com.shengsiyuan.tmall_manager.service.SpuServiceInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpuServiceInfimp implements SpuServiceInf {

    @Autowired
    SpuMapper spuMapper;
    @Override
    public void save_spu(List<String> list_image, Tmall_product spu) {
           spu.setShp_tp(list_image.get(0));
           spuMapper.insertSpu(spu);

           Map<String,Object> map = new HashMap<>();
           map.put("shp_id",spu.getId());
           map.put("list_image",list_image);
           spuMapper.insertImages(map);
    }
}
