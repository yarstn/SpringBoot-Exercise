package com.example.dayone;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Controller {
    @GetMapping("/hi") //run the Endpoint is the method
    public String welcome(){
        return " HELLO WORLD NAJD";
    }
    @GetMapping("/name") //run the Endpoint is the method
    public String name(){
        return "MY NAME IS: YARA ALFAWAZ";
    }
    @GetMapping("/age") //run the Endpoint is the method
    public int age(){
        System.out.println("MY AGE IS: ");
        return 25;
    }
    @GetMapping("/check/status") //run the Endpoint is the method
    public String checkStatus(){
        return "MY STATUS IS: Everything OK";
    }
    @GetMapping("/health") //run the Endpoint is the method
    public String health(){
        return "Server health is up and running";
    }
    @GetMapping("/names") //run the Endpoint is the method
    public String[] names(){
        ArrayList<String> names = new ArrayList<>();
        names.add("YARA");
        names.add("NAJD");
        names.add("SEHAM");
        names.add("SARA");

            return names.toArray(new String[0]);
    }
}
