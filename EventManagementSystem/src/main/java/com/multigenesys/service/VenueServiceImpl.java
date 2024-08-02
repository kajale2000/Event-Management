package com.multigenesys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multigenesys.dao.VenueRepository;
import com.multigenesys.model.Venue;

@Service
public class VenueServiceImpl implements VenueService {

    @Autowired
    private VenueRepository venueRepository;

    @Override
    public Venue createVenue(Venue venue) {
        return venueRepository.save(venue);
    }

    @Override
    public Venue getVenueById(Long id) {
        return venueRepository.findById(id).orElse(null);
    }

    @Override
    public Venue updateVenue(Long id, Venue venue) {
        venue.setId(id);
        return venueRepository.save(venue);
    }

    @Override
    public void deleteVenue(Long id) {
        venueRepository.deleteById(id);
    }
}
