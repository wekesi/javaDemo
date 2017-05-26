package com.wekesi.controller;

import com.wekesi.pojo.AllClass;
import com.wekesi.service.impl.AllClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by weixi on 2017/5/15.
 */
@Controller
public class AllClassController {
    @Autowired
    private AllClassService allClassService;
    @RequestMapping("/hash")
    public String list(Model model){
        List<AllClass> list=allClassService.list();
        model.addAttribute("list",list.get(0).getName());

        return "order";

        }

    }

