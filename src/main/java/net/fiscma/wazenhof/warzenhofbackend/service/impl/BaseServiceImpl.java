package net.fiscma.wazenhof.warzenhofbackend.service.impl;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import net.fiscma.wazenhof.warzenhofbackend.repository.BaseRepository;
import net.fiscma.wazenhof.warzenhofbackend.service.BaseService;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.NoSuchElementException;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
@Transactional
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    private BaseRepository<T, Long> repository;

    @Override
    public List<T> findAll() {
        return repository.findAll();
    }

    @Override
    public T get(Long id)  {
        return repository.findById(id).orElseThrow(
          () -> {
              throw new ResponseStatusException(HttpStatus.NOT_FOUND);
          }
        );
    }

    @Override
    public T create(T entity) {
        return repository.save(entity);
    }

    @Override
    public void delete(Long id) {
        T entityToDelete = get(id);
        repository.delete(entityToDelete);
    }
}
