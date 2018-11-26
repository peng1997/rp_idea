package com.itheima.test;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;

import com.itheima.service.imp.ItemsServiceImp;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDao {
    @Test
    public  void  testDao01(){
       ApplicationContext ac  = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService dao = ac.getBean(ItemsServiceImp.class);
        Items items = dao.findById(1);
        System.out.println(items);
    }
}
