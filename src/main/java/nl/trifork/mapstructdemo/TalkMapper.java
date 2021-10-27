package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;

@Mapper
public interface TalkMapper {

    TalkDTO toDTO(Talk talk);

}
