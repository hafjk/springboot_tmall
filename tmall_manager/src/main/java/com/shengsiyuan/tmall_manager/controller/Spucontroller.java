package com.shengsiyuan.tmall_manager.controller;

import com.shengsiyuan.tmall_manager.bean.Tmall_product;
import com.shengsiyuan.tmall_manager.service.SpuServiceInf;
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
import java.util.Map;

@Controller
public class Spucontroller {

    @Autowired
    SpuServiceInf spuServiceInf;

    @Value("${windowspath}")
    public String windowspath;
//    @GetMapping("/goto_spu")
    public String goto_spu(Map<String ,Object> map,Tmall_product spu){
        System.out.println("11111111111111111111111");
        System.out.println(windowspath);

        map.put("spu",spu);
        return "add_spu";
    }

//    @PostMapping("/add_spu1")
    public ModelAndView add_spu(@RequestParam("files") MultipartFile[] files, Tmall_product spu ){

        ModelAndView view = new ModelAndView("redirect:/goto_spu");
        view.addObject("flbh1",1);
        view.addObject("flbh2",2);
        List<String> list_image = new ArrayList<>();
        for(int i=0; i<files.length;i++){
            if (!files[i].isEmpty()) {
                String originalfilename = files[i].getOriginalFilename();
                String name = System.currentTimeMillis() + originalfilename;
                String upload_name = windowspath + "/" + name;

                try {
                    files[i].transferTo(new File(upload_name));
                    list_image.add(name);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        spuServiceInf.save_spu(list_image,spu);

        return view;

    }



}
