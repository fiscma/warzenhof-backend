package net.fiscma.wazenhof.warzenhofbackend.service.impl;

import net.fiscma.wazenhof.warzenhofbackend.repository.BaseRepository;
import net.fiscma.wazenhof.warzenhofbackend.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseRepository<T, Long> repository;

    @Override
    public void save(T entity) {
        repository.save(entity);
    }

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void delete(T entity) {
        repository.delete(entity);
    }
}
