package com.onebinduwa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

@EnableSwagger2
@Configuration
@EnableWebMvc
public class SwaggerConfiguration {

    public static final Contact SUPPORTED_CONTACTS = new Contact("Daniel","http://www.onebinduwa.com",
            "support@mail.com");

    @Bean
    public Docket newApi(){
        Set produces= new HashSet<>(Arrays.asList("application/json","application/xml"));
        Set consumes= new HashSet<>(Arrays.asList("application/json","application/xml"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(produces)
                .consumes(consumes);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Employee Service")
                .description("Employee Service with Swagger Documentation")
                .termsOfServiceUrl("http://www.onebinduwa.com?etc")
                .contact(SUPPORTED_CONTACTS)
                .license("Employee Licence Version 1.0")
                .licenseUrl("http://www.onebinduwa.com/license")
                .version("3.0")
                .build();
    }
}
