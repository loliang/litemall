package com.helios.litemalladmin.service.impl;

import com.helios.litemalladmin.dao.IBrandDao;
import com.helios.litemalladmin.entity.Brand;
import com.helios.litemalladmin.service.IBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Leon
 * @date 2019/3/10
 */
@Service
public class BrandServiceImpl implements IBrandService {

    @Autowired
    IBrandDao brandDao;

    @Override
    public List<Brand> findAll() {
        return brandDao.findAll();
    }

    @Override
    public Brand findById(Long id) {
        return brandDao.findById(id);
    }
}
