package nl.trifork.mapstructdemo;

import java.net.URI;

public class Speaker {
    private String name;
    private URI twitterUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public URI getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(URI twitterUrl) {
        this.twitterUrl = twitterUrl;
    }
}
