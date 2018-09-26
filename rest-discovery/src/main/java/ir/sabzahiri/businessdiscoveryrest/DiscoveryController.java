package ir.sabzahiri.businessdiscoveryrest;

import ir.sabzahiri.businessdiscoveryrest.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DiscoveryController {

    @Autowired
    private RestTemplate restTemplate;


        @RequestMapping(value = "/articlesrest",method = RequestMethod.GET)
    public List<Article> getAllArticles(){
        ResponseEntity<List<Article>> responseEntity = this.restTemplate.exchange("http://ARTICLESERVICES/articles",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Article>>() {
        });
        return responseEntity.getBody();
    }
}
