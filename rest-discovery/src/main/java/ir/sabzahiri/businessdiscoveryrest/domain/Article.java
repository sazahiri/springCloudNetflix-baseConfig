package ir.sabzahiri.businessdiscoveryrest.domain;

/**
 * Created by s.Ab.zahiri on 8/11/18.
 */
public class Article {

    private long id;
    private String title;
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
