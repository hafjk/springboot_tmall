package com.shengsiyuan.tmall_manager.service;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;

import java.util.List;

public interface SpuService {
    void add_spu(List<String> list_images, Tmall_product tmall_product);
}
