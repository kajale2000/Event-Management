package com.multigenesys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multigenesys.dao.EventRepository;
import com.multigenesys.model.Event;
import com.multigenesys.model.Venue;
import com.multigenesys.model.Organizer;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        return eventRepository.save(event);
    }

    @Override
    public List<Event> getAllEvents() {
        return eventRepository.findAll();
    }

    @Override
    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    @Override
    public Event updateEvent(Long id, Event event) {
        event.setId(id);
        return eventRepository.save(event);
    }

    @Override
    public void deleteEvent(Long id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<Event> getEventByVenue(Long venueId) {
        Venue venue = new Venue();
        venue.setId(venueId);
        return eventRepository.findByVenue(venue);
    }

    @Override
    public List<Event> getEventsByOrganizer(Long organizerId) {
        Organizer organizer = new Organizer();
        organizer.setId(organizerId);
        return eventRepository.findByOrganizer(organizer);
    }
}
