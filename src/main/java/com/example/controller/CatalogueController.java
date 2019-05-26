package com.example.controller;

import com.example.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/Catalogue")
public class CatalogueController  {

    @Autowired
    CatalogueRepository catalogueRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List getAll() {
        return catalogueRepository.findAll();
    }
}

