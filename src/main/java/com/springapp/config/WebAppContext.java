package com.springapp.config;

import com.springapp.annotation.MyTag;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * <br>
 * Created by Bohan Zheng on 9/24/2015.
 *
 * @author Bohan Zheng
 */
@MyTag(author = "Bohan Zheng", date = "9/24/2015")
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = {"com.springapp.mvc"})
public class WebAppContext extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

//    @Bean
//    public SimpleMappingExceptionResolver exceptionResolver() {
//        SimpleMappingExceptionResolver exceptionResolver = new SimpleMappingExceptionResolver();
//
//        return exceptionResolver;
//    }

    @Bean
    protected ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
