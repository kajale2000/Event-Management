package com.multigenesys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multigenesys.model.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizer, Long> {

}
