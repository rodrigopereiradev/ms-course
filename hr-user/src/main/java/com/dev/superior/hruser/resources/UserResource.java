package com.dev.superior.hruser.resources;

import com.dev.superior.hruser.entities.User;
import com.dev.superior.hruser.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @Autowired
    private UserRepository repository;

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findOne(@PathVariable Long id) {
        User worker = repository.findById(id).get();
        return ResponseEntity.ok(worker);
    }

    @GetMapping(value = "/search")
    public ResponseEntity<User> findOne(@RequestParam String email) {
        User worker = repository.findByEmail(email);
        return ResponseEntity.ok(worker);
    }

}
