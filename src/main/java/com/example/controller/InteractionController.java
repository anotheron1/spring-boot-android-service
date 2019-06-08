package com.example.controller;

import com.example.domain.Interaction;
import com.example.repository.InteractionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/Interaction")
public class InteractionController {
    @Autowired
    InteractionRepository interactionRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List getAll() {
        return interactionRepository.findAll();
    }

//    @Override
//    @RequestMapping(method = RequestMethod.POST)
//    public Interaction getByCaffe_id(String caffe_id) {
//        return interactionRepository.findByCaffe_id(caffe_id);
//    }

    @GetMapping("/GetMenu")
    public Interaction GetMenu(@RequestParam(value = "caffe_id", required = false) String caffe_id, @RequestParam(value = "client_id", required = false) String client_id) {
        return interactionRepository.findByCaffe_id(caffe_id, client_id);
    }

    @GetMapping("/FillCup")
    public Interaction updateNote(@RequestParam(value = "caffe_id", required = false) String caffe_id, @RequestParam(value = "client_id", required = false) String client_id) {
        Interaction intr = interactionRepository.findByCaffe_id(caffe_id, client_id);
        int all = Integer.parseInt(intr.getAll_cup());
        int fill_cup_add = Integer.parseInt(intr.getFill_cup());
        if (fill_cup_add +1 <= all) {
            int new_cup = Integer.parseInt(intr.getFill_cup()) + 1;
            intr.setFill_cup(Integer.toString(new_cup));
            return interactionRepository.save(intr);
        } else
        {
            intr.setFill_cup("1");
            return interactionRepository.save(intr);
        }
    }

//    @GetMapping("/FillCup/{id}")
//    public Interaction getId(@PathVariable(value = "id") Long id) {
//        return interactionRepository.findById(id);
//    }
//
//    @PutMapping("/FillCup/{id}")
//    public Interaction putId(@PathVariable(value = "id") Long id, @RequestBody final Interaction interactionDetails) {
//        Interaction book = interactionRepository.findById(id);
//        book.setFill_cup(interactionDetails.getFill_cup());
//        Interaction updatedBook = interactionRepository.save(book);
//        return updatedBook;
//    }
}
