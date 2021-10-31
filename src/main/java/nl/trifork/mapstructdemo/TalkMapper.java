package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;
import org.mapstruct.ValueMapping;

import java.net.URI;

@Mapper
public interface TalkMapper {

    @Mapping(target = "room", source = "location.name")
    TalkDTO toDTO(Talk talk);

    default String fromURI(URI uri) {
        return uri == null ? null : uri.toString();
    }

    @ValueMapping(target = "OTHER", source = MappingConstants.ANY_REMAINING)
    TalkDTO.Type toDTO(Talk.Type type);
}
