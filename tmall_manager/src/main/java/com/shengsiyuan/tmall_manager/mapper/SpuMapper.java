package com.shengsiyuan.tmall_manager.mapper;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface SpuMapper {
   public void insertSpu(Tmall_product spu);

   public void insertImages(Map<String,Object> map);
}
// 放大法骄傲
