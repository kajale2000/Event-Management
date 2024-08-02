package com.multigenesys.service;

import java.util.List;

import com.multigenesys.model.Event;

public interface EventService {

	Event createEvent(Event event);
    List<Event> getAllEvents();
    Event getEventById(Long id);
    Event updateEvent(Long id, Event event);
    void deleteEvent(Long id);
    List<Event> getEventByVenue(Long venueId);
    List<Event> getEventsByOrganizer(Long organizerId);
	
}
