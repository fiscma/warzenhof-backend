package net.fiscma.wazenhof.warzenhofbackend.rest.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseRestController<T> {

    public ResponseEntity<Page<T>> findAll();

    public ResponseEntity<T> findById(Long id);

    public ResponseEntity<Boolean> delete(Long id);

    public ResponseEntity<T> save(T entity);
}
