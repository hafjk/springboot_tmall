package com.shengsiyuan.tmall_manager.controller;

import com.shengsiyuan.tmall_manager.bean.Object_attr;
import com.shengsiyuan.tmall_manager.bean.Tmall_value;
import com.shengsiyuan.tmall_manager.service.AttrService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AttrController {

    @Autowired
    AttrService attrService;

    @GetMapping("/goto_attr")
    public String goto_attr(ModelMap map, @RequestParam(required = false,defaultValue = "1") int flbh2){
        map.put("flbh2",2);
        return "add_attr";
    }

    @PostMapping("/add_attr")
    public ModelAndView add_attr(){

        List<Tmall_value> list = new ArrayList<>();
        Object_attr list_attr = new Object_attr();
        Integer flbh2 = 2;
        Tmall_value value = new Tmall_value();
        value.setShfqy(1);
        value.setShxzh_mch("瓦");
        value.setShxzh("100");
        Tmall_value value2 = new Tmall_value();
        value2.setShfqy(1);
        value2.setShxzh_mch("瓦");
        value2.setShxzh("200");
        list_attr.setFlbh2(2);
        list_attr.setShxm_mch("灯泡");
        list.add(value);
        list.add(value2);
        list_attr.setList_value(list);
//        list_attr.getList_value().add(value);
//        list_attr.getList_value().add(value2);

        attrService.addAttr(flbh2,list_attr);


        ModelAndView mv = new ModelAndView("redirect:/goto_attr");
        mv.addObject("flbh2",3);

        return mv;
    }

    @ResponseBody
    @GetMapping("/queryattr")
    public List<Object_attr> queryattr(){
        List<Object_attr> object_attrs = attrService.selectAttr(3);
        return object_attrs;
    }
}
