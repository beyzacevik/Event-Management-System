package com.yte.ActivityManagement.mapper;
import com.yte.ActivityManagement.model.Event;
import com.yte.ActivityManagement.web.dto.EventDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventMapper {
    EventDto mapToDto(Event event);

    List<EventDto> mapToDto(List<Event> eventList);

    Event mapToEntity(EventDto eventDto);
    List<Event> mapToEntity(List<EventDto> eventDtoList);

}
