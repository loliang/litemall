package com.helios.litemalladmin.service;

import com.helios.litemalladmin.entity.Brand;

import java.util.List;

/**
 * @author Leon
 * @date 2019/3/10
 */
public interface IBrandService {
    /**
     * q
     *
     * @return List<Brand>
     */
    List<Brand> findAll();

    /**
     * @param id
     * @return
     */
    Brand findById(Long id);
}
