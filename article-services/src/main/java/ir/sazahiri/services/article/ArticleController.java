package ir.sazahiri.services.article;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * Created by S on 5/22/17.
 */
@RestController
@RequestMapping(value="/articles")
@Api(value="articles", description = "Data service operations on Articles", tags=("Articles"))
public class ArticleController {
    @Autowired
    private ArticleRepository articleRepository;

    @RequestMapping(method = RequestMethod.GET)
    @ApiOperation(value="Get All Articles", notes="Gets all Articles in the system", nickname="getArticles")
    public List<Article> findAll(@RequestParam(name="id", required = false)Integer id){
        if(id!=null){
            return Collections.singletonList(this.articleRepository.findById(id));
        }
        return (List<Article>) this.articleRepository.findAll();
    }
}
