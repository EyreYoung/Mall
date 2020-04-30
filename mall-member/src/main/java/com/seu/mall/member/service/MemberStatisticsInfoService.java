package com.seu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.seu.common.utils.PageUtils;
import com.seu.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * ??Աͳ????Ϣ
 *
 * @author eyreyoung
 * @email yudongyang1996@gmail.com
 * @date 2020-04-30 20:47:58
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

