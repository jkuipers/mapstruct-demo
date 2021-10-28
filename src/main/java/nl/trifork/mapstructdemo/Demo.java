package nl.trifork.mapstructdemo;

import org.mapstruct.factory.Mappers;

public class Demo {
    public static void main(String[] args) {
        TalkMapper mapper = Mappers.getMapper(TalkMapper.class);

        Speaker joris = new Speaker();
        joris.setName("Joris Kuipers");
        joris.setTwitterUrl("https://twitter.com/jkuipers");

        Talk talk = new Talk();
        talk.setName("Get Set Go! An intro to MapStruct");
        talk.setDurationInMinutes(16L);
        talk.setSpeaker(joris);
        talk.setType(Talk.Type.BYTESIZE);

        Location location = new Location();
        location.setName("The room you're currently in");
        talk.setLocation(location);

        TalkDTO talkDTO = mapper.toDTO(talk);
        System.out.println(talkDTO);
    }
}
