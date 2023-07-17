package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.rest.controller.BaseRestController;
import net.fiscma.wazenhof.warzenhofbackend.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseRestControllerImpl<T> implements BaseRestController<T> {
    protected final static String MAPPING_FIND_ALL = "get";
    protected final static String MAPPING_FIND_BY_ID = "get/{id}";
    protected final static String MAPPING_DELETE = "delete/{id}";
    protected final static String MAPPING_SAVE = "save";


    @Autowired
    protected BaseService<T> service;

    @Override
    @GetMapping(path = "", produces = "application/json")
    public ResponseEntity<List<T>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @Override
    @GetMapping(path ="/{id}", produces = "application/json")
    public ResponseEntity<T> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.get(id));
    }

    @Override
    @PostMapping(path="", produces = "application/json")
    public ResponseEntity<T> save(@RequestBody T entity) {
        return ResponseEntity.ok(service.create(entity));
    }

    @Override
    @DeleteMapping(path="/{id}", produces = "application/json")
    public ResponseEntity<String> delete(@PathVariable Long id) {
       service.delete(id);
       return ResponseEntity.ok("OK");
    }
}
