package com.example.springpractice2.repository;

import com.example.springpractice2.entity.PropertyEntity;
import org.springframework.data.repository.CrudRepository;


public interface PropertyRepository extends CrudRepository<PropertyEntity, Long> {

    
}