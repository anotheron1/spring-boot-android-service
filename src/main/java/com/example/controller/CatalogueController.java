package com.example.controller;

import com.example.domain.Catalogue;
import com.example.repository.CatalogueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Collections;
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
//
//    @PostMapping("/AddCaffe")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Catalogue createNote(@Valid @RequestBody Catalogue caffe) {
//        return catalogueRepository.save(caffe);
//    }

    @RequestMapping("/index")
    public ModelAndView index () {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(method = RequestMethod.POST)
    public String createReview(@RequestParam String name, @RequestParam String address, @RequestParam String assortment, @RequestParam String image) {
        catalogueRepository.save(new Catalogue(name, address, assortment, image));

        return "redirect:/";
    }
}

