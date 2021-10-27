package nl.trifork.mapstructdemo;

public class TalkDTO {

    private String name;
    private SpeakerDTO speaker;
    private long durationInMinutes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SpeakerDTO getSpeaker() {
        return speaker;
    }

    public void setSpeaker(SpeakerDTO speaker) {
        this.speaker = speaker;
    }

    public long getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(long durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @Override
    public String toString() {
        return "TalkDTO{" +
                "name='" + name + '\'' +
                ", speaker='" + speaker + '\'' +
                ", durationInMinutes=" + durationInMinutes +
                '}';
    }
}
