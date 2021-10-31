package nl.trifork.mapstructdemo;

import org.mapstruct.Mapper;

import java.net.URI;

@Mapper
public abstract class SharedMapper {
    public String fromURI(URI uri) {
        return uri == null ? null : uri.toString();
    }
}
