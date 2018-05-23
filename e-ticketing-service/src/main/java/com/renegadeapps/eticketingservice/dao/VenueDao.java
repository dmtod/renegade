package com.renegadeapps.eticketingservice.dao;

import com.renegadeapps.eticketingservice.model.Venue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueDao extends CrudRepository<Venue, Long> {

}
