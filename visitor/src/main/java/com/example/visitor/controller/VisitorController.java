package com.example.visitor.controller;

import com.example.visitor.model.Visitor;
import com.example.visitor.service.VisitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("api/v1/visitor-count-app/username/")
public class VisitorController {

    @Autowired
    private VisitorService visitorservice;
@GetMapping(value=("{username}/count"))
    public Visitor visitor(@PathVariable String username){
        return visitorservice.visitorCount(username);
    }


}

