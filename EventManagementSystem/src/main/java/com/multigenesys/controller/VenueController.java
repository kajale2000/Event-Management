package com.multigenesys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.multigenesys.model.Venue;
import com.multigenesys.service.VenueService;

@RestController
@RequestMapping("/venues")
public class VenueController {

	 	@Autowired
	    private VenueService venueService;

	    @PostMapping
	    public Venue createVenue(@RequestBody Venue venue) {
	        return venueService.createVenue(venue);
	    }

	    @GetMapping("/{id}")
	    public Venue getVenueById(@PathVariable Long id) {
	        return venueService.getVenueById(id);
	    }

	    @PutMapping("/{id}")
	    public Venue updateVenue(@PathVariable Long id, @RequestBody Venue venue) {
	        return venueService.updateVenue(id, venue);
	    }

	    @DeleteMapping("/{id}")
	    public void deleteVenue(@PathVariable Long id) {
	        venueService.deleteVenue(id);
	    }
}
