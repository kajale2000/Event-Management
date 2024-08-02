package com.multigenesys.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multigenesys.model.Event;
import com.multigenesys.model.Organizer;
import com.multigenesys.model.Venue;
@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
	
    List<Event> findByVenue(Venue venue);
    List<Event> findByOrganizer(Organizer organizer);
}
