package com.example.demo.controller;

import com.example.demo.entity.Product;
import com.example.demo.entity.Sale;
import com.example.demo.service.ProductService;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sale")
public class SaleController {
    @Autowired
    private SaleService saleService;

    @GetMapping
    public String index(Model model) {
        List<Sale> saleList = saleService.findAll();
        model.addAttribute("title", "Sale");
        model.addAttribute("saleList", saleList);
        return "admin/sale/index";
    }
}
