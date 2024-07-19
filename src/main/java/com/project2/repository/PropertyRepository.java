package com.project2.repository;

import com.project2.entity.Property;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface PropertyRepository extends JpaRepository<Property, Long> {


    @Query("Select p  from Property p JOIN Location l on p.location=l.id where l.name=:locationName")
    List<Property> searchProperty(@Param("locationName") String locationName);


}