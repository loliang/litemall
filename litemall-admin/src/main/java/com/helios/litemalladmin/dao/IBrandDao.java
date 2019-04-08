package com.helios.litemalladmin.dao;

import com.helios.litemalladmin.entity.Brand;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Leon
 * @date 2019/4/8
 */
public interface IBrandDao {
    /**
     *
     * @return
     */
    List<Brand> findAll();

    /**
     *
     * @param id
     * @return
     */
    Brand findById(Long id);

    /**
     *
     * @param brand
     * @return
     */
    int insertBrand(Brand brand);

    /**
     *
     * @param ids
     * @return
     */
    int deleteBatch(List<Long> ids);

    /**
     *
     * @param brand
     * @return
     */
    int updateBrand(Brand brand);
}
