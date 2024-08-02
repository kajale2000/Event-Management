package com.multigenesys.service;

import com.multigenesys.model.Venue;

public interface VenueService {

	 Venue createVenue(Venue venue);
	 Venue getVenueById(Long id);
	 Venue updateVenue(Long id, Venue venue);
	 void deleteVenue(Long id);
	
}
