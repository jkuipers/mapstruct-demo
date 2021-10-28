package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TalkMapper {

    @Mapping(target = "room", source = "location")
    TalkDTO toDTO(Talk talk);

}
