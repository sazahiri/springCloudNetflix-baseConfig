package ir.sabzahiri.businessdiscoveryfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.any;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableSwagger2
public class FeignDiscoveryApplication {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).groupName("article sample").select()
                .apis(RequestHandlerSelectors.basePackage("ir.sazahiri"))
                .paths(any()).build().apiInfo(new ApiInfo("article micro Services",
                        "A set of services to provide business processes for the article and Reservations domains", "1.0.0", null,
                        new Contact("Frank Moley", "https://twitter.com/fpmoles", null),null, null));
    }
    public static void main(String[] args) {
        SpringApplication.run(FeignDiscoveryApplication.class, args);
    }
}
