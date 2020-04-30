package com.seu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.common.utils.PageUtils;
import com.seu.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * Ʒ?
 *
 * @author eyreyoung
 * @email yudongyang1996@gmail.com
 * @date 2020-04-30 20:55:29
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

