package com.qsqx.config;
import com.qsqx.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 注册拦截器
 */
@Configuration
public class WebAppConfig implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginInterceptor(){
        return  new LoginInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("执行拦截~~~~");
       // registry.addInterceptor(this.getLoginInterceptor()).addPathPatterns("/login");
    }
}
