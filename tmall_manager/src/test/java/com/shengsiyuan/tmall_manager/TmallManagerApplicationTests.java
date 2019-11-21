package com.shengsiyuan.tmall_manager;

import com.alibaba.fastjson.JSON;
import com.shengsiyuan.tmall_manager.bean.Object_attr;
import com.shengsiyuan.tmall_manager.mapper.AttrMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;

@SpringBootTest
class TmallManagerApplicationTests {

    @Autowired
    DataSource dataSource;

    @Autowired
    AttrMapper attrMapper;

    @Test
   public void testattr(){
       List<Object_attr> object_attrs = attrMapper.selectAttr(3);
       System.out.println(object_attrs);
   }

    //    @Value("${windowspath}")
//    String windowspath;

    @Test
    public void  testFastJson(){
//        JSON.t
    }



    @Test
    void contextLoads() throws IOException {
        Properties properties = new Properties();
        InputStream in = TmallManagerApplicationTests.class.getResourceAsStream("classpaths:a.properties");
        properties.load(in);
        String windowspath =  properties.getProperty("windowspath");




        System.out.println(windowspath);
        System.out.println("1111111111111111111111");
    }

}
