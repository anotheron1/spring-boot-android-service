package com.example.controller;

import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/UsersAll")
public class UserController  {

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.GET)
    public List getAll() {
        return userRepository.findAll();
    }
}

//@RestController
//@RequestMapping("employees")
//public class EmployeeController {
//    Employee employee = new Employee();
//    @RequestMapping(value = "/{name}", method = RequestMethod.GET, produces = "application/json")
//    public Employee getEmployeeInJSON(@PathVariable String name) {
//        employee.setName(name);
//        employee.setEmail("employee1@genuitec.com");
//        return employee;
//    }
//    @RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
//    public Employee getEmployeeInXML(@PathVariable String name) {
//        employee.setName(name);
//        employee.setEmail("employee1@genuitec.com");
//        return employee;
//    }
//}