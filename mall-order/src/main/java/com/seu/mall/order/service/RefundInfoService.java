package com.seu.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.common.utils.PageUtils;
import com.seu.mall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * ?˿???Ϣ
 *
 * @author eyreyoung
 * @email yudongyang1996@gmail.com
 * @date 2020-04-30 20:51:41
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

