package ir.sabzahiri.businessdiscoveryfeign.client;


import ir.sabzahiri.businessdiscoveryfeign.domain.Article;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "articleservices")
public interface ArticleService {
    @RequestMapping(value = "/articles",method = RequestMethod.GET)
    List<Article> findAll(@RequestParam(name = "id",required = false)Integer id);
}
