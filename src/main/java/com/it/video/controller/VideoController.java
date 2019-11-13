package com.it.video.controller;

import com.it.video.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VideoController {

    @Autowired
    private VideoService service;

    @RequestMapping("find_all")
    public Object findAll(){
        return service.getAll();
    }
}
