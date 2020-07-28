package com.yte.ActivityManagement.service;

import com.yte.ActivityManagement.model.Event;
import com.yte.ActivityManagement.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ManageEventService {

    private final EventRepository eventRepository;

    public List<Event> listAllEvents(){

        return eventRepository.findAll();
    }



    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }
}
