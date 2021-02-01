package com.cop.united.airlines.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cop.united.airlines.api.entites.AirlinesInfoEntity;

@Repository
public interface AirlinesRepository extends CrudRepository<AirlinesInfoEntity, String> {

}
