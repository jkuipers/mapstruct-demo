package nl.trifork.mapstructdemo;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.MappingTarget;
import org.mapstruct.ValueMapping;

import java.time.Duration;

@Mapper(uses = SharedMapper.class)
public interface TalkMapper {

    @Mapping(target = "room", source = "location.name")
    @Mapping(target = "durationInMinutes", ignore = true)
    TalkDTO toDTO(Talk talk);

    void updateTalkDTO(Talk talk, @MappingTarget TalkDTO dto);

    @AfterMapping
    default void duration(Talk talk, @MappingTarget TalkDTO dto) {
        Duration duration = talk.getDuration();
        if (duration != null) dto.setDurationInMinutes(duration.toMinutes());
    }

    @ValueMapping(target = "OTHER", source = MappingConstants.ANY_REMAINING)
    TalkDTO.Type toDTO(Talk.Type type);
}
