package com.restaurant.Repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.entities.Resort;

@Repository
public interface ResortRepository extends CrudRepository<Resort,Integer> {

}
