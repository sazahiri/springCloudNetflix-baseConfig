package ir.sabzahiri.businessdiscoveryfeign;

import ir.sabzahiri.businessdiscoveryfeign.client.ArticleService;
import ir.sabzahiri.businessdiscoveryfeign.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeignDiscoveryController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/articlesfeign",method = RequestMethod.GET)
    public List<Article> findAll(){
        return this.articleService.findAll(null);
    }
}
