package com.suneth.springbootdocker.controller;

import com.suneth.springbootdocker.entity.DemoEntity;
import com.suneth.springbootdocker.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class DockerController {

    @Autowired
    DemoRepo demoRepo;

    @GetMapping
    public String dockerMethod() {
        return "docker is running";
    }

    @PostMapping("/all")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity) {
        DemoEntity resultEntity = demoRepo.save(entity);
        return new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<DemoEntity>> getAll() {
        List<DemoEntity> demoEntityList = demoRepo.findAll();
        return new ResponseEntity<>(demoEntityList, HttpStatus.OK);
    }
}
