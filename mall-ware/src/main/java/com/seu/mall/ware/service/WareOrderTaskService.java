package com.seu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.common.utils.PageUtils;
import com.seu.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * ???湤????
 *
 * @author eyreyoung
 * @email yudongyang1996@gmail.com
 * @date 2020-04-30 20:57:55
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

