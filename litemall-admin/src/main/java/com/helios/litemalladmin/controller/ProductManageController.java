package com.helios.litemalladmin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Helios
 * @date 2019/2/19
 */
@RestController
@RequestMapping("/manage/products")
public class ProductManageController {

    @GetMapping
    public Object productsList(){
        return "hello";
    }
}
