package com.multigenesys.service;

import com.multigenesys.model.Organizer;

public interface OrganizerService {

	Organizer createOrganizer(Organizer organizer);
	Organizer getOrganizerById(Long id);
	Organizer updateOrganizer(Long id, Organizer organizer);
	void deleteOrganizer(Long id);
}
