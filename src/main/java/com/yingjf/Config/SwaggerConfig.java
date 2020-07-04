package com.yingjf.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.service.Contact;

@Configuration//必须存在
@EnableSwagger2//必须存在
//@EnableWebMvc //必须存在
//扫描的API Controller包
//@ComponentScan(basePackages = {"com.yingjf.controller"})
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("yjf")

                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yingjf.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    @Bean
    public Docket bDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("xxx")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.yingjf.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        Contact contact = new Contact("yingjf", "www.baidu.com", "1374993958@qq.com");
        return new ApiInfoBuilder()
                .title("swagger入门项目接口")
                .description("API接口")
                .contact(contact)
                .version("1.1.0")
                .build();
    }
}