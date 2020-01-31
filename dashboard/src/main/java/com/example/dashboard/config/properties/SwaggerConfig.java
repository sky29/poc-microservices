package com.example.dashboard.config.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

@Configuration
@EnableSwagger2WebMvc
@PropertySource("classpath:swagger.properties")
public class SwaggerConfig extends WebMvcConfigurationSupport {

	/* Variables - Swagger API Details */
	@Value("${swagger.api.title}")
	private String apiTitle;

	@Value("${swagger.api.description}")
	private String apiDescription;

	@Value("${swagger.api.contact.name}")
	private String apiContactName;

	@Value("${swagger.api.contact.url}")
	private String apiContactUrl;

	@Value("${swagger.api.contact.email}")
	private String apiContactEmail;

	@Value("${swagger.api.termsofserviceurl}")
	private String apiTermsOfServiceUrl;

	@Value("${swagger.api.license}")
	private String apiLicense;

	@Value("${swagger.api.baseurl}")
	private String apiBaseUrl;

	@Value("${swagger.api.version}")
	private String apiVersion;


	@Bean
	public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}

	/* API Docs Group - Default */
	@Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
		  .select()
          //.paths(Predicates.not(PathSelectors.regex("/.*")))                          
		  .build()
		  .apiInfo(metadata());   
	}
	
	private ApiInfo metadata() {
		return new ApiInfoBuilder()
		.title(apiTitle)
		.description(apiDescription)
		.version(apiVersion)
		.license(apiLicense)
		.contact(new Contact(apiContactName, apiContactUrl, apiContactEmail))
		.termsOfServiceUrl(apiTermsOfServiceUrl)
		.build();
	}

	@Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("swagger-ui.html")
                .addResourceLocations("classpath:/META-INF/resources/");
 
        registry.addResourceHandler("/webjars/**")
                .addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}