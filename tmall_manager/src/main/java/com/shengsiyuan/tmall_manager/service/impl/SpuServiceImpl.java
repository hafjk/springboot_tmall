package com.shengsiyuan.tmall_manager.service.impl;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;
import com.shengsiyuan.tmall_manager.mapper.SpuMapper;
import com.shengsiyuan.tmall_manager.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    SpuMapper spuMapper;
    @Override
    public void add_spu(List<String> list_images, Tmall_product tmall_product) {
        tmall_product.setShp_tp(list_images.get(0));
        spuMapper.insertSpu(tmall_product);

        Map<String,Object> map = new HashMap<>();
        map.put("shp_id",tmall_product.getId());
        map.put("list_image",list_images);
        spuMapper.insertImages(map);
    }
}
