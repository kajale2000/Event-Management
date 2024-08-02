package com.multigenesys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multigenesys.dao.OrganizerRepository;
import com.multigenesys.model.Organizer;

@Service
public class OrganizerServiceImpl implements OrganizerService {

    @Autowired
    private OrganizerRepository organizerRepository;

    @Override
    public Organizer createOrganizer(Organizer organizer) {
        return organizerRepository.save(organizer);
    }

    @Override
    public Organizer getOrganizerById(Long id) {
        return organizerRepository.findById(id).orElse(null);
    }

    @Override
    public Organizer updateOrganizer(Long id, Organizer organizer) {
        organizer.setId(id);
        return organizerRepository.save(organizer);
    }

    @Override
    public void deleteOrganizer(Long id) {
        organizerRepository.deleteById(id);
    }
}
