package com.nit.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

    @GetMapping("/product")
    public String productForm() {
        return "product";
    }

    @PostMapping("/discount")
    public ModelAndView calculateDiscount(
            @RequestParam("productName") String productName,
            @RequestParam("price") double price,
            @RequestParam("discountPercentage") double discountPercentage) {

        double discountAmount = (price * discountPercentage) / 100;
        double finalPrice = price - discountAmount;

        ModelAndView mv = new ModelAndView();

        mv.addObject("productName", productName);
        mv.addObject("price", price);
        mv.addObject("discountPercentage", discountPercentage);
        mv.addObject("discountAmount", discountAmount);
        mv.addObject("finalPrice", finalPrice);

        mv.setViewName("discount");

        return mv;
    }
}
