package za.co.minusone.kafkademo.config;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

public class SwaggerConfig extends Docket {
    public SwaggerConfig(String apiName, String apiDescription, String apiVersion) {
        super(DocumentationType.SWAGGER_2);
        this.select().apis(RequestHandlerSelectors.basePackage("za.co.minusone.kafkademo")).paths(PathSelectors.any()).build().apiInfo(this.apiInfo(apiName, apiDescription, apiVersion));
    }

    private ApiInfo apiInfo(String apiName, String apiDescription, String apiVersion) {
        return (new ApiInfoBuilder())
                .title(apiName)
                .description(apiDescription)
                .contact(new Contact("Minus One Technology Development Team", "http://www.minus-one.co.za/development", "lerato.radebe@minus-one.co.za")).license("Terms & Conditions")
                .licenseUrl("http://www.minus-one.co.za/license").version(apiVersion)
                .build();
    }
}
