package com.devsuperior.hrworker.resources;

import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.repositories.WokerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResource {

    @Autowired
    private WokerRepository repository;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll() {
        List<Worker> workers = repository.findAll();
        return ResponseEntity.ok(workers);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker > findOne(@PathVariable Long id) {
        Worker worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }

}
