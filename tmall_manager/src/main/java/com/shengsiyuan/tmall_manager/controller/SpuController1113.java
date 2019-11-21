package com.shengsiyuan.tmall_manager.controller;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;
import com.shengsiyuan.tmall_manager.service.SpuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SpuController1113 {

    @Autowired
    SpuService spuService;

    @GetMapping("/goto_spuadd")
    public String  goto_spuadd(){
        return "add_spu";
    }
    @Value("${windowspath}")
    String windowspath;

    @PostMapping("/add_spu1")
    public ModelAndView spu_add(Tmall_product tmall_product, @RequestParam("files") MultipartFile[] files){

        ModelAndView mv  = new ModelAndView("redirect:/goto_spuadd");

        List<String > list_images = new ArrayList();
        for (int i = 0;i<files.length;i++){
            if(!files[i].isEmpty()) {
                String originalFilename = files[i].getOriginalFilename();
                String name = System.currentTimeMillis()+originalFilename;
                String path = windowspath + "/"+name;
                try {
                    files[i].transferTo(new File(path));
                    list_images.add(name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        spuService.add_spu(list_images,tmall_product);
        return mv;
    }





}
