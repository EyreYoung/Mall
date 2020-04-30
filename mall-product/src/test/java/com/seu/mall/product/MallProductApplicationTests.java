package com.seu.mall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.seu.mall.product.entity.BrandEntity;
import com.seu.mall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@Slf4j(topic = "MallProductApplicationTests")
@SpringBootTest
class MallProductApplicationTests {


    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("一加OnePlus");
//        brandService.save(brandEntity);
//        log.debug("Save brand successfully!");
//        brandEntity.setBrandId(2L);
//        brandEntity.setDescript("OPPO子公司");
//        brandService.updateById(brandEntity);

        List<BrandEntity> list = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        list.forEach((i)->{
            log.debug("输出brand：{}", i);
        });
    }
}
