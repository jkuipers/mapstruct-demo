package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TalkMapper {

    @Mapping(target = "room", ignore = true)
    TalkDTO toDTO(Talk talk);

}
