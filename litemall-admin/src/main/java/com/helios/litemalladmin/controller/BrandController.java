package com.helios.litemalladmin.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.helios.litemalladmin.common.ServerResponse;
import com.helios.litemalladmin.entity.Brand;
import com.helios.litemalladmin.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author Leon
 * @date 2019/3/10
 */
@RestController
@RequestMapping("manage/brand")
public class BrandController {

    @Autowired
    IBrandService brandService;

    @GetMapping
    public ServerResponse<PageInfo> findAllBrands(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Brand> brands = brandService.findAll();
        PageInfo<Brand> pageInfo = new PageInfo<>(brands);
        return ServerResponse.<PageInfo>success("success", pageInfo);
    }

    @GetMapping("{id}")
    public ServerResponse<Brand> findOne(@PathVariable("id") Long id) {
        return ServerResponse.success("success", brandService.findById(id));
    }
}
