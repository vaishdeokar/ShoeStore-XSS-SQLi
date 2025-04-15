package com.walkwise.shoestore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.walkwise.shoestore.repository.ShoeRepository;

@Controller
public class ShoeController {

    @Autowired
    private ShoeRepository shoeRepository;

    @GetMapping("/")
    public String getShoes(Model model) {
        model.addAttribute("shoes", shoeRepository.findAll());
        return "index";  // Thymeleaf template name
    }
}
