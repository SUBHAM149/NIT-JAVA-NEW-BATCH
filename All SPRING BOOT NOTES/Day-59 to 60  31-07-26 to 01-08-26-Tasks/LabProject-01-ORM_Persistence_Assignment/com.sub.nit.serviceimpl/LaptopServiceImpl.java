package com.sub.nit.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sub.nit.entity.Laptop;
import com.sub.nit.repository.LaptopRepository;
import com.sub.nit.service.LaptopService;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepository repository;

    @Override
    public Laptop saveLaptop(Laptop laptop) {
        return repository.save(laptop);
    }

    @Override
    public List<Laptop> getAllLaptops() {
        return repository.findAll();
    }

    @Override
    public Laptop getLaptopById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Laptop updateLaptop(Integer id, Laptop laptop) {

        Laptop lap = repository.findById(id).orElse(null);

        if (lap != null) {
            lap.setBrand(laptop.getBrand());
            lap.setProcessor(laptop.getProcessor());
            lap.setPrice(laptop.getPrice());

            return repository.save(lap);
        }

        return null;
    }

    @Override
    public String deleteLaptop(Integer id) {
        repository.deleteById(id);
        return "Laptop Deleted Successfully";
    }
}
