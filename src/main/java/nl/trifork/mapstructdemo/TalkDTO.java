package nl.trifork.mapstructdemo;

public class TalkDTO {

    enum Type {
        BYTESIZE,
        REGULAR,
        OTHER
    }

    private String name;
    private SpeakerDTO speaker;
    private long durationInMinutes;
    private String room;
    private Type type;

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

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TalkDTO{" +
                "name='" + name + '\'' +
                ", speaker=" + speaker +
                ", durationInMinutes=" + durationInMinutes +
                ", room='" + room + '\'' +
                ", type=" + type +
                '}';
    }
}
