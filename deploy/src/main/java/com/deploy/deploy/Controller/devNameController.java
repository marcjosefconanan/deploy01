package com.deploy.deploy.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/nome")
public class devNameController {
    @GetMapping("/get")
    public ResponseEntity<String> getnome(){
        return ResponseEntity.ok().body("marc");
    }
}
