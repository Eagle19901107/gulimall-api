package com.atguigu.gulimall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
/**
 * @ProjectName: gulimall
 * @Package: com.atguigu.gulimall.gateway.config
 * @Author: Lu Fang
 * @Date: 2022/10/4 下午 10:55
 */
//这个包别导错了，有一个很像的。

@Configuration
public class GulimallCorsConfiguration{
    
    @Bean
    public CorsWebFilter corsWebFilter(){
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        
        CorsConfiguration corsConfiguration= new CorsConfiguration();
        //1、配置跨域
        // 允许跨域的请求头
        corsConfiguration.addAllowedHeader("*");
        // 允许跨域的请求方式
        corsConfiguration.addAllowedMethod("*");
        // 允许跨域的请求来源
        corsConfiguration.addAllowedOriginPattern("*");
        //corsConfiguration.addAllowedOrigin("*");//这句会报错，具体看后文
        // 是否允许携带cookie跨域
        corsConfiguration.setAllowCredentials(true);
        
        // 任意url都要进行跨域配置，两个*号就是可以匹配包含0到多个/的路径
        source.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(source);
        
    }
}
