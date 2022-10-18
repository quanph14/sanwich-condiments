package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichCondiments {
    @GetMapping("/home")
    public String index(){
        return "index";
    }
    @GetMapping("/save")
    public String save(@RequestParam(name = "condiment") String[] condiments, Model model){
        String condiment = "";
        if (condiments.length !=0){
            for (int i = 0; i < condiments.length; i++) {
                if (i < condiments.length - 1)
                    condiment += condiments[i] + ", ";
                else condiment += condiments[i];
            }
        }
        model.addAttribute("condiment", condiment);
        return "result";
    }
}