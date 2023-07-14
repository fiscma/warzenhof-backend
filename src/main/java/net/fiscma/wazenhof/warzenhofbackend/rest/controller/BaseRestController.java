package net.fiscma.wazenhof.warzenhofbackend.rest.controller;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface BaseRestController<T> {

    ResponseEntity<List<T>> findAll();

    ResponseEntity<T> findById(Long id);

    ResponseEntity<String> delete(Long id);

    ResponseEntity<T> save(T entity);

}
