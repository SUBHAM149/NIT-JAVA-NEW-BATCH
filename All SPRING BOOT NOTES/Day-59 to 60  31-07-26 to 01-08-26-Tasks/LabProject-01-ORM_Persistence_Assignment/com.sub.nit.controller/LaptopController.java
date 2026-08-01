package com.sub.nit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sub.nit.entity.Laptop;
import com.sub.nit.service.LaptopService;

@RestController
@RequestMapping("/laptop")
public class LaptopController {

    @Autowired
    private LaptopService service;

    @PostMapping("/save")
    public Laptop saveLaptop(@RequestBody Laptop laptop) {
        return service.saveLaptop(laptop);
    }

    @GetMapping("/all")
    public List<Laptop> getAllLaptops() {
        return service.getAllLaptops();
    }

    @GetMapping("/{id}")
    public Laptop getLaptopById(@PathVariable Integer id) {
        return service.getLaptopById(id);
    }

    @PutMapping("/update/{id}")
    public Laptop updateLaptop(@PathVariable Integer id,
                               @RequestBody Laptop laptop) {
        return service.updateLaptop(id, laptop);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteLaptop(@PathVariable Integer id) {
        return service.deleteLaptop(id);
    }
}
