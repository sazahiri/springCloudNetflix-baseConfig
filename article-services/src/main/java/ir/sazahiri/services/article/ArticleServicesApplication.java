package ir.sazahiri.services.article;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;
@SpringBootApplication
/*
@EnableEurekaClient
*/
@EnableDiscoveryClient
@EnableSwagger2
public class ArticleServicesApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("Article").select()
                .apis(RequestHandlerSelectors.basePackage("ir.sazahiri.services.article"))
                .paths(any()).build().apiInfo(new ApiInfo("Article Services",
                        "A set of services to provide data access to articles", "1.0.0", null,
                        new Contact("S.Ab Zahiri","https://sazahiri.ir", null),null, null));
    }

	public static void main(String[] args) {
		SpringApplication.run(ArticleServicesApplication.class, args);
	}
}
