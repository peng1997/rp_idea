package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/items")
public class Controller {

    @Autowired
    private ItemsService itemsService;
    @RequestMapping("/showDetail")
    public String showDetail(Model model){
        Items items = itemsService.findById(1);
        model.addAttribute("item",items);
        return  "itemDetail";
    }
}
