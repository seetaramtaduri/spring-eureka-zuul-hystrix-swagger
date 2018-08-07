package com.person.sam.productmodel.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.person.sam.productmodel"))
				.paths(regex("/productmodel.*"))
				.build()
				.apiInfo(metaInfo());
	}

	private ApiInfo metaInfo() {
		ApiInfo apiInfo = new ApiInfo(
				"Product Model Manager",
				"Swagger Documentation for Product Model Manager",
				"1.0",
				"Terms of Service",
				new Contact("Prince Kumar", "https://www.person.com", "prince.kumar@person.com"),
				"Apache License Version 2.0",
				"https://www.apache.org/license.html"
			);
		
		return apiInfo;
	}
}
