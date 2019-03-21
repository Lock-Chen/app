package cn.fang.controller;


import cn.fang.domain.Items;
import cn.fang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/items")
public class ItemsController {

    @Autowired
    private ItemsService itemsService;

    @RequestMapping("/findDetail")
    public String findDetail(Model model){
        Items item = itemsService.findById(1);
        model.addAttribute("item",item);

        return "itemDetail";

    }
}
