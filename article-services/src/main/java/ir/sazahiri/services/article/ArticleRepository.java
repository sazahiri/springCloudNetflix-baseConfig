package ir.sazahiri.services.article;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by frankmoley on 5/22/17.
 */
@Repository
public interface ArticleRepository extends CrudRepository<Article, Long>{
    Article findById(Integer id);
}
