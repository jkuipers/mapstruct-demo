package nl.trifork.mapstructdemo;

public class SpeakerDTO {
    private String name;
    private String twitterUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(String twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    @Override
    public String toString() {
        return "SpeakerDTO{" +
                "name='" + name + '\'' +
                ", twitterUrl='" + twitterUrl + '\'' +
                '}';
    }
}
