package com.koreait.day1.controller;

import com.koreait.day1.model.MultiParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PostController {
    // localhost:9090/api/postMethod
    @PostMapping(value="/postMetod")
    public MultiParam postMethod(@RequestBody MultiParam multiParam){


        return multiParam;
    }
    @PutMapping("/putMethod")
    public void put(){

    }
    @PatchMapping("/patchMethod")
    public void patch(){

    }
    @DeleteMapping("daleteMethod")
    public void delete(){

    }
}
