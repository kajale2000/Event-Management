package com.multigenesys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.multigenesys.model.Venue;
@Repository
public interface VenueRepository extends JpaRepository<Venue, Long>{

}
