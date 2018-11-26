package com.itheima.service.impl;


import com.itheima.dao.ItmesDao;
import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private  ItmesDao itmesDao;

    public Items findById(Integer id) {
        Items byId = itmesDao.findById(1);
        return byId;
    }
}
