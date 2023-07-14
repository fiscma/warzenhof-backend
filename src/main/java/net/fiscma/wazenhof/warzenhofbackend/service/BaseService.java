package net.fiscma.wazenhof.warzenhofbackend.service;

import java.util.List;

public interface BaseService<T> {

    public void save(T entity);

    public List<T> findAll();

    public T findById(Long id);

    public void delete(T entity);
}
