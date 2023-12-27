package com.example.springpractice2.service.impl;

import com.example.springpractice2.service.PropertyService;
import com.example.springpractice2.repository.PropertyRepository;
import com.example.springpractice2.converter.PropertyConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PropertyServiceImpl implements PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;
   
}