package com.example.demo.service.impl;

import com.example.demo.entity.Sale;
import com.example.demo.repository.SaleRepo;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleRepo saleRepo;

    @Override
    public List<Sale> findAll() {
        return saleRepo.findAll();
    }
}
