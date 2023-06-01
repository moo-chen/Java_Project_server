package com.example.demo.common;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//  这个配置类在Spring应用程序中启用了CORS支持，允许来自任何来源的跨域请求。

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("*")
                .allowedMethods("*")
                .allowCredentials(true);
//        addMapping("/**")指定CORS配置应该适用于应用程序的所有端点
//        allowedOriginPatterns(new String[]{"*"})：允许来自任何来源的请求
//        allowedMethods(new String[]{"*"})：允许任何HTTP方法的请求。
//        allowCredentials(true)：允许在CORS请求中发送凭据（例如，cookies）。
    }
}