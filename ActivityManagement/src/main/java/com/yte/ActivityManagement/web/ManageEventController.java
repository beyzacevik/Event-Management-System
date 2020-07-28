package com.yte.ActivityManagement.web;

import com.yte.ActivityManagement.mapper.EventMapper;
import com.yte.ActivityManagement.model.Event;
import com.yte.ActivityManagement.service.ManageEventService;
import com.yte.ActivityManagement.web.dto.EventDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ManageEventController {

    private final ManageEventService manageEventService;
    private final EventMapper eventMapper;
    @GetMapping("/events")
    public List<EventDto> listAllEvents(){

        List<Event> events = manageEventService.listAllEvents();
        return eventMapper.mapToDto(events);

    }

    @PostMapping("/events")
    public EventDto addEvent(@RequestBody EventDto eventDto){

        Event event = eventMapper.mapToEntity(eventDto);
        Event addedEvent = manageEventService.addEvent(event);
        return eventMapper.mapToDto(addedEvent);

    }




}
