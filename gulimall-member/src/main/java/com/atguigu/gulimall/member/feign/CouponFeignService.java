package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: gulimall
 * @Package: com.atguigu.gulimall.member.feign
 * @Author: Lu Fang
 * @Date: 2022/10/4 下午 07:36
 */

@FeignClient("gulimall-coupon")
public interface CouponFeignService {
    
    // 远程服务的url
    @RequestMapping("/coupon/coupon/member/list")//注意写全优惠券类上还有映射
    public R membercoupons();//得到一个R对象
}
