package net.fiscma.wazenhof.warzenhofbackend.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BaseService<T> {

    List<T> findAll();

    T get(Long id);

    T create(T entity);

     void delete(Long id);
}
