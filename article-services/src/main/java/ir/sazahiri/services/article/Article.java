package ir.sazahiri.services.article;

import javax.persistence.*;

/**
 * Created by s.Ab.zahiri on 8/11/18.
 */
@Entity
@Table(name="ARTICLE")
public class Article {
    @Id
    @Column(name="ARTICLE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="TITLE")
    private String title;
    @Column(name="BODY")
    private String body;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
