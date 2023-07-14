package net.fiscma.wazenhof.warzenhofbackend.rest.controller.impl;

import net.fiscma.wazenhof.warzenhofbackend.rest.controller.BaseRestController;
import net.fiscma.wazenhof.warzenhofbackend.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

public abstract class BaseRestControllerImpl<T> implements BaseRestController<T> {
    protected final static String MAPPING_FIND_ALL = "get";
    protected final static String MAPPING_FIND_BY_ID = "get/{id}";
    protected final static String MAPPING_DELETE = "delete/{id}";
    protected final static String MAPPING_SAVE = "save";


    @Autowired
    protected BaseService<T> service;

    @Override
    @GetMapping("")
    public ResponseEntity<Page<T>> findAll() {
        return null;
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<T> findById(@PathVariable Long id) {
        return null;
    }

    @Override
    @PostMapping("")
    public ResponseEntity<T> save(@RequestBody T entity) {
        return null;
    }

    @Override
    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long id) {
        return null;
    }
}
