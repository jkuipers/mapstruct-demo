package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

@Mapper(uses = SharedMapper.class)
public interface TalkMapper {

    @Mapping(target = "room", source = "location.name")
    @Mapping(target = "durationInMinutes",
             expression = "java(talk.getDuration() == null ? null : talk.getDuration().toMinutes())")
    TalkDTO toDTO(Talk talk);

    @ValueMapping(target = "OTHER", source = MappingConstants.ANY_REMAINING)
    TalkDTO.Type toDTO(Talk.Type type);
}
