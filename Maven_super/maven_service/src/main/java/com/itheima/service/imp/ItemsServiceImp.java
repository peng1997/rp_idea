package com.itheima.service.imp;


import com.itheima.dao.ItmesDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImp implements ItemsService {
    @Autowired
   private  ItmesDao dao;

    public Items findById(Integer id) {
        System.out.println(dao);

       return dao.findById(id);
    }
}
