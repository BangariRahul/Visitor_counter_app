package com.example.visitor.service;

import com.example.visitor.model.Visitor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class VisitorService {

    HashMap< String , Integer > map = new HashMap<>();

     public Visitor visitorCount(String name){
         map.put(name, map.getOrDefault(name,0)+1);
         Visitor visitor = new Visitor(name , map.get(name));
         return visitor;

     }
}
