package com.project2.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/photos")
public class UploadPhotosController {
    @PostMapping("/upload")
    public String uploadPhotos(){
        return "done";
    }
}
