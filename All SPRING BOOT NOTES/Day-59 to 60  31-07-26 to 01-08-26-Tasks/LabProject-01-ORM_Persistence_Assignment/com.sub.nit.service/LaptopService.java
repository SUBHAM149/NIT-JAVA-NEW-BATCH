package com.sub.nit.service;

import java.util.List;
import com.sub.nit.entity.Laptop;

public interface LaptopService {

    Laptop saveLaptop(Laptop laptop);

    List<Laptop> getAllLaptops();

    Laptop getLaptopById(Integer id);

    Laptop updateLaptop(Integer id, Laptop laptop);

    String deleteLaptop(Integer id);

}
