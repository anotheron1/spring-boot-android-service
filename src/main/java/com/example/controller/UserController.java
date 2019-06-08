package com.example.controller;

import com.example.View;
import com.example.domain.User;
import com.example.repository.UserRepository;
import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController  {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/Users")
    public List getAll() {
        return userRepository.findAll();
    }

    @PostMapping("/Users")
    public User createNote(@Valid @RequestBody User user) {
        return userRepository.save(user);
    }

    @JsonView(View.Summary.class)
    @GetMapping("/Users/{email:.+@.+\\..+}")
    public User getNoteByEmail(@PathVariable(value = "email") String email) {
        return userRepository.findByEmail(email);
    }
}